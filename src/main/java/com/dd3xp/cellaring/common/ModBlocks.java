package com.dd3xp.cellaring.common;

import com.dd3xp.cellaring.common.blocks.BlockSecretRoom;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
   public static final Block SECRET_ROOM_BLOCK = new BlockSecretRoom();

   public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
       IForgeRegistry<Block> registry = event.getRegistry();
       registry.registerAll(
        SECRET_ROOM_BLOCK
        );
   }

   @SideOnly(Side.CLIENT)
   public static void initModels() {
       ((BlockSecretRoom)SECRET_ROOM_BLOCK).initModel();
   }
}