package Will11690.mod.MechaniCraft.CustomMobDrops;

import Will11690.mod.MechaniCraft.Common.MechaniCraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class SheepDropLambchop {
	public static double rand;
	
	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			System.out.println("Killed something.");
			if (event.entityLiving instanceof EntitySheep) {
				System.out.println("Killed a sheep.");
				if (rand < 0.50D) {
					event.entityLiving.dropItem(MechaniCraft.RawLambchop.itemID, 2);
					
				}
			}
		}
	}
}
