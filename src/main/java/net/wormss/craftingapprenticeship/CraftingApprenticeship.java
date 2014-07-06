package net.wormss.craftingapprenticeship;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.wormss.craftingapprenticeship.handlers.ConfigHandler;
import net.wormss.craftingapprenticeship.handlers.InterMod;
import net.wormss.craftingapprenticeship.item.ModItems;
import net.wormss.craftingapprenticeship.proxy.IProxy;
import net.wormss.craftingapprenticeship.references.R;

@Mod(modid=R.mod.ID, name=R.mod.NAME, version=R.mod.VERSION, guiFactory=R.mod.GUI_FACTORY)
public class CraftingApprenticeship {
	@Mod.Instance(R.mod.ID)
	public static CraftingApprenticeship instance;
	
	@SidedProxy(clientSide = R.proxy.CLIENT, serverSide = R.proxy.SERVER)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//network handling
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		ModItems.init();
		//initialise blocks
		InterMod.version_checker.addVersionCheck();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//register gui
		//register tile entities
		//register crafting recipes
		//general event handling
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//wrap things up
	}

}
