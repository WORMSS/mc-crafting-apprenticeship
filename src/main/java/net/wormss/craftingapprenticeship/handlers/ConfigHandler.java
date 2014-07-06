package net.wormss.craftingapprenticeship.handlers;

import java.io.File;
import java.util.List;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.wormss.craftingapprenticeship.references.R;
import net.wormss.craftingapprenticeship.utility.ModLog;

public class ConfigHandler {
	static class EventRegister {
		@SubscribeEvent
		public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			ModLog.log("configChanged:", event.modID);
			if (event.modID.equalsIgnoreCase(R.mod.ID)) {
				loadConfig();
	        }
		}
	}
	
	private static Configuration config;
	public static boolean value = true;
	
	public static void init(File configFile) {
		if ( config == null ) {
			config = new Configuration(configFile);
			loadConfig();
			FMLCommonHandler.instance().bus().register(new EventRegister());
		}
	}
	
	private static void loadConfig() {
		value = config.getBoolean(R.config.VALUE, Configuration.CATEGORY_GENERAL, value, "Example configValue");
		
		if ( config.hasChanged() ) {
			config.save();
		}
	}

	public static List getGuiElements() {
		return new ConfigElement(config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements();
	}

	public static String configPath() {
		return config.toString();
	}
	
}
