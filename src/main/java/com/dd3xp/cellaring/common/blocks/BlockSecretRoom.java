package com.dd3xp.cellaring.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

import com.dd3xp.cellaring.common.ModCreativeTabs;

public class BlockSecretRoom extends Block {
    public BlockSecretRoom() {
        super(Material.ROCK);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0f);
        this.setCreativeTab(ModCreativeTabs.SECRET_TAB);
        this.setUnlocalizedName("secret_room_block");
        this.setRegistryName("secret_room_block");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation("cellaring:secret_room_block", "inventory");
        
        System.out.println("Registering model for: " + modelResourceLocation.toString());
        System.out.println("Registering model: " + this.getRegistryName());

        ModelLoader.setCustomModelResourceLocation(
            Item.getItemFromBlock(this),
            0,
            modelResourceLocation
        );
    }
}
