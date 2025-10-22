package com.overvoltage.registry;

import com.overvoltage.Overvoltage;
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
                            .title(Component.translatable("creativetab.overvoltage.overvoltage_tab")) // локализация
                            .icon(() -> new ItemStack(ModItems.RAW_TITANIUM.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.RAW_TITANIUM.get());
                                output.accept(ModItems.WATER_BOTTLE.get());
                                output.accept(ModBlocks.TITANIUM_BLOCK_ITEM.get());
                            })
                            .build()
            );

    public static final RegistryObject<CreativeModeTab> NTM_TEMPLATES_TAB =
            CREATIVE_MODE_TABS.register("ntm_templates_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.overvoltage.ntm_templates_tab"))
                            .icon(() -> new ItemStack(ModItems.HARD_DRIVE.get()))
                            .withSearchBar()
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.HARD_DRIVE.get());
                            })
                            .build()
            );

    public static final RegistryObject<CreativeModeTab> NTM_MACHINES_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("ntm_machines_items_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.overvoltage.ntm_machines_items_tab"))
                            .icon(() -> new ItemStack(ModItems.PELLET_RTG.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.PELLET_RTG_RADIUM.get());
                                output.accept(ModItems.PELLET_RTG_WEAK.get());
                                output.accept(ModItems.PELLET_RTG.get());
                                output.accept(ModItems.PELLET_RTG_STRONTIUM.get());
                                output.accept(ModItems.PELLET_RTG_COBALT.get());
                                output.accept(ModItems.PELLET_RTG_ACTINIUM.get());
                                output.accept(ModItems.PELLET_RTG_POLONIUM.get());
                                output.accept(ModItems.PELLET_RTG_AMERICIUM.get());
                                output.accept(ModItems.PELLET_RTG_BERKELIUM.get());
                                output.accept(ModItems.PELLET_RTG_GOLD.get());
                                output.accept(ModItems.PELLET_RTG_LEAD.get());
                                output.accept(ModItems.PELLET_RTG_CF251.get());
                                output.accept(ModItems.PELLET_RTG_CF252.get());
                                output.accept(ModItems.PELLET_RTG_DEPLETED.get());
                                output.accept(ModItems.PELLET_CLUSTER.get());
                                output.accept(ModItems.PELLET_BUCKSHOT.get());
                                output.accept(ModItems.PELLET_CHARGED.get());
                                output.accept(ModItems.PELLET_GAS.get());
                                output.accept(ModItems.PELLET_ANTIMATTER.get());
                                output.accept(ModItems.RBMK_PELLET_UEU.get());
                                output.accept(ModItems.RBMK_PELLET_MEU.get());
                                output.accept(ModItems.RBMK_PELLET_HEU233.get());
                                output.accept(ModItems.RBMK_PELLET_HEU235.get());
                                output.accept(ModItems.RBMK_PELLET_THMEU.get());
                                output.accept(ModItems.RBMK_PELLET_LEP.get());
                                output.accept(ModItems.RBMK_PELLET_MEP.get());
                                output.accept(ModItems.RBMK_PELLET_HEP239.get());
                                output.accept(ModItems.RBMK_PELLET_HEP241.get());
                                output.accept(ModItems.RBMK_PELLET_LEA.get());
                                output.accept(ModItems.RBMK_PELLET_MEA.get());
                                output.accept(ModItems.RBMK_PELLET_HEA241.get());
                                output.accept(ModItems.RBMK_PELLET_HEA242.get());
                                output.accept(ModItems.RBMK_PELLET_BK247.get());
                                output.accept(ModItems.RBMK_PELLET_MEN.get());
                                output.accept(ModItems.RBMK_PELLET_HEN.get());
                                output.accept(ModItems.RBMK_PELLET_MOX.get());
                                output.accept(ModItems.RBMK_PELLET_LES.get());
                                output.accept(ModItems.RBMK_PELLET_MES.get());
                                output.accept(ModItems.RBMK_PELLET_HES.get());
                                output.accept(ModItems.RBMK_PELLET_LEAUS.get());
                                output.accept(ModItems.RBMK_PELLET_HEAUS.get());
                                output.accept(ModItems.RBMK_PELLET_PO210BE.get());
                                output.accept(ModItems.RBMK_PELLET_RA226BE.get());
                                output.accept(ModItems.RBMK_PELLET_PU238BE.get());
                                output.accept(ModItems.RBMK_PELLET_BALEFIRE_GOLD.get());
                                output.accept(ModItems.RBMK_PELLET_FLASHLEAD.get());
                                output.accept(ModItems.RBMK_PELLET_BALEFIRE.get());
                                output.accept(ModItems.RBMK_PELLET_ZFB_BISMUTH.get());
                                output.accept(ModItems.RBMK_PELLET_ZFB_PU241.get());
                                output.accept(ModItems.RBMK_PELLET_ZFB_AM_MIX.get());
                                output.accept(ModItems.RBMK_PELLET_DRX.get());
                                output.accept(ModItems.RBMK_PELLET_LECM.get());
                                output.accept(ModItems.RBMK_PELLET_MECM.get());
                                output.accept(ModItems.RBMK_PELLET_HECM.get());
                                output.accept(ModItems.WATZ_PELLET.get());
                                output.accept(ModItems.WATZ_PELLET_DEPLETED.get());
                                output.accept(ModItems.ICF_PELLET_EMPTY.get());
                                output.accept(ModItems.ICF_PELLET.get());
                                output.accept(ModItems.ICF_PELLET_DEPLETED.get());

                            })
                            .build()
            );

    public static final RegistryObject<CreativeModeTab> NTM_RESOURCES_TAB =
            CREATIVE_MODE_TABS.register("ntm_resources_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.overvoltage.ntm_resources_tab"))
                            .icon(() -> new ItemStack(ModItems.INGOT_URANIUM.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.INGOT_URANIUM.get());
                                output.accept(ModItems.INGOT_U233.get());
                                output.accept(ModItems.INGOT_U235.get());
                                output.accept(ModItems.INGOT_U238.get());
                                output.accept(ModItems.INGOT_TH232.get());
                                output.accept(ModItems.INGOT_PLUTONIUM.get());
                                output.accept(ModItems.INGOT_PU238.get());
                                output.accept(ModItems.INGOT_PU239.get());
                                output.accept(ModItems.INGOT_PU240.get());
                                output.accept(ModItems.INGOT_PU241.get());
                                output.accept(ModItems.INGOT_PU_MIX.get());
                                output.accept(ModItems.INGOT_AM241.get());
                                output.accept(ModItems.INGOT_AM242.get());
                                output.accept(ModItems.INGOT_AM_MIX.get());
                                output.accept(ModItems.INGOT_CM242.get());
                                output.accept(ModItems.INGOT_CM243.get());
                                output.accept(ModItems.INGOT_CM244.get());
                                output.accept(ModItems.INGOT_CM245.get());
                                output.accept(ModItems.INGOT_CM246.get());
                                output.accept(ModItems.INGOT_CM247.get());
                                output.accept(ModItems.INGOT_CM_FUEL.get());
                                output.accept(ModItems.INGOT_CM_MIX.get());
                                output.accept(ModItems.INGOT_BK247.get());
                                output.accept(ModItems.INGOT_CF251.get());
                                output.accept(ModItems.INGOT_CF252.get());
                                output.accept(ModItems.INGOT_ES253.get());
                                output.accept(ModItems.INGOT_ES255.get());
                                output.accept(ModItems.INGOT_NEPTUNIUM.get());
                                output.accept(ModItems.INGOT_POLONIUM.get());
                                output.accept(ModItems.INGOT_TECHNETIUM.get());
                                output.accept(ModItems.INGOT_CO60.get());
                                output.accept(ModItems.INGOT_SR90.get());
                                output.accept(ModItems.INGOT_AU198.get());
                                output.accept(ModItems.INGOT_PB209.get());
                                output.accept(ModItems.INGOT_RA226.get());
                                output.accept(ModItems.INGOT_TITANIUM.get());
                                output.accept(ModItems.INGOT_NICKEL.get());
                                output.accept(ModItems.INGOT_COPPER.get());
                                output.accept(ModItems.INGOT_RED_COPPER.get());
                                output.accept(ModItems.INGOT_ADVANCED_ALLOY.get());
                                output.accept(ModItems.INGOT_ZINC.get());
                                output.accept(ModItems.INGOT_TUNGSTEN.get());
                                output.accept(ModItems.INGOT_GALLIUM.get());
                                output.accept(ModItems.INGOT_GAAS.get());
                                output.accept(ModItems.INGOT_TT.get());
                                output.accept(ModItems.INGOT_TTAS.get());
                                output.accept(ModItems.INGOT_IRIDIUM.get());
                                output.accept(ModItems.INGOT_PALLADIUM.get());
                                output.accept(ModItems.INGOT_ALUMINIUM.get());
                                output.accept(ModItems.INGOT_STEEL.get());
                                output.accept(ModItems.INGOT_STAINLESS.get());
                                output.accept(ModItems.INGOT_TCALLOY.get());
                                output.accept(ModItems.INGOT_CDALLOY.get());
                                output.accept(ModItems.INGOT_BISMUTH_BRONZE.get());
                                output.accept(ModItems.INGOT_ARSENIC_BRONZE.get());
                                output.accept(ModItems.INGOT_BSCCO.get());
                                output.accept(ModItems.INGOT_LEAD.get());
                                output.accept(ModItems.INGOT_BISMUTH.get());
                                output.accept(ModItems.INGOT_ARSENIC.get());
                                output.accept(ModItems.INGOT_CALCIUM.get());
                                output.accept(ModItems.INGOT_CADMIUM.get());
                                output.accept(ModItems.INGOT_TANTALIUM.get());
                                output.accept(ModItems.INGOT_SILICON.get());
                                output.accept(ModItems.INGOT_NIOBIUM.get());
                                output.accept(ModItems.INGOT_BERYLLIUM.get());
                                output.accept(ModItems.INGOT_COBALT.get());
                                output.accept(ModItems.INGOT_BORON.get());
                                output.accept(ModItems.INGOT_GRAPHITE.get());
                                output.accept(ModItems.INGOT_FIREBRICK.get());
                                output.accept(ModItems.INGOT_DURA_STEEL.get());
                                output.accept(ModItems.INGOT_POLYMER.get());
                                output.accept(ModItems.INGOT_BAKELITE.get());
                                output.accept(ModItems.INGOT_BIORUBBER.get());
                                output.accept(ModItems.INGOT_RUBBER.get());
                                output.accept(ModItems.INGOT_PC.get());
                                output.accept(ModItems.INGOT_PVC.get());
                                output.accept(ModItems.INGOT_MUD.get());
                                output.accept(ModItems.INGOT_MAGMA.get());
                                output.accept(ModItems.INGOT_CFT.get());
                                output.accept(ModItems.INGOT_SCHRARANIUM.get());
                                output.accept(ModItems.INGOT_SCHRABIDIUM.get());
                                output.accept(ModItems.INGOT_SCHRABIDATE.get());
                                output.accept(ModItems.INGOT_MAGNETIZED_TUNGSTEN.get());
                                output.accept(ModItems.INGOT_COMBINE_STEEL.get());
                                output.accept(ModItems.INGOT_SOLINIUM.get());
                                output.accept(ModItems.INGOT_GH336.get());
                                output.accept(ModItems.INGOT_CN989.get());
                                output.accept(ModItems.INGOT_URANIUM_FUEL.get());
                                output.accept(ModItems.INGOT_THORIUM_FUEL.get());
                                output.accept(ModItems.INGOT_PLUTONIUM_FUEL.get());
                                output.accept(ModItems.INGOT_NEPTUNIUM_FUEL.get());
                                output.accept(ModItems.INGOT_MOX_FUEL.get());
                                output.accept(ModItems.INGOT_AMERICIUM_FUEL.get());
                                output.accept(ModItems.INGOT_SCHRABIDIUM_FUEL.get());
                                output.accept(ModItems.INGOT_HES.get());
                                output.accept(ModItems.INGOT_LES.get());
                                output.accept(ModItems.INGOT_AUSTRALIUM.get());
                                output.accept(ModItems.INGOT_LANTHANIUM.get());
                                output.accept(ModItems.INGOT_ACTINIUM.get());
                                output.accept(ModItems.INGOT_DESH.get());
                                output.accept(ModItems.INGOT_FERROURANIUM.get());
                                output.accept(ModItems.INGOT_STARMETAL.get());
                                output.accept(ModItems.INGOT_GUNMETAL.get());
                                output.accept(ModItems.INGOT_WEAPONSTEEL.get());
                                output.accept(ModItems.INGOT_SATURNITE.get());
                                output.accept(ModItems.INGOT_EUPHEMIUM.get());
                                output.accept(ModItems.INGOT_DINEUTRONIUM.get());
                                output.accept(ModItems.INGOT_ELECTRONIUM.get());
                                output.accept(ModItems.INGOT_GWENIUM.get());
                                output.accept(ModItems.INGOT_SMORE.get());
                                output.accept(ModItems.INGOT_OSMIRIDIUM.get());
                                output.accept(ModItems.INGOT_HAFNIUM.get());
                                output.accept(ModItems.INGOT_STEEL_DUSTED.get());
                                output.accept(ModItems.INGOT_CHAINSTEEL.get());
                                output.accept(ModItems.INGOT_METEORITE.get());
                                output.accept(ModItems.INGOT_METEORITE_FORGED.get());
                                output.accept(ModItems.INGOT_PHOSPHORUS.get());
                                output.accept(ModItems.INGOT_ZIRCONIUM.get());
                                output.accept(ModItems.INGOT_SEMTEX.get());
                                output.accept(ModItems.INGOT_C4.get());
                                output.accept(ModItems.INGOT_FIBERGLASS.get());
                                output.accept(ModItems.INGOT_ASBESTOS.get());
                                output.accept(ModItems.INGOT_RAW.get());

                            })
                            .build()
            );
}
