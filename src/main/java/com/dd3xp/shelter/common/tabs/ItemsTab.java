package com.dd3xp.shelter.common.tabs;

import com.dd3xp.shelter.common.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemsTab extends CreativeTabs {
    private static final ItemsTab TAB = new ItemsTab();
    
    private ItemsTab() {
        super("shelterItemsTab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.SURVIVOR_SLAB);
    }

    public static CreativeTabs getTab() {
        return TAB;
    }
}