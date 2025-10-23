package com.overvoltage.registry;

import com.overvoltage.Overvoltage;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Overvoltage.MODID);

    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Overvoltage.MODID);

    public static final RegistryObject<Block> CASE1 =
            BLOCKS.register("case1",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(1f, 1f)
                            .requiresCorrectToolForDrops()
                    ));
    public static final RegistryObject<Item> CASE1_ITEM =
            ModItems.ITEMS.register("case1",
                    () -> new BlockItem(CASE1.get(), new Item.Properties()));

    public static final RegistryObject<Block> TITANIUM_BLOCK =
            BLOCKS.register("titanium_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(10f, 50f)
                            .requiresCorrectToolForDrops()
                    ));
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM =
            ModItems.ITEMS.register("titanium_block",
                    () -> new BlockItem(TITANIUM_BLOCK.get(), new Item.Properties()));

}
