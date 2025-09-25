package com.ov;

import com.mojang.logging.LogUtils;
import com.ov.registry.ModBlocks;
import com.ov.registry.ModItems;
import com.ov.registry.ModCreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Overvoltage.MODID)
public class Overvoltage {
    public static final String MODID = "overvoltage";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Overvoltage() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Регистрируем всё из отдельных классов
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        // Общая настройка
        modEventBus.addListener(this::commonSetup);

        // Подключаем ивенты Forge
        MinecraftForge.EVENT_BUS.register(this);

        // Конфиг
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Overvoltage >> Common Setup completed");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Overvoltage >> Server starting");
    }
}
