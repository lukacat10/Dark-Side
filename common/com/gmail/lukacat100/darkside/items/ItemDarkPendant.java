package com.gmail.lukacat100.darkside.items;

import com.gmail.lukacat100.darkside.DarkSide;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDarkPendant extends Item {
	
	
	
	
	public static String NAME = "darkpendant";
	
	
	
	public static ItemDarkPendant ItemDarkPendant_instance;
	public static void init(){
		ItemDarkPendant_instance = new ItemDarkPendant();
		ItemDarkPendant_instance.setRegistryName(new ResourceLocation(DarkSide.MOD_RESOURCE_PREFIX + NAME));
		GameRegistry.register(ItemDarkPendant_instance);
	}
	@SideOnly(Side.CLIENT)//TODO: Test if this is neccasery.
	public static void initClient(ItemModelMesher imm){
		ModelResourceLocation model = new ModelResourceLocation(DarkSide.MOD_RESOURCE_PREFIX + NAME, "inventory");//TODO: Check if "inventory" parameter is neccasery!
		ModelLoader.registerItemVariants(ItemDarkPendant_instance, model);//TODO: may receive multiple models... check why
		imm.register(ItemDarkPendant_instance, 0, model);//TODO: Why it doesnt get more models?
	}
	
	public ItemDarkPendant() {
		// TODO Auto-generated constructor stub
		setMaxStackSize(64);
		setCreativeTab(DarkSide.darkSideTab);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		// TODO Auto-generated method stub
		return "item." + DarkSide.MOD_RESOURCE_PREFIX + NAME; // item.tutorial:tutorial_item
	}
	
}
