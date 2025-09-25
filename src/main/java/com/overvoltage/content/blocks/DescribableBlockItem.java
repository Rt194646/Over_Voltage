package com.overvoltage.content.blocks;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class DescribableBlockItem extends BlockItem {
    private final String descriptionKey;

    public DescribableBlockItem(Block block, Properties props, String descriptionKey) {
        super(block, props);
        this.descriptionKey = descriptionKey;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable(descriptionKey));
    }
}
