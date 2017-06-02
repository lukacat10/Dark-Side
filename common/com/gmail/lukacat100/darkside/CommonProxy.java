/*
This Source Code Form is subject to the terms of the Mozilla Public
License, v. 2.0. If a copy of the MPL was not distributed with this
file, You can obtain one at http://mozilla.org/MPL/2.0/. 
 */
package com.gmail.lukacat100.darkside;

import com.gmail.lukacat100.darkside.blocks.BlockDevilSummoner;
import com.gmail.lukacat100.darkside.items.ItemDarkPendant;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e){
		ItemDarkPendant.init();
		BlockDevilSummoner.init();
	}
	public void init(FMLInitializationEvent e){
		
	}
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
