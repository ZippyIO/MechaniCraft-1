package Will11690.mod.MechaniCraft.TileEntityRenderer;

import Will11690.mod.MechaniCraft.TileEntity.TileEntityIronChest;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemIronChestRenderer implements IItemRenderer {

	private ModelChest chestModel;
	
	public ItemIronChestRenderer(){
		
		chestModel = new ModelChest();
		
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
		
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
		
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityIronChest(), 0.0D, 0.0D, 0.0D, 0.0F);
		
	}

}