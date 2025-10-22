package com.overvoltage.registry;

import com.overvoltage.Overvoltage;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Overvoltage.MODID);

    public static final RegistryObject<Item> RAW_TITANIUM =
            ITEMS.register("raw_titanium",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER_BOTTLE =
            ITEMS.register("water_bottle",
                    () -> new Item(new Item.Properties()));

    // Other

    public static final RegistryObject<Item> HARD_DRIVE =
            ITEMS.register("hard_drive",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARD_DRIVE_FULL =
            ITEMS.register("hard_drive_full",
                    () -> new Item(new Item.Properties().stacksTo(1)));

    // ingots

    public static final RegistryObject<Item> INGOT_URANIUM =
            ITEMS.register("ingot_uranium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_U233 =
            ITEMS.register("ingot_u233",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_U235 =
            ITEMS.register("ingot_u235",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_U238 =
            ITEMS.register("ingot_u238",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TH232 =
            ITEMS.register("ingot_th232",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PLUTONIUM =
            ITEMS.register("ingot_plutonium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PU238 =
            ITEMS.register("ingot_pu238",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PU239 =
            ITEMS.register("ingot_pu239",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PU240 =
            ITEMS.register("ingot_pu240",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PU241 =
            ITEMS.register("ingot_pu241",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PU_MIX =
            ITEMS.register("ingot_pu_mix",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_AM241 =
            ITEMS.register("ingot_am241",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_AM242 =
            ITEMS.register("ingot_am242",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_AM_MIX =
            ITEMS.register("ingot_am_mix",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM242 =
            ITEMS.register("ingot_cm242",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM243 =
            ITEMS.register("ingot_cm243",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM244 =
            ITEMS.register("ingot_cm244",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM245 =
            ITEMS.register("ingot_cm245",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM246 =
            ITEMS.register("ingot_cm246",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM247 =
            ITEMS.register("ingot_cm247",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM_FUEL =
            ITEMS.register("ingot_cm_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CM_MIX =
            ITEMS.register("ingot_cm_mix",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BK247 =
            ITEMS.register("ingot_bk247",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CF251 =
            ITEMS.register("ingot_cf251",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CF252 =
            ITEMS.register("ingot_cf252",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ES253 =
            ITEMS.register("ingot_es253",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ES255 =
            ITEMS.register("ingot_es255",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_NEPTUNIUM =
            ITEMS.register("ingot_neptunium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_POLONIUM =
            ITEMS.register("ingot_polonium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TECHNETIUM =
            ITEMS.register("ingot_technetium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CO60 =
            ITEMS.register("ingot_co60",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SR90 =
            ITEMS.register("ingot_sr90",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_AU198 =
            ITEMS.register("ingot_au198",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PB209 =
            ITEMS.register("ingot_pb209",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_RA226 =
            ITEMS.register("ingot_ra226",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TITANIUM =
            ITEMS.register("ingot_titanium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_NICKEL =
            ITEMS.register("ingot_nickel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_COPPER =
            ITEMS.register("ingot_copper",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_RED_COPPER =
            ITEMS.register("ingot_red_copper",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ADVANCED_ALLOY =
            ITEMS.register("ingot_advanced_alloy",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ZINC =
            ITEMS.register("ingot_zinc",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TUNGSTEN =
            ITEMS.register("ingot_tungsten",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_GALLIUM =
            ITEMS.register("ingot_gallium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_GAAS =
            ITEMS.register("ingot_gaas",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_TT =
            ITEMS.register("ingot_tt",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.YELLOW);
                        }
                    });
    public static final RegistryObject<Item> INGOT_TTAS =
            ITEMS.register("ingot_ttas",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_PLATNIUM =
            ITEMS.register("ingot_platnium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_IRIDIUM =
            ITEMS.register("ingot_iridium",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_PALLADIUM =
            ITEMS.register("ingot_palladium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ALUMINIUM =
            ITEMS.register("ingot_aluminium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_STEEL =
            ITEMS.register("ingot_steel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_STAINLESS =
            ITEMS.register("ingot_stainless",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TCALLOY =
            ITEMS.register("ingot_tcalloy",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CDALLOY =
            ITEMS.register("ingot_cdalloy",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BISMUTH_BRONZE =
            ITEMS.register("ingot_bismuth_bronze",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ARSENIC_BRONZE =
            ITEMS.register("ingot_arsenic_bronze",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BSCCO =
            ITEMS.register("ingot_bscco",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_LEAD =
            ITEMS.register("ingot_lead",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BISMUTH =
            ITEMS.register("ingot_bismuth",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ARSENIC =
            ITEMS.register("ingot_arsenic",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CALCIUM =
            ITEMS.register("ingot_calcium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CADMIUM =
            ITEMS.register("ingot_cadmium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TANTALIUM =
            ITEMS.register("ingot_tantalium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SILICON =
            ITEMS.register("ingot_silicon",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_NIOBIUM =
            ITEMS.register("ingot_niobium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BERYLLIUM =
            ITEMS.register("ingot_beryllium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_COBALT =
            ITEMS.register("ingot_cobalt",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BORON =
            ITEMS.register("ingot_boron",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_GRAPHITE =
            ITEMS.register("ingot_graphite",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_FIREBRICK =
            ITEMS.register("ingot_firebrick",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_DURA_STEEL =
            ITEMS.register("ingot_dura_steel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_POLYMER =
            ITEMS.register("ingot_polymer",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BAKELITE =
            ITEMS.register("ingot_bakelite",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BIORUBBER =
            ITEMS.register("ingot_biorubber",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_RUBBER =
            ITEMS.register("ingot_rubber",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PC =
            ITEMS.register("ingot_pc",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PVC =
            ITEMS.register("ingot_pvc",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_MUD =
            ITEMS.register("ingot_mud",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_MAGMA =
            ITEMS.register("ingot_magma",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CFT =
            ITEMS.register("ingot_cft",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SCHRARANIUM =
            ITEMS.register("ingot_schraranium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SCHRABIDIUM =
            ITEMS.register("ingot_schrabidium",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_SCHRABIDATE =
            ITEMS.register("ingot_schrabidate",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_MAGNETIZED_TUNGSTEN =
            ITEMS.register("ingot_magnetized_tungsten",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_COMBINE_STEEL =
            ITEMS.register("ingot_combine_steel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SOLINIUM =
            ITEMS.register("ingot_solinium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_GH336 =
            ITEMS.register("ingot_gh336",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.LIGHT_PURPLE);
                        }
                    });
    public static final RegistryObject<Item> INGOT_CN989 =
            ITEMS.register("ingot_cn989",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.LIGHT_PURPLE);
                        }
                    });
    public static final RegistryObject<Item> INGOT_URANIUM_FUEL =
            ITEMS.register("ingot_uranium_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_THORIUM_FUEL =
            ITEMS.register("ingot_thorium_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PLUTONIUM_FUEL =
            ITEMS.register("ingot_plutonium_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_NEPTUNIUM_FUEL =
            ITEMS.register("ingot_neptunium_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_MOX_FUEL =
            ITEMS.register("ingot_mox_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_AMERICIUM_FUEL =
            ITEMS.register("ingot_americium_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SCHRABIDIUM_FUEL =
            ITEMS.register("ingot_schrabidium_fuel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_HES =
            ITEMS.register("ingot_hes",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_LES =
            ITEMS.register("ingot_les",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_AUSTRALIUM =
            ITEMS.register("ingot_australium",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.YELLOW);
                        }
                    });
    public static final RegistryObject<Item> INGOT_LANTHANIUM =
            ITEMS.register("ingot_lanthanium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ACTINIUM =
            ITEMS.register("ingot_actinium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_DESH =
            ITEMS.register("ingot_desh",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_FERROURANIUM =
            ITEMS.register("ingot_ferrouranium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_STARMETAL =
            ITEMS.register("ingot_starmetal",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.BLUE);
                        }
                    });
    public static final RegistryObject<Item> INGOT_GUNMETAL =
            ITEMS.register("ingot_gunmetal",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_WEAPONSTEEL =
            ITEMS.register("ingot_weaponsteel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SATURNITE =
            ITEMS.register("ingot_saturnite",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_EUPHEMIUM =
            ITEMS.register("ingot_euphemium",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.LIGHT_PURPLE);
                        }
                    });
    public static final RegistryObject<Item> INGOT_DINEUTRONIUM =
            ITEMS.register("ingot_dineutronium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ELECTRONIUM =
            ITEMS.register("ingot_electronium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_GWENIUM =
            ITEMS.register("ingot_gwenium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SMORE =
            ITEMS.register("ingot_smore",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_OSMIRIDIUM =
            ITEMS.register("ingot_osmiridium",
                    () -> new Item(new Item.Properties()) {
                        @Override
                        public Component getName(ItemStack stack) {
                            return Component.translatable(this.getDescriptionId(stack))
                                    .withStyle(ChatFormatting.AQUA);
                        }
                    });
    public static final RegistryObject<Item> INGOT_HAFNIUM =
            ITEMS.register("ingot_hafnium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_STEEL_DUSTED =
            ITEMS.register("ingot_steel_dusted",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_CHAINSTEEL =
            ITEMS.register("ingot_chainsteel",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_METEORITE =
            ITEMS.register("ingot_meteorite",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_METEORITE_FORGED =
            ITEMS.register("ingot_meteorite_forged",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PHOSPHORUS =
            ITEMS.register("ingot_phosphorus",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ZIRCONIUM =
            ITEMS.register("ingot_zirconium",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SEMTEX =
            ITEMS.register("ingot_semtex",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_C4 =
            ITEMS.register("ingot_c4",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_FIBERGLASS =
            ITEMS.register("ingot_fiberglass",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ASBESTOS =
            ITEMS.register("ingot_asbestos",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_RAW =
            ITEMS.register("ingot_raw",
                    () -> new Item(new Item.Properties()));

    // pellets

    public static final RegistryObject<Item> PELLET_RTG_RADIUM =
            ITEMS.register("pellet_rtg_radium",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_WEAK =
            ITEMS.register("pellet_rtg_weak",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG =
            ITEMS.register("pellet_rtg",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_STRONTIUM =
            ITEMS.register("pellet_rtg_strontium",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_COBALT =
            ITEMS.register("pellet_rtg_cobalt",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_ACTINIUM =
            ITEMS.register("pellet_rtg_actinium",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_POLONIUM =
            ITEMS.register("pellet_rtg_polonium",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_AMERICIUM =
            ITEMS.register("pellet_rtg_americium",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_BERKELIUM =
            ITEMS.register("pellet_rtg_berkelium",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_GOLD =
            ITEMS.register("pellet_rtg_gold",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_LEAD =
            ITEMS.register("pellet_rtg_lead",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_CF251 =
            ITEMS.register("pellet_rtg_cf251",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_CF252 =
            ITEMS.register("pellet_rtg_cf252",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_RTG_DEPLETED =
            ITEMS.register("pellet_rtg_depleted",
                    () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PELLET_CLUSTER =
            ITEMS.register("pellet_cluster",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELLET_BUCKSHOT =
            ITEMS.register("pellet_buckshot",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELLET_CHARGED =
            ITEMS.register("pellet_charged",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELLET_GAS =
            ITEMS.register("pellet_gas",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PELLET_ANTIMATTER =
            ITEMS.register("pellet_antimatter",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_UEU =
            ITEMS.register("rbmk_pellet_ueu",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MEU =
            ITEMS.register("rbmk_pellet_meu",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEU233 =
            ITEMS.register("rbmk_pellet_heu233",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEU235 =
            ITEMS.register("rbmk_pellet_heu235",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_THMEU =
            ITEMS.register("rbmk_pellet_thmeu",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_LEP =
            ITEMS.register("rbmk_pellet_lep",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MEP =
            ITEMS.register("rbmk_pellet_mep",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEP239 =
            ITEMS.register("rbmk_pellet_hep239",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEP241 =
            ITEMS.register("rbmk_pellet_hep241",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_LEA =
            ITEMS.register("rbmk_pellet_lea",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MEA =
            ITEMS.register("rbmk_pellet_mea",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEA241 =
            ITEMS.register("rbmk_pellet_hea241",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEA242 =
            ITEMS.register("rbmk_pellet_hea242",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_BK247 =
            ITEMS.register("rbmk_pellet_bk247",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MEN =
            ITEMS.register("rbmk_pellet_men",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEN =
            ITEMS.register("rbmk_pellet_hen",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MOX =
            ITEMS.register("rbmk_pellet_mox",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_LES =
            ITEMS.register("rbmk_pellet_les",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MES =
            ITEMS.register("rbmk_pellet_mes",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HES =
            ITEMS.register("rbmk_pellet_hes",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_LEAUS =
            ITEMS.register("rbmk_pellet_leaus",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HEAUS =
            ITEMS.register("rbmk_pellet_heaus",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_PO210BE =
            ITEMS.register("rbmk_pellet_po210be",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_RA226BE =
            ITEMS.register("rbmk_pellet_ra226be",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_PU238BE =
            ITEMS.register("rbmk_pellet_pu238be",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_BALEFIRE_GOLD =
            ITEMS.register("rbmk_pellet_balefire_gold",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_FLASHLEAD =
            ITEMS.register("rbmk_pellet_flashlead",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_BALEFIRE =
            ITEMS.register("rbmk_pellet_balefire",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_ZFB_BISMUTH =
            ITEMS.register("rbmk_pellet_zfb_bismuth",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_ZFB_PU241 =
            ITEMS.register("rbmk_pellet_zfb_pu241",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_ZFB_AM_MIX =
            ITEMS.register("rbmk_pellet_zfb_am_mix",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_DRX =
            ITEMS.register("rbmk_pellet_drx",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_LECM =
            ITEMS.register("rbmk_pellet_lecm",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_MECM =
            ITEMS.register("rbmk_pellet_mecm",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RBMK_PELLET_HECM =
            ITEMS.register("rbmk_pellet_hecm",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATZ_PELLET =
            ITEMS.register("watz_pellet",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATZ_PELLET_DEPLETED =
            ITEMS.register("watz_pellet_depleted",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICF_PELLET_EMPTY =
            ITEMS.register("icf_pellet_empty",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICF_PELLET =
            ITEMS.register("icf_pellet",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICF_PELLET_DEPLETED =
            ITEMS.register("icf_pellet_depleted",
                    () -> new Item(new Item.Properties()));

}
