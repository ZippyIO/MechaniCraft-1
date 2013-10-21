package Will11690.mod.MechaniCraft.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SapphireOre extends Block{

	private Icon registerIcons;
	public SapphireOre(int ID, int TEXTURE) {
		super(ID, Material.rock);
	}
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Will11690.mod.MechaniCraft.Common.MechaniCraft.SapphireGem.itemID;
    }
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
		
	super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7); 
	
	if (this.idDropped(par5, par1World.rand, par7) != this.blockID) { 
		
	int xp = 0; 
	xp = MathHelper.getRandomIntegerInRange(par1World.rand, 5, 10); 
	
	this.dropXpOnBlockBreak(par1World, par2, par3, par4, xp);
	
	} 
}
	
	public int quantityDropped(Random par1Random)
    {
        return 1;
    }
	
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("will11690:SapphireOre");
	}


}
