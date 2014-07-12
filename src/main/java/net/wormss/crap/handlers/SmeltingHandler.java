package net.wormss.crap.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.wormss.crap.item.ModItems;

public class SmeltingHandler {
	public static void init() {
		flourToBread();
	}
	
	private static void flourToBread() {
		GameRegistry.addSmelting(ModItems.milledFlour, new ItemStack(Items.bread, 2), 0.1f);
	}
}
