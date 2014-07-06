package net.wormss.craftingapprenticeship.item;

import net.wormss.craftingapprenticeship.references.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ModItem basic = new ItemBasic();
	
	public static void init() {
		GameRegistry.registerItem(basic, Names.items.basic);
	}
}
