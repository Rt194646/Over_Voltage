package com.overvoltage.lib;

import com.overvoltage.Overvoltage;
import net.minecraft.resources.ResourceLocation;

public class RefStrings {
    public static ResourceLocation resourceLocation(String path) {
        return ResourceLocation.fromNamespaceAndPath(Overvoltage.MODID, path);
    }
}
