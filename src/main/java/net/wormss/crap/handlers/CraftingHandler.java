package net.wormss.crap.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.wormss.crap.item.ModItems;

public class CraftingHandler {
	public static void init() {
		CraftingManager.getInstance().addRecipe(new ItemStack(ModItems.hammer), new Object[] {
			"AAA",
			"AB ",
			" B ",
			'A', Items.iron_ingot,
			'B', Items.stick
		});
	}
}
