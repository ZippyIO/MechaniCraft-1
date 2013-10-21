package Will11690.mod.MechaniCraft.Foods;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class RawLambchop extends ItemFood {

	public RawLambchop(int ID, int Hunger, float Saturation, boolean WolfFood) {
		super(ID, Hunger, Saturation, WolfFood);
	}

	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("will11690:RawLambchop");
    }
	
}
