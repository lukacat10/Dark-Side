package com.gmail.lukacat100.darkside;

import com.gmail.lukacat100.darkside.blocks.BlockDevilSummoner;
import com.gmail.lukacat100.darkside.items.ItemDarkPendant;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		// TODO Auto-generated method stub
		super.preInit(e);
	}
	@Override
	public void init(FMLInitializationEvent e) {
		// TODO Auto-generated method stub
		ItemDarkPendant.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
		BlockDevilSummoner.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
		super.init(e);
	}
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		// TODO Auto-generated method stub
		super.postInit(e);
	}
}
