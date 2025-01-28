package com.dd3xp.shelter.common;

import com.dd3xp.shelter.common.blocks.BlockShelter;
import com.dd3xp.shelter.common.items.ItemSurvivorSlab;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    // Items
    public static final ItemSurvivorSlab SURVIVOR_SLAB = ItemSurvivorSlab.getItem();

    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        // Items
        ItemSurvivorSlab.registerItem(event.getRegistry());

        // ItemBlocks
        BlockShelter.registerItemBlock(event.getRegistry());
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        // Items
        SURVIVOR_SLAB.initModel();
    }
}