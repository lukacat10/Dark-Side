package com.gmail.lukacat100.darkside;

import com.gmail.lukacat100.darkside.items.ItemDarkPendant;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e){
		ItemDarkPendant.init();
	}
	public void init(FMLInitializationEvent e){
		
	}
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
