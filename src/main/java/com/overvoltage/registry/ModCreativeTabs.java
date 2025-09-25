package com.ov.registry;

import com.ov.Overvoltage;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Overvoltage.MODID);

    public static final RegistryObject<CreativeModeTab> OVERVOLTAGE_TAB =
            CREATIVE_MODE_TABS.register("overvoltage_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.overvoltage_tab")) // локализация
                            .icon(() -> new ItemStack(ModItems.RAW_TITANIUM.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.RAW_TITANIUM.get());
                                output.accept(ModItems.WATER_BOTTLE.get());
                                output.accept(ModBlocks.TITANIUM_BLOCK_ITEM.get());
                            })
                            .build()
            );
}
