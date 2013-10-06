package Will11690.mod.MechaniCraft.OreGen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class NewOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			
		}

	}



	private void generateSurface(World world, Random random, int i, int j) {
		for(int k = 0; k < 5; k++){
			int Xcoord = i + random.nextInt(16);
			int Ycoord = random.nextInt(14);
			int Zcoord = j + random.nextInt(16);
			(new WorldGenMinable(Will11690.mod.MechaniCraft.Common.MechaniCraft.SapphireOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for(int l = 0; l < 5; l++){
			int Xcoord = i + random.nextInt(16);
			int Ycoord = random.nextInt(14);
			int Zcoord = j + random.nextInt(16);
			(new WorldGenMinable(Will11690.mod.MechaniCraft.Common.MechaniCraft.PureOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for(int m = 0; m < 5; m++){
			int Xcoord = i + random.nextInt(16);
			int Ycoord = random.nextInt(14);
			int Zcoord = j + random.nextInt(16);
			(new WorldGenMinable(Will11690.mod.MechaniCraft.Common.MechaniCraft.EvilOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for(int n = 0; n < 5; n++){
			int Xcoord = i + random.nextInt(16);
			int Ycoord = random.nextInt(14);
			int Zcoord = j + random.nextInt(16);
			(new WorldGenMinable(Will11690.mod.MechaniCraft.Common.MechaniCraft.RubyOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for(int k = 0; k < 6; k++){
			int Xcoord = i + random.nextInt(16);
			int Ycoord = random.nextInt(60);
			int Zcoord = j + random.nextInt(16);
			(new WorldGenMinable(Will11690.mod.MechaniCraft.Common.MechaniCraft.CopperOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		for(int k = 0; k < 6; k++){
			int Xcoord = i + random.nextInt(16);
			int Ycoord = random.nextInt(60);
			int Zcoord = j + random.nextInt(16);
			(new WorldGenMinable(Will11690.mod.MechaniCraft.Common.MechaniCraft.TinOre.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
	}
	

}
