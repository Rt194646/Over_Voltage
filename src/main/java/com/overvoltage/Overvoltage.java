package com.overvoltage;

import com.mojang.logging.LogUtils;

import com.overvoltage.config.ModConfig;
import com.overvoltage.registry.ModBlocks;
import com.overvoltage.registry.ModItems;
import com.overvoltage.registry.ModCreativeTabs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Overvoltage.MODID)
public class Overvoltage {
    public static final String MODID = "overvoltage";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ModConfig CONFIG;

    public Overvoltage() {
        LOGGER.info("Overvoltage >> Init'ing Mod...");

        initConfig();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Регистрируем всё из отдельных классов
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        // Общая настройка
        modEventBus.addListener(this::commonSetup);

        // Подключаем ивенты Forge
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("Overvoltage >> Mod init completed");
    }

    private void initConfig() {
        try {
            LOGGER.info("Overvoltage >> Init'ing configuration...");
            CONFIG = new ModConfig(MODID);
            LOGGER.info("Overvoltage >> Configuration loaded successfully");
        } catch (Exception e) {
            LOGGER.error("Overvoltage >> Failed to init configuration: {}", e.getMessage());
            CONFIG = new ModConfig(MODID);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Overvoltage >> Starting common setup...");

        if (CONFIG != null) {
            LOGGER.info("Overvoltage >> Config values loaded:");
            // LOGGER.info("Overvoltage >> Base voltage: {}", CONFIG.getEnergyBaseVoltage());
        }

        LOGGER.info("Overvoltage >> Common setup completed");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Overvoltage >> Server starting");
    }

    public static ModConfig getConfig() {
        return CONFIG;
    }
}
