package com.dd3xp.shelter.common.tabs;

import com.dd3xp.shelter.common.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs {
    private static final BlocksTab TAB = new BlocksTab();
    
    private BlocksTab() {
        super("shelterTab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.SHELTER_BLOCK);
    }

    public static CreativeTabs getTab() {
        return TAB;
    }
}