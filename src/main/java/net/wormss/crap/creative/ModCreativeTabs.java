package net.wormss.crap.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.wormss.crap.item.ModItems;
import net.wormss.crap.references.R;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModCreativeTabs {
	
	public static final CreativeTabs general = new CreativeTabs(R.tabs.general){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ModItems.basic;
		}
	};
}
