package com.dd3xp.shelter.common;

import com.dd3xp.shelter.common.blocks.BlockShelter;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
    public static final Block SHELTER_BLOCK = BlockShelter.getBlock();

    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        BlockShelter.registerBlock(event.getRegistry());
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ((BlockShelter)SHELTER_BLOCK).initBlockModel();
    }
}