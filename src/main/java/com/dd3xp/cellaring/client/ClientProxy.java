package com.dd3xp.cellaring.client;

import com.dd3xp.cellaring.common.IProxy;
import com.dd3xp.cellaring.common.ModBlocks;
import com.dd3xp.cellaring.common.ModItems;

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