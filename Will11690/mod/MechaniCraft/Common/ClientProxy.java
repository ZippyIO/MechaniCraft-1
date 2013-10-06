package Will11690.mod.MechaniCraft.Common;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import Will11690.mod.MechaniCraft.CustomMobDrops.SheepDropLambchop;
import Will11690.mod.MechaniCraft.Common.ServerProxy;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings(){
		
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}
}
