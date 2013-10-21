package Will11690.mod.MechaniCraft.Handlers;

import java.util.EnumSet;

import Will11690.mod.MechaniCraft.Common.MechaniCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	private void onPlayerTick(EntityPlayer player){
		
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet1 = player.getCurrentItemOrArmor(4);
			
		if (player.getCurrentItemOrArmor(3) != null){
			ItemStack chestplate1 = player.getCurrentItemOrArmor(3);
				
		if (player.getCurrentItemOrArmor(2) != null){
			ItemStack leggings1 = player.getCurrentItemOrArmor(2);
				
		if (player.getCurrentItemOrArmor(1) != null){
			ItemStack boots1 = player.getCurrentItemOrArmor(1);
			
			if(helmet1.getItem() == MechaniCraft.EndHelmet || chestplate1.getItem() == MechaniCraft.EndChestplate || leggings1.getItem() == MechaniCraft.EndLeggings || boots1.getItem() == MechaniCraft.EndBoots){
				player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 220, 0));
					}
				}
			}
		}
	}
		
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet2 = player.getCurrentItemOrArmor(4);
			
		if (player.getCurrentItemOrArmor(3) != null){
			ItemStack chestplate2 = player.getCurrentItemOrArmor(3);
				
		if (player.getCurrentItemOrArmor(2) != null){
			ItemStack leggings2 = player.getCurrentItemOrArmor(2);
				
		if (player.getCurrentItemOrArmor(1) != null){
			ItemStack boots2 = player.getCurrentItemOrArmor(1);
			
			if(helmet2.getItem() == MechaniCraft.ObsidianHelmet || chestplate2.getItem() == MechaniCraft.ObsidianChestplate || leggings2.getItem() == MechaniCraft.ObsidianLeggings || boots2.getItem() == MechaniCraft.ObsidianBoots){
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 220, 0));
					}
				}
			}
		}
	}
		
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet3 = player.getCurrentItemOrArmor(4);
			
		if (player.getCurrentItemOrArmor(3) != null){
			ItemStack chestplate3 = player.getCurrentItemOrArmor(3);
				
		if (player.getCurrentItemOrArmor(2) != null){
			ItemStack leggings3 = player.getCurrentItemOrArmor(2);
				
		if (player.getCurrentItemOrArmor(1) != null){
			ItemStack boots3 = player.getCurrentItemOrArmor(1);
			
			if(helmet3.getItem() == MechaniCraft.PureHelmet || chestplate3.getItem() == MechaniCraft.PureChestplate || leggings3.getItem() == MechaniCraft.PureLeggings || boots3.getItem() == MechaniCraft.PureBoots){
				player.addPotionEffect(new PotionEffect(Potion.field_76443_y.getId(), 220, 0));
					}
				}
			}
		}
		}
		
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet4 = player.getCurrentItemOrArmor(4);
			
		if (player.getCurrentItemOrArmor(3) != null){
			ItemStack chestplate4 = player.getCurrentItemOrArmor(3);
				
		if (player.getCurrentItemOrArmor(2) != null){
			ItemStack leggings4 = player.getCurrentItemOrArmor(2);
				
		if (player.getCurrentItemOrArmor(1) != null){
			ItemStack boots4 = player.getCurrentItemOrArmor(1);
			
			if(helmet4.getItem() == MechaniCraft.EvilHelmet || chestplate4.getItem() == MechaniCraft.EvilChestplate || leggings4.getItem() == MechaniCraft.EvilLeggings || boots4.getItem() == MechaniCraft.EvilBoots){
				player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 220, 0));
					}
				}
			}
		}
	}
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

		if(type.equals(EnumSet.of(TickType.PLAYER))){
			onPlayerTick((EntityPlayer) tickData[0]);
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public String getLabel() {
		return null;
	}

}
