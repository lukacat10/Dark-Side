/*
This Source Code Form is subject to the terms of the Mozilla Public
License, v. 2.0. If a copy of the MPL was not distributed with this
file, You can obtain one at http://mozilla.org/MPL/2.0/. 
 */
package com.gmail.lukacat100.darkside;

import com.gmail.lukacat100.darkside.items.ItemDarkPendant;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = DarkSide.MOD_NAME, version = DarkSide.MOD_VERSION, modid = DarkSide.MOD_ID, dependencies = DarkSide.MOD_DEPENDENCIES)
public class DarkSide {
	//constants
		private static final boolean DEV_ENV = true;//If running in eclipse, requiring after a modid with a specific version won't work!
		public static final String MOD_ID = "darkside";
		public static final String MOD_NAME = "The Dark Side";//"Cool MOD"
		public static final String MOD_VERSION = "@VERSION@";
		public static final String MOD_DEPENDENCIES = "required-after:forge@[13.20.0.2228,);";//after:modid@[1.1.0);"; If running in eclipse replace '@' with ';' and remove all the text after it.
		public static final String MOD_RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
		
		//variables
		
		
		@Instance(MOD_ID)
		public static DarkSide instance;
		
		@SidedProxy(clientSide = "com.gmail.lukacat100.darkside.ClientProxy", serverSide = "com.gmail.lukacat100.darkside.CommonProxy")
		public static CommonProxy proxy;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent e){
			proxy.preInit(e);
		}
		@EventHandler
		public void init(FMLInitializationEvent e){
			proxy.init(e);
		}
		@EventHandler
		public void postInit(FMLPostInitializationEvent e){
			proxy.postInit(e);
		}
		
		
		public static CreativeTabs darkSideTab = new CreativeTabs(MOD_RESOURCE_PREFIX + "creative_tab") {

		    @Override
		    public ItemStack getTabIconItem() {

		      return new ItemStack(ItemDarkPendant.ItemDarkPendant_instance);
		    }
		  };
}
