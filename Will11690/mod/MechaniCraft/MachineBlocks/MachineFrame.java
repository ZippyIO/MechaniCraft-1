package Will11690.mod.MechaniCraft.MachineBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MachineFrame extends Block{

	private Object registerIcons;

	public MachineFrame(int ID, int TEXTURE) {
		super(ID, Material.iron);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("will11690:MachineFrame");

    }
}