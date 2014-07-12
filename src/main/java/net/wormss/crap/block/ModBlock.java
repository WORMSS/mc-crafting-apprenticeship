package net.wormss.crap.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.wormss.crap.creative.ModCreativeTabs;
import net.wormss.crap.references.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModBlock extends Block {
	public ModBlock() {
		this(Material.rock);
	}
	
	public ModBlock(Material material) {
		super(material);
		this.setCreativeTab(ModCreativeTabs.general);
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
