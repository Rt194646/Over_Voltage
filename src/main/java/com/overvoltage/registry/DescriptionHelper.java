package com.overvoltage.registry;

import com.overvoltage.Overvoltage;

public class DescriptionHelper {
    public static String itemDescKey(String name) {
        return "item." + Overvoltage.MODID + "." + name + ".desc";
    }

    public static String blockDescKey(String name) {
        return "block." + Overvoltage.MODID + "." + name + ".desc";
    }
}
