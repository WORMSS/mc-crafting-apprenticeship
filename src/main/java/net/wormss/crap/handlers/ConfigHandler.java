package net.wormss.crap.handlers;

import java.io.File;
import java.util.List;

import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.wormss.crap.references.R;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler {
	static class EventRegister {
		@SubscribeEvent
		public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
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
