package com.overvoltage.config;

import com.google.gson.*;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.server.ServerLifecycleHooks;

import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ModConfig {
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping()
            .create();

    private Path configPath;
    private JsonObject configData;
    private JsonObject comments;
    private JsonObject hotReloadFlags;

    private final Map<String, Object> cachedValues = new ConcurrentHashMap<>();

    private final List<ConfigReloadListener> reloadListeners = new ArrayList<>();

    public ModConfig(String modId) {
        this.configPath = Paths.get("config", modId + ".json");
        this.configData = new JsonObject();
        this.comments = new JsonObject();
        this.hotReloadFlags = new JsonObject();
        loadOrCreateConfig();
    }

    public void addHotReloadConfigValue(String category, String key, Object value, String description) {
        addConfigValue(category, key, value, description);
        setHotReloadFlag(category, key, true);
    }

    public void addConfigValue(String category, String key, Object value, String description) {
        if (!configData.has(category)) {
            configData.add(category, new JsonObject());
        }

        JsonObject categoryObj = configData.getAsJsonObject(category);

        if (value instanceof String) {
            categoryObj.addProperty(key, (String) value);
        } else if (value instanceof Number) {
            categoryObj.addProperty(key, (Number) value);
        } else if (value instanceof Boolean) {
            categoryObj.addProperty(key, (Boolean) value);
        }

        if (!comments.has(category)) {
            comments.add(category, new JsonObject());
        }

        JsonObject categoryComments = comments.getAsJsonObject(category);
        categoryComments.addProperty(key, description);

        String fullKey = category + "." + key;
        cachedValues.put(fullKey, value);
    }

    public void setHotReloadFlag(String category, String key, Boolean hotReloadable) {
        if (!hotReloadFlags.has(category)) {
            hotReloadFlags  .add(category, new JsonObject());
        }

        JsonObject categoryFlags = hotReloadFlags.getAsJsonObject(category);
        categoryFlags.addProperty(key, hotReloadable);
    }

    public boolean isHotReloadable(String category, String key) {
        if (hotReloadFlags.has(category)) {
            JsonObject categoryFlags = hotReloadFlags.getAsJsonObject(category);
            if (categoryFlags.has(key)) {
                return categoryFlags.get(key).getAsBoolean();
            }
        }
        return false;
    }

    private void loadOrCreateConfig() {
        if (configPath.toFile().exists()) {
            loadConfig();
        } else {
            createDefaultConfig();
            saveConfig();
        }
    }

    private void loadConfig() {
        try (FileReader reader = new FileReader(configPath.toFile())) {
            JsonObject fullConfig = JsonParser.parseReader(reader).getAsJsonObject();

            if (fullConfig.has("_comments")) {
                comments = fullConfig.getAsJsonObject("_comments");
                fullConfig.remove("_comments");
            }

            if (fullConfig.has("_hotreload")) {
                hotReloadFlags = fullConfig.getAsJsonObject("_hotreload");
                fullConfig.remove("_hotreload");
            }

            configData = fullConfig;

            cacheAllValues();
        } catch (Exception e) {
            System.err.println("Loading config error" + e.getMessage());
            createDefaultConfig();
        }
    }

    private void cacheAllValues() {
        cachedValues.clear();
        for (Map.Entry<String, JsonElement> categoryEntry : configData.entrySet()) {
            if (categoryEntry.getValue().isJsonObject()) {
                JsonObject categoryObj = categoryEntry.getValue().getAsJsonObject();
                for (Map.Entry<String, JsonElement> keyEntry : categoryObj.entrySet()) {
                    String fullKey = categoryEntry.getKey() + "." + keyEntry.getKey();
                    cachedValues.put(fullKey, parseJsonValue(keyEntry.getValue()));
                }
            }
        }
    }

    private Object parseJsonValue(JsonElement element) {
        if (element.isJsonPrimitive()) {
            JsonPrimitive primitive = element.getAsJsonPrimitive();
            if (primitive.isString()) {
                return primitive.getAsString();
            } else if (primitive.isNumber()) {
                return primitive.getAsNumber();
            } else if (primitive.isBoolean()) {
                return primitive.getAsBoolean();
            }
        }
        return null;
    }

    private void createDefaultConfig() {

    }

    private void reloadConfig() {
        reloadConfig(false);
    }

    public void reloadConfig(Boolean notifyPlayers) {
        try {
            Map<String, Object> oldValues = new HashMap<>(cachedValues);

            loadConfig();

            List<String> changedHotReloadables = new ArrayList<>();
            for (Map.Entry<String, Object> entry : cachedValues.entrySet()) {
                String key = entry.getKey();
                Object newValue = entry.getValue();
                Object oldValue = oldValues.get(key);

                String[] parts = key.split("\\.");
                if (parts.length == 2) {
                    String category = parts[0];
                    String configKey = parts[1];

                    if (isHotReloadable(category, configKey) &&
                        !Objects.equals(newValue, oldValue)) {
                        changedHotReloadables.add(key);
                    }
                }
            }

            if (!changedHotReloadables.isEmpty()) {
                for (ConfigReloadListener listener : reloadListeners) {
                    listener.onConfigReload(changedHotReloadables);
                }
            }

            if (notifyPlayers) {
                notifyPlayersAboutReload(changedHotReloadables);
            }

        } catch (Exception e) {
            System.err.println("Error of reloading config: " + e.getMessage());
        }
    }

    private void notifyPlayersAboutReload(List<String> changedParams) {
        var server = ServerLifecycleHooks.getCurrentServer();
        if (server != null) {
            var message = Component.literal("[OverVoltage] ")
                    .withStyle(ChatFormatting.GREEN)
                    .append(Component.translatable("message.overvoltage.reload_config.success1")
                            .withStyle(ChatFormatting.WHITE));

            if (changedParams.isEmpty()) {
                message = message.append(Component.translatable("message.overvoltage.reload_config.no").withStyle(ChatFormatting.GRAY));
            } else {
                message = message.append(Component.literal(String.join(", ", changedParams))
                        .withStyle(ChatFormatting.YELLOW));
            }

            server.getPlayerList().broadcastSystemMessage(message, false);
        }
    }

    public void saveConfig() {
        try {
            JsonObject fullConfig = new JsonObject();

            if (comments.size() > 0) {
                fullConfig.add("_hotreload", hotReloadFlags);
            }

            for (Map.Entry<String, JsonElement> entry : configData.entrySet()) {
                fullConfig.add(entry.getKey(), entry.getValue());
            }

            configPath.getParent().toFile().mkdirs();

            try (FileWriter writer = new FileWriter(configPath.toFile())) {
                GSON.toJson(fullConfig, writer);
            }
        } catch (Exception e) {
            System.err.println("Saving config error: " + e.getMessage());
        }
    }

    public <T> T getConfigValue(String category, String key, Class<T> type) {
        String fullKey = category + "." + key;
        Object value = cachedValues.get(fullKey);

        if (value != null && type.isInstance(value)) {
            return type.cast(value);
        }

        if (configData.has(category)) {
            JsonObject categoryObj = configData.getAsJsonObject(category);
            if (categoryObj.has(key)) {
                JsonElement element = categoryObj.get(key);
                return GSON.fromJson(element, type);
            }
        }
        return null;
    }

    public void assReloadListener(ConfigReloadListener listener) {
        reloadListeners.add(listener);
    }

    public interface ConfigReloadListener {
        void onConfigReload(List<String> changedHotReloadableParams);
    }
}
