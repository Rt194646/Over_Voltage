package com.ov.registry;

import com.ov.Overvoltage;
import com.ov.content.blocks.DescribableBlockItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Overvoltage.MODID);

    public static final RegistryObject<Block> TITANIUM_BLOCK =
            BLOCKS.register("titanium_block",
                    () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM =
            ModItems.ITEMS.register("titanium_block",
                    () -> new DescribableBlockItem(
                            TITANIUM_BLOCK.get(),
                            new Item.Properties(),
                            DescriptionHelper.blockDescKey("titanium_block")));
    
}
