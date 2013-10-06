package Will11690.mod.MechaniCraft.Armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyBoots extends ItemArmor {

	public RubyBoots(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("will11690:RubyBoots");
	}
	
	public String getArmorTexture(ItemStack stack,  Entity entity, int slot, int layer){
		return "will11690:textures/models/armor/Ruby_1.png";
	}
	
}
