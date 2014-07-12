package net.wormss.crap.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.wormss.crap.creative.ModCreativeTabs;
import net.wormss.crap.references.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModItem extends Item {
	
	public ModItem() {
		super();
		this.setCreativeTab(ModCreativeTabs.general);
		this.setNoRepair();
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalisedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalisedName(super.getUnlocalizedName()));
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
