package net.wormss.crap.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.wormss.crap.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingHandler {
	public static void init() {
		flourToBread();
	}
	
	private static void flourToBread() {
		GameRegistry.addSmelting(ModItems.milledFlour, new ItemStack(Items.bread, 2), 0.1f);
	}
}
