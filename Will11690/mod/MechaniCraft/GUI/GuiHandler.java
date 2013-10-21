package Will11690.mod.MechaniCraft.GUI;

import Will11690.mod.MechaniCraft.MachineStuff.ContainerIronFurnace;
import Will11690.mod.MechaniCraft.MachineStuff.ContainerOreGrinder;
import Will11690.mod.MechaniCraft.MachineStuff.GuiIronFurnace;
import Will11690.mod.MechaniCraft.MachineStuff.GuiOreGrinder;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityIronFurnace;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityOreGrinder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		
		if(tile_entity instanceof TileEntityIronFurnace){
			return new ContainerIronFurnace(player.inventory, (TileEntityIronFurnace) tile_entity);
		}
		
		if(tile_entity instanceof TileEntityOreGrinder){
			return new ContainerOreGrinder(player.inventory, (TileEntityOreGrinder) tile_entity);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		
		if(tile_entity instanceof TileEntityIronFurnace){
			return new GuiIronFurnace(player.inventory, (TileEntityIronFurnace) tile_entity);
		}
		
		if(tile_entity instanceof TileEntityOreGrinder){
			return new GuiOreGrinder(player.inventory, (TileEntityOreGrinder) tile_entity);
		}
		
		return null;
	}

}
