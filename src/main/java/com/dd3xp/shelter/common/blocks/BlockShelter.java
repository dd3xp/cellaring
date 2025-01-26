package com.dd3xp.shelter.common.blocks;

import com.dd3xp.shelter.common.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockShelter extends Block {
    public static final ItemBlock ITEM_BLOCK;
    private static final BlockShelter BLOCK = new BlockShelter();
    
    public BlockShelter() {
        super(Material.ROCK);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0f);
        this.setCreativeTab(ModCreativeTabs.BLOCKS_TAB);
        this.setUnlocalizedName("shelter_block");
        this.setRegistryName("shelter_block");
    }
    
    @SideOnly(Side.CLIENT)
    public void initBlockModel() {
        ModelLoader.setCustomModelResourceLocation(
            Item.getItemFromBlock(this),
            0,
            new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }

    @SideOnly(Side.CLIENT)
    public void initItemModel() {
        ModelLoader.setCustomModelResourceLocation(
            ITEM_BLOCK,
            0,
            new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }
    
    static {
        ITEM_BLOCK = new ItemBlock(BLOCK);
        ITEM_BLOCK.setRegistryName(BLOCK.getRegistryName());
        ITEM_BLOCK.setCreativeTab(ModCreativeTabs.BLOCKS_TAB);
    }

    public static void registerBlock(IForgeRegistry<Block> registry) {
        registry.register(BLOCK);
    }

    public static void registerItemBlock(IForgeRegistry<Item> registry) {
        registry.register(ITEM_BLOCK);
    }

    public static BlockShelter getBlock() {
        return BLOCK;
    }

    public static ItemBlock getItemBlock() {
        return ITEM_BLOCK;
    }
}