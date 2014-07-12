package net.wormss.crap;

import net.wormss.crap.block.ModBlocks;
import net.wormss.crap.handlers.ConfigHandler;
import net.wormss.crap.handlers.CraftingHandler;
import net.wormss.crap.handlers.InterMod;
import net.wormss.crap.handlers.SmeltingHandler;
import net.wormss.crap.item.ModItems;
import net.wormss.crap.proxy.IProxy;
import net.wormss.crap.references.R;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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
		ModBlocks.init();
		InterMod.version_checker.addVersionCheck();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//register gui
		//register tile entities
		CraftingHandler.init();
		SmeltingHandler.init();
		//general event handling
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//wrap things up
	}

}
