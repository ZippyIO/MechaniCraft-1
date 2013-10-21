package Will11690.mod.MechaniCraft.Tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ObsidianPickaxe extends ItemPickaxe {

	public ObsidianPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("will11690:ObsidianPickaxe");
	}
	
}
