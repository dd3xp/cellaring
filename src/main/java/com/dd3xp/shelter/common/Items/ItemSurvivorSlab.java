package com.dd3xp.shelter.common.items;

import com.dd3xp.shelter.common.ModCreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

public class ItemSurvivorSlab extends Item {
    private static final ItemSurvivorSlab ITEM = new ItemSurvivorSlab();

    public ItemSurvivorSlab() {
        super();
        this.setRegistryName("survivor_slab");
        this.setUnlocalizedName("survivor_slab");
        this.setCreativeTab(ModCreativeTabs.ITEMS_TAB);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
            this,
            0,
            new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }

    public static ItemSurvivorSlab getItem() {
        return ITEM;
    }

    public static void registerItem(net.minecraftforge.registries.IForgeRegistry<Item> registry) {
        registry.register(ITEM);
    }
}
