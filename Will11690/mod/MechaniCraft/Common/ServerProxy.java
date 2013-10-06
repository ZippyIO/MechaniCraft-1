package Will11690.mod.MechaniCraft.Common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import Will11690.mod.MechaniCraft.CustomMobDrops.SheepDropLambchop;
import Will11690.mod.MechaniCraft.Common.MechaniCraft;
import Will11690.mod.MechaniCraft.Handlers.ServerTickHandler;

public class ServerProxy implements IGuiHandler{
	
	public void registerRenderThings(){
	
}
	public void registerServerTickHandler(){
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}
	
	public int addArmor(String Armor){
		return 0;
	}
	
	public void entityDropEvents(){
		MinecraftForge.EVENT_BUS.register(new SheepDropLambchop());
	}
}