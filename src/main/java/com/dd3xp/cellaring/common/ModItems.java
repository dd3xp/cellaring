package com.dd3xp.cellaring.common;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
   public static ItemBlock SECRET_ROOM_BLOCK_ITEM;

   public static void onRegisterItems(RegistryEvent.Register<Item> event) {
       SECRET_ROOM_BLOCK_ITEM = new ItemBlock(ModBlocks.SECRET_ROOM_BLOCK);
       SECRET_ROOM_BLOCK_ITEM.setRegistryName(ModBlocks.SECRET_ROOM_BLOCK.getRegistryName());
       event.getRegistry().registerAll(
        SECRET_ROOM_BLOCK_ITEM
        );
   }

   @SideOnly(Side.CLIENT)
   public static void initModels() {

   }
}