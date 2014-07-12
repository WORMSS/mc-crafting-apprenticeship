package net.wormss.crap.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import net.wormss.crap.references.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCrafter extends ModBlock {
	private IIcon blockIconSide1;
	private IIcon blockIconSide2;

	public BlockCrafter() {
		super(Material.wood);
		this.setBlockName(Names.blocks.crafter);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = registerAndGetIcon(iconRegister, "_top");
		this.blockIconSide1 = registerAndGetIcon(iconRegister, "_side1");
		this.blockIconSide2 = registerAndGetIcon(iconRegister, "_side2");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		switch ( ForgeDirection.values()[side] ) {
			case UP : return this.blockIcon;
			case NORTH :
			case SOUTH : return this.blockIconSide1;
			case EAST :
			case WEST : return this.blockIconSide2;
			case DOWN :
			case UNKNOWN :
			default :
				return Blocks.crafting_table.getIcon(side, meta);
		}
	}
}
