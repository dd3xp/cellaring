package com.dd3xp.shelter.client;

import com.dd3xp.shelter.common.IProxy;
import com.dd3xp.shelter.common.ModBlocks;
import com.dd3xp.shelter.common.ModItems;

public class ClientProxy implements IProxy {
   @Override
   public void preInit() {
        ModBlocks.initModels();
        ModItems.initModels();
   }
   
   @Override
   public void init() {
       System.out.println("ClientProxy: Init");
   }

   @Override
   public void postInit() {
       System.out.println("ClientProxy: PostInit");
   }
}