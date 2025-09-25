package com.overvoltage.content.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class DescribableItem extends Item {
    private final String descriptionKey;

    public DescribableItem(Properties props, String descriptionKey) {
        super(props);
        this.descriptionKey = descriptionKey;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable(descriptionKey));
    }
}
