package com.dd3xp.cellaring.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
    public static final CreativeTabs SECRET_TAB = new CreativeTabs("secretTab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.SECRET_ROOM_BLOCK);
        }
    };
}
