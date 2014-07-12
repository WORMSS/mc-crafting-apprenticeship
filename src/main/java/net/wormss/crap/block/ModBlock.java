package net.wormss.crap.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.wormss.crap.references.Textures;

public class ModBlock extends Block {
	public ModBlock() {
		this(Material.rock);
	}
	
	public ModBlock(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = this.registerAndGetIcon(iconRegister);
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    
    protected IIcon registerAndGetIcon(IIconRegister iconRegister) {
    	return registerAndGetIcon(iconRegister, "");
    }
    
    protected IIcon registerAndGetIcon(IIconRegister iconRegister, String postfix) {
    	return iconRegister.registerIcon(String.format("%s%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), postfix));
    }
}
