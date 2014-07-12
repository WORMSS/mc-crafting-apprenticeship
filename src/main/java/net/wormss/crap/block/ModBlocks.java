package net.wormss.crap.block;

import net.wormss.crap.references.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final ModBlock basic = new BlockBasic();
	public static final ModBlock crafter = new BlockCrafter();
	
	public static void init() {
		GameRegistry.registerBlock(basic, Names.blocks.basic);
		GameRegistry.registerBlock(crafter, Names.blocks.crafter);
	}
}
