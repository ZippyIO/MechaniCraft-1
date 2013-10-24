package Will11690.mod.MechaniCraft.Common;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import Will11690.mod.MechaniCraft.CustomMobDrops.SheepDropLambchop;
import Will11690.mod.MechaniCraft.Common.ServerProxy;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityCopperChest;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityDiamondChest;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityGoldChest;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityIronChest;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityObsidianChest;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityStoneChest;
import Will11690.mod.MechaniCraft.TileEntityRenderer.ItemCopperChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.ItemDiamondChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.ItemGoldChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.ItemIronChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.ItemObsidianChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.ItemStoneChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.TileEntityCopperChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.TileEntityDiamondChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.TileEntityGoldChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.TileEntityIronChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.TileEntityObsidianChestRenderer;
import Will11690.mod.MechaniCraft.TileEntityRenderer.TileEntityStoneChestRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings(){
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStoneChest.class, new TileEntityStoneChestRenderer());
		MinecraftForgeClient.registerItemRenderer(MechaniCraft.StoneChest.blockID, new ItemStoneChestRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperChest.class, new TileEntityCopperChestRenderer());
		MinecraftForgeClient.registerItemRenderer(MechaniCraft.CopperChest.blockID, new ItemCopperChestRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronChest.class, new TileEntityIronChestRenderer());
		MinecraftForgeClient.registerItemRenderer(MechaniCraft.IronChest.blockID, new ItemIronChestRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldChest.class, new TileEntityGoldChestRenderer());
		MinecraftForgeClient.registerItemRenderer(MechaniCraft.GoldChest.blockID, new ItemGoldChestRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiamondChest.class, new TileEntityDiamondChestRenderer());
		MinecraftForgeClient.registerItemRenderer(MechaniCraft.DiamondChest.blockID, new ItemDiamondChestRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObsidianChest.class, new TileEntityObsidianChestRenderer());
		MinecraftForgeClient.registerItemRenderer(MechaniCraft.ObsidianChest.blockID, new ItemObsidianChestRenderer());
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
}
