package net.wormss.crap.item;

import net.wormss.crap.references.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ModItem basic = new ItemBasic();
	public static final ModItem hammer = new ItemHammer();
	public static final ModItem milledFlour = new ItemMilledFlour();
	
	public static void init() {
		GameRegistry.registerItem(basic, Names.items.basic);
		GameRegistry.registerItem(hammer, Names.items.hammer);
		GameRegistry.registerItem(milledFlour, Names.items.milledFlour);
	}
}
