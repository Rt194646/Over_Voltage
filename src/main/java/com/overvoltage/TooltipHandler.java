package com.overvoltage;

import com.overvoltage.registry.ModBlocks;
import com.overvoltage.registry.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Overvoltage.MODID, value = Dist.CLIENT)
public class TooltipHandler {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();

        if (stack.is(ModItems.RAW_TITANIUM.get())) {
            event.getToolTip().add(Component.translatable("tooltip.overvoltage.raw_titanium.line1")
                            .withStyle(ChatFormatting.YELLOW));
            event.getToolTip().add(Component.translatable("tooltip.overvoltage.raw_titanium.line2")
                            .withStyle(ChatFormatting.OBFUSCATED));
        }
        else if (stack.is(ModBlocks.TITANIUM_BLOCK_ITEM.get())) {
            event.getToolTip().add(Component.translatable("tooltip.overvoltage.titanium_block.line1")
                            .withStyle(ChatFormatting.BOLD));
        }
        else if (stack.is(ModItems.INGOT_URANIUM.get())) {
            event.getToolTip().add(Component.translatable("tooltip.overvoltage.ingot_uranium"));

        }
    }
}
