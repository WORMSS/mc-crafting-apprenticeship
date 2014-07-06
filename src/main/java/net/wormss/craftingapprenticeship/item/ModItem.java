package net.wormss.craftingapprenticeship.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.wormss.craftingapprenticeship.references.Textures;

public class ModItem extends Item {
	
	public ModItem() {
		super();
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setNoRepair();
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Textures.RESOUCE_PREFIX, getUnwrappedUnlocalisedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return String.format("item.%s%s", Textures.RESOUCE_PREFIX, getUnwrappedUnlocalisedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalisedName(String name) {
		return name.substring(name.indexOf(".") + 1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
}
