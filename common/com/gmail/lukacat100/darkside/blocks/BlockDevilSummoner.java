package com.gmail.lukacat100.darkside.blocks;

import com.gmail.lukacat100.darkside.DarkSide;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDevilSummoner extends Block {
	public static String NAME = "devilsummoner";
	public BlockDevilSummoner() {
		super(Material.SAND);
		setBlockUnbreakable();
		setCreativeTab(DarkSide.darkSideTab);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public static BlockDevilSummoner blockDevilSummoner_instance;
	public static void init(){
		ResourceLocation location = new ResourceLocation(DarkSide.MOD_RESOURCE_PREFIX + NAME);
		blockDevilSummoner_instance = new BlockDevilSummoner();
		blockDevilSummoner_instance.setRegistryName(location);
		GameRegistry.register(blockDevilSummoner_instance);
		GameRegistry.register(new ItemBlock(blockDevilSummoner_instance), location);
	}
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher){
		Item item = Item.getItemFromBlock(blockDevilSummoner_instance);
		ModelResourceLocation model = new ModelResourceLocation(DarkSide.MOD_RESOURCE_PREFIX + NAME, "inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0, model);
	}
	
	
	
	@Override
	public String getUnlocalizedName() {
		// TODO Auto-generated method stub
		return "tile." + DarkSide.MOD_RESOURCE_PREFIX + NAME;
	}
}
