package com.overvoltage.registry;

import com.overvoltage.Overvoltage;
import com.overvoltage.content.items.DescribableItem;

import net.minecraft.world.item.Item;
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
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("water_bottle")));

    // ingots

    public static final RegistryObject<Item> INGOT_URANIUM =
            ITEMS.register("ingot_uranium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_uranium")));
    public static final RegistryObject<Item> INGOT_U233 =
            ITEMS.register("ingot_u233",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_u233")));
    public static final RegistryObject<Item> INGOT_U235 =
            ITEMS.register("ingot_u235",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_u235")));
    public static final RegistryObject<Item> INGOT_U238 =
            ITEMS.register("ingot_u238",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_u238")));
    public static final RegistryObject<Item> INGOT_TH232 =
            ITEMS.register("ingot_th232",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_th232")));
    public static final RegistryObject<Item> INGOT_PLUTONIUM =
            ITEMS.register("ingot_plutonium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_plutonium")));
    public static final RegistryObject<Item> INGOT_PU238 =
            ITEMS.register("ingot_pu238",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pu238")));
    public static final RegistryObject<Item> INGOT_PU239 =
            ITEMS.register("ingot_pu239",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pu239")));
    public static final RegistryObject<Item> INGOT_PU240 =
            ITEMS.register("ingot_pu240",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pu240")));
    public static final RegistryObject<Item> INGOT_PU241 =
            ITEMS.register("ingot_pu241",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pu241")));
    public static final RegistryObject<Item> INGOT_PU_MIX =
            ITEMS.register("ingot_pu_mix",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pu_mix")));
    public static final RegistryObject<Item> INGOT_AM241 =
            ITEMS.register("ingot_am241",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_am241")));
    public static final RegistryObject<Item> INGOT_AM242 =
            ITEMS.register("ingot_am242",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_am242")));
    public static final RegistryObject<Item> INGOT_AM_MIX =
            ITEMS.register("ingot_am_mix",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_am_mix")));
    public static final RegistryObject<Item> INGOT_CM242 =
            ITEMS.register("ingot_cm242",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm242")));
    public static final RegistryObject<Item> INGOT_CM243 =
            ITEMS.register("ingot_cm243",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm243")));
    public static final RegistryObject<Item> INGOT_CM244 =
            ITEMS.register("ingot_cm244",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm244")));
    public static final RegistryObject<Item> INGOT_CM245 =
            ITEMS.register("ingot_cm245",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm245")));
    public static final RegistryObject<Item> INGOT_CM246 =
            ITEMS.register("ingot_cm246",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm246")));
    public static final RegistryObject<Item> INGOT_CM247 =
            ITEMS.register("ingot_cm247",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm247")));
    public static final RegistryObject<Item> INGOT_CM_FUEL =
            ITEMS.register("ingot_cm_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm_fuel")));
    public static final RegistryObject<Item> INGOT_CM_MIX =
            ITEMS.register("ingot_cm_mix",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cm_mix")));
    public static final RegistryObject<Item> INGOT_BK247 =
            ITEMS.register("ingot_bk247",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_bk247")));
    public static final RegistryObject<Item> INGOT_CF251 =
            ITEMS.register("ingot_cf251",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cf251")));
    public static final RegistryObject<Item> INGOT_CF252 =
            ITEMS.register("ingot_cf252",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cf252")));
    public static final RegistryObject<Item> INGOT_ES253 =
            ITEMS.register("ingot_es253",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_es253")));
    public static final RegistryObject<Item> INGOT_ES255 =
            ITEMS.register("ingot_es255",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_es255")));
    public static final RegistryObject<Item> INGOT_NEPTUNIUM =
            ITEMS.register("ingot_neptunium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_neptunium")));
    public static final RegistryObject<Item> INGOT_POLONIUM =
            ITEMS.register("ingot_polonium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_polonium")));
    public static final RegistryObject<Item> INGOT_TECHNETIUM =
            ITEMS.register("ingot_technetium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_technetium")));
    public static final RegistryObject<Item> INGOT_CO60 =
            ITEMS.register("ingot_co60",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_co60")));
    public static final RegistryObject<Item> INGOT_SR90 =
            ITEMS.register("ingot_sr90",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_sr90")));
    public static final RegistryObject<Item> INGOT_AU198 =
            ITEMS.register("ingot_au198",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_au198")));
    public static final RegistryObject<Item> INGOT_PB209 =
            ITEMS.register("ingot_pb209",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pb209")));
    public static final RegistryObject<Item> INGOT_RA226 =
            ITEMS.register("ingot_ra226",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_ra226")));
    public static final RegistryObject<Item> INGOT_TITANIUM =
            ITEMS.register("ingot_titanium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_titanium")));
    public static final RegistryObject<Item> INGOT_NICKEL =
            ITEMS.register("ingot_nickel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_nickel")));
    public static final RegistryObject<Item> INGOT_COPPER =
            ITEMS.register("ingot_copper",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_copper")));
    public static final RegistryObject<Item> INGOT_RED_COPPER =
            ITEMS.register("ingot_red_copper",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_red_copper")));
    public static final RegistryObject<Item> INGOT_ADVANCED_ALLOY =
            ITEMS.register("ingot_advanced_alloy",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_advanced_alloy")));
    public static final RegistryObject<Item> INGOT_ZINC =
            ITEMS.register("ingot_zinc",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_zinc")));
    public static final RegistryObject<Item> INGOT_TUNGSTEN =
            ITEMS.register("ingot_tungsten",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_tungsten")));
    public static final RegistryObject<Item> INGOT_GALLIUM =
            ITEMS.register("ingot_gallium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_gallium")));
    public static final RegistryObject<Item> INGOT_GAAS =
            ITEMS.register("ingot_gaas",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_gaas")));
    public static final RegistryObject<Item> INGOT_TT =
            ITEMS.register("ingot_tt",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_tt")));
    public static final RegistryObject<Item> INGOT_TTAS =
            ITEMS.register("ingot_ttas",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_ttas")));
    public static final RegistryObject<Item> INGOT_PLATNIUM =
            ITEMS.register("ingot_platnium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_platnium")));
    public static final RegistryObject<Item> INGOT_IRIDIUM =
            ITEMS.register("ingot_iridium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_iridium")));
    public static final RegistryObject<Item> INGOT_PALLADIUM =
            ITEMS.register("ingot_palladium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_palladium")));
    public static final RegistryObject<Item> INGOT_ALUMINIUM =
            ITEMS.register("ingot_aluminium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_aluminium")));
    public static final RegistryObject<Item> INGOT_STEEL =
            ITEMS.register("ingot_steel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_steel")));
    public static final RegistryObject<Item> INGOT_STAINLESS =
            ITEMS.register("ingot_stainless",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_stainless")));
    public static final RegistryObject<Item> INGOT_TCALLOY =
            ITEMS.register("ingot_tcalloy",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_tcalloy")));
    public static final RegistryObject<Item> INGOT_CDALLOY =
            ITEMS.register("ingot_cdalloy",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cdalloy")));
    public static final RegistryObject<Item> INGOT_BISMUTH_BRONZE =
            ITEMS.register("ingot_bismuth_bronze",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_bismuth_bronze")));
    public static final RegistryObject<Item> INGOT_ARSENIC_BRONZE =
            ITEMS.register("ingot_arsenic_bronze",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_arsenic_bronze")));
    public static final RegistryObject<Item> INGOT_BSCCO =
            ITEMS.register("ingot_bscco",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_bscco")));
    public static final RegistryObject<Item> INGOT_LEAD =
            ITEMS.register("ingot_lead",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_lead")));
    public static final RegistryObject<Item> INGOT_BISMUTH =
            ITEMS.register("ingot_bismuth",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_bismuth")));
    public static final RegistryObject<Item> INGOT_ARSENIC =
            ITEMS.register("ingot_arsenic",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_arsenic")));
    public static final RegistryObject<Item> INGOT_CALCIUM =
            ITEMS.register("ingot_calcium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_calcium")));
    public static final RegistryObject<Item> INGOT_CADMIUM =
            ITEMS.register("ingot_cadmium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cadmium")));
    public static final RegistryObject<Item> INGOT_TANTALIUM =
            ITEMS.register("ingot_tantalium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_tantalium")));
    public static final RegistryObject<Item> INGOT_SILICON =
            ITEMS.register("ingot_silicon",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_silicon")));
    public static final RegistryObject<Item> INGOT_NIOBIUM =
            ITEMS.register("ingot_niobium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_niobium")));
    public static final RegistryObject<Item> INGOT_BERYLLIUM =
            ITEMS.register("ingot_beryllium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_beryllium")));
    public static final RegistryObject<Item> INGOT_COBALT =
            ITEMS.register("ingot_cobalt",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cobalt")));
    public static final RegistryObject<Item> INGOT_BORON =
            ITEMS.register("ingot_boron",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_boron")));
    public static final RegistryObject<Item> INGOT_GRAPHITE =
            ITEMS.register("ingot_graphite",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_graphite")));
    public static final RegistryObject<Item> INGOT_FIREBRICK =
            ITEMS.register("ingot_firebrick",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_firebrick")));
    public static final RegistryObject<Item> INGOT_DURA_STEEL =
            ITEMS.register("ingot_dura_steel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_dura_steel")));
    public static final RegistryObject<Item> INGOT_POLYMER =
            ITEMS.register("ingot_polymer",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_polymer")));
    public static final RegistryObject<Item> INGOT_BAKELITE =
            ITEMS.register("ingot_bakelite",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_bakelite")));
    public static final RegistryObject<Item> INGOT_BIORUBBER =
            ITEMS.register("ingot_biorubber",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_biorubber")));
    public static final RegistryObject<Item> INGOT_RUBBER =
            ITEMS.register("ingot_rubber",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_rubber")));
    public static final RegistryObject<Item> INGOT_PC =
            ITEMS.register("ingot_pc",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pc")));
    public static final RegistryObject<Item> INGOT_PVC =
            ITEMS.register("ingot_pvc",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_pvc")));
    public static final RegistryObject<Item> INGOT_MUD =
            ITEMS.register("ingot_mud",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_mud")));
    public static final RegistryObject<Item> INGOT_MAGMA =
            ITEMS.register("ingot_magma",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_magma")));
    public static final RegistryObject<Item> INGOT_CFT =
            ITEMS.register("ingot_cft",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cft")));
    public static final RegistryObject<Item> INGOT_SCHRARANIUM =
            ITEMS.register("ingot_schraranium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_schraranium")));
    public static final RegistryObject<Item> INGOT_SCHRABIDIUM =
            ITEMS.register("ingot_schrabidium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_schrabidium")));
    public static final RegistryObject<Item> INGOT_SCHRABIDATE =
            ITEMS.register("ingot_schrabidate",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_schrabidate")));
    public static final RegistryObject<Item> INGOT_MAGNETIZED_TUNGSTEN =
            ITEMS.register("ingot_magnetized_tungsten",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_magnetized_tungsten")));
    public static final RegistryObject<Item> INGOT_COMBINE_STEEL =
            ITEMS.register("ingot_combine_steel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_combine_steel")));
    public static final RegistryObject<Item> INGOT_SOLINIUM =
            ITEMS.register("ingot_solinium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_solinium")));
    public static final RegistryObject<Item> INGOT_GH336 =
            ITEMS.register("ingot_gh336",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_gh336")));
    public static final RegistryObject<Item> INGOT_CN989 =
            ITEMS.register("ingot_cn989",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_cn989")));
    public static final RegistryObject<Item> INGOT_URANIUM_FUEL =
            ITEMS.register("ingot_uranium_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_uranium_fuel")));
    public static final RegistryObject<Item> INGOT_THORIUM_FUEL =
            ITEMS.register("ingot_thorium_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_thorium_fuel")));
    public static final RegistryObject<Item> INGOT_PLUTONIUM_FUEL =
            ITEMS.register("ingot_plutonium_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_plutonium_fuel")));
    public static final RegistryObject<Item> INGOT_NEPTUNIUM_FUEL =
            ITEMS.register("ingot_neptunium_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_neptunium_fuel")));
    public static final RegistryObject<Item> INGOT_MOX_FUEL =
            ITEMS.register("ingot_mox_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_mox_fuel")));
    public static final RegistryObject<Item> INGOT_AMERICIUM_FUEL =
            ITEMS.register("ingot_americium_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_americium_fuel")));
    public static final RegistryObject<Item> INGOT_SCHRABIDIUM_FUEL =
            ITEMS.register("ingot_schrabidium_fuel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_schrabidium_fuel")));
    public static final RegistryObject<Item> INGOT_HES =
            ITEMS.register("ingot_hes",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_hes")));
    public static final RegistryObject<Item> INGOT_LES =
            ITEMS.register("ingot_les",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_les")));
    public static final RegistryObject<Item> INGOT_AUSTRALIUM =
            ITEMS.register("ingot_australium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_australium")));
    public static final RegistryObject<Item> INGOT_LANTHANIUM =
            ITEMS.register("ingot_lanthanium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_lanthanium")));
    public static final RegistryObject<Item> INGOT_ACTINIUM =
            ITEMS.register("ingot_actinium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_actinium")));
    public static final RegistryObject<Item> INGOT_DESH =
            ITEMS.register("ingot_desh",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_desh")));
    public static final RegistryObject<Item> INGOT_FERROURANIUM =
            ITEMS.register("ingot_ferrouranium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_ferrouranium")));
    public static final RegistryObject<Item> INGOT_STARMETAL =
            ITEMS.register("ingot_starmetal",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_starmetal")));
    public static final RegistryObject<Item> INGOT_GUNMETAL =
            ITEMS.register("ingot_gunmetal",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_gunmetal")));
    public static final RegistryObject<Item> INGOT_WEAPONSTEEL =
            ITEMS.register("ingot_weaponsteel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_weaponsteel")));
    public static final RegistryObject<Item> INGOT_SATURNITE =
            ITEMS.register("ingot_saturnite",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_saturnite")));
    public static final RegistryObject<Item> INGOT_EUPHEMIUM =
            ITEMS.register("ingot_euphemium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_euphemium")));
    public static final RegistryObject<Item> INGOT_DINEUTRONIUM =
            ITEMS.register("ingot_dineutronium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_dineutronium")));
    public static final RegistryObject<Item> INGOT_ELECTRONIUM =
            ITEMS.register("ingot_electronium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_electronium")));
    public static final RegistryObject<Item> INGOT_GWENIUM =
            ITEMS.register("ingot_gwenium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_gwenium")));
    public static final RegistryObject<Item> INGOT_SMORE =
            ITEMS.register("ingot_smore",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_smore")));
    public static final RegistryObject<Item> INGOT_OSMIRIDIUM =
            ITEMS.register("ingot_osmiridium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_osmiridium")));
    public static final RegistryObject<Item> INGOT_HAFNIUM =
            ITEMS.register("ingot_hafnium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_hafnium")));
    public static final RegistryObject<Item> INGOT_STEEL_DUSTED =
            ITEMS.register("ingot_steel_dusted",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_steel_dusted")));
    public static final RegistryObject<Item> INGOT_CHAINSTEEL =
            ITEMS.register("ingot_chainsteel",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_chainsteel")));
    public static final RegistryObject<Item> INGOT_METEORITE =
            ITEMS.register("ingot_meteorite",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_meteorite")));
    public static final RegistryObject<Item> INGOT_METEORITE_FORGED =
            ITEMS.register("ingot_meteorite_forged",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_meteorite_forged")));
    public static final RegistryObject<Item> INGOT_PHOSPHORUS =
            ITEMS.register("ingot_phosphorus",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_phosphorus")));
    public static final RegistryObject<Item> INGOT_ZIRCONIUM =
            ITEMS.register("ingot_zirconium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_zirconium")));
    public static final RegistryObject<Item> INGOT_SEMTEX =
            ITEMS.register("ingot_semtex",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_semtex")));
    public static final RegistryObject<Item> INGOT_C4 =
            ITEMS.register("ingot_c4",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_c4")));
    public static final RegistryObject<Item> INGOT_FIBERGLASS =
            ITEMS.register("ingot_fiberglass",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_fiberglass")));
    public static final RegistryObject<Item> INGOT_ASBESTOS =
            ITEMS.register("ingot_asbestos",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_asbestos")));
    public static final RegistryObject<Item> INGOT_RAW =
            ITEMS.register("ingot_raw",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("ingot_raw")));

}
