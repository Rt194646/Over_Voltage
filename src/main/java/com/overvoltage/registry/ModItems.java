package com.ov.registry;

import com.ov.Overvoltage;
import com.ov.content.items.DescribableItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Overvoltage.MODID);

    public static final RegistryObject<Item> RAW_TITANIUM =
            ITEMS.register("raw_titanium",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("raw_titanium")));

    public static final RegistryObject<Item> WATER_BOTTLE =
            ITEMS.register("water_bottle",
                    () -> new DescribableItem(new Item.Properties(),
                            DescriptionHelper.itemDescKey("water_bottle")));
}
