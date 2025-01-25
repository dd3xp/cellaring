package com.dd3xp.cellaring.common;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.apache.logging.log4j.Logger;

@Mod(
    modid = Cellaring.MODID,
    name = Cellaring.NAME,
    version = Cellaring.VERSION
)
@EventBusSubscriber
public class Cellaring {
    public static final String MODID = "cellaring";
    public static final String NAME = "Cellaring";
    public static final String VERSION = "0.0.0";

    @SidedProxy(clientSide = "com.dd3xp.cellaring.client.ClientProxy", serverSide = "com.dd3xp.cellaring.server.ServerProxy")
    public static IProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Cellaring Mod: Pre-initialization stage started.");
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Cellaring Mod: Initialization stage started.");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Cellaring Mod: Post-initialization stage started.");
        proxy.postInit();
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.onRegisterBlocks(event);
    }

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        ModItems.onRegisterItems(event);
    }
}
