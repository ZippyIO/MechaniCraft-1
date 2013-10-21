package Will11690.mod.MechaniCraft.MachineItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreGrinderBlade extends Item{

	public OreGrinderBlade(int ID) {
		super(ID);
		maxStackSize = 1;
	}

	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("will11690:OreGrinderBlade");
    }
	
}