package com.dd3xp.cellaring.common;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Cellaring.MODID, name = Cellaring.NAME, version = Cellaring.VERSION)
public class Cellaring {
    public static final String MODID = "cellaring";
    public static final String NAME = "Cellaring";
    public static final String VERSION = "1.0.0";
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Cellaring Mod: Pre-initialization stage started.");
        
        // 在这里添加预初始化逻辑（如注册物品、方块等）
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Cellaring Mod: Initialization stage started.");
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        // 在这里添加初始化逻辑
    }
}
