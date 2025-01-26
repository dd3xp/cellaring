package com.dd3xp.shelter.common;

import com.dd3xp.shelter.common.blocks.BlockShelter;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    private static final BlockShelter SHELTER_BLOCK = (BlockShelter)ModBlocks.SHELTER_BLOCK;

    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        BlockShelter.registerItemBlock(event.getRegistry());
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        SHELTER_BLOCK.initItemModel();
    }
}