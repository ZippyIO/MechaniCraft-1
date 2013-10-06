package Will11690.mod.MechaniCraft.Common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import Will11690.mod.MechaniCraft.Armor.BronzeBoots;
import Will11690.mod.MechaniCraft.Armor.BronzeChestplate;
import Will11690.mod.MechaniCraft.Armor.BronzeHelmet;
import Will11690.mod.MechaniCraft.Armor.BronzeLeggings;
import Will11690.mod.MechaniCraft.Armor.EmeraldBoots;
import Will11690.mod.MechaniCraft.Armor.EmeraldChestplate;
import Will11690.mod.MechaniCraft.Armor.EmeraldHelmet;
import Will11690.mod.MechaniCraft.Armor.EmeraldLeggings;
import Will11690.mod.MechaniCraft.Armor.EndBoots;
import Will11690.mod.MechaniCraft.Armor.EndChestplate;
import Will11690.mod.MechaniCraft.Armor.EndHelmet;
import Will11690.mod.MechaniCraft.Armor.EndLeggings;
import Will11690.mod.MechaniCraft.Armor.EvilBoots;
import Will11690.mod.MechaniCraft.Armor.EvilChestplate;
import Will11690.mod.MechaniCraft.Armor.EvilHelmet;
import Will11690.mod.MechaniCraft.Armor.EvilLeggings;
import Will11690.mod.MechaniCraft.Armor.GlassBoots;
import Will11690.mod.MechaniCraft.Armor.GlassChestplate;
import Will11690.mod.MechaniCraft.Armor.GlassHelmet;
import Will11690.mod.MechaniCraft.Armor.GlassLeggings;
import Will11690.mod.MechaniCraft.Armor.ObsidianBoots;
import Will11690.mod.MechaniCraft.Armor.ObsidianChestplate;
import Will11690.mod.MechaniCraft.Armor.ObsidianHelmet;
import Will11690.mod.MechaniCraft.Armor.ObsidianLeggings;
import Will11690.mod.MechaniCraft.Armor.PureBoots;
import Will11690.mod.MechaniCraft.Armor.PureChestplate;
import Will11690.mod.MechaniCraft.Armor.PureHelmet;
import Will11690.mod.MechaniCraft.Armor.PureLeggings;
import Will11690.mod.MechaniCraft.Armor.RubyBoots;
import Will11690.mod.MechaniCraft.Armor.RubyChestplate;
import Will11690.mod.MechaniCraft.Armor.RubyHelmet;
import Will11690.mod.MechaniCraft.Armor.RubyLeggings;
import Will11690.mod.MechaniCraft.Armor.SapphireBoots;
import Will11690.mod.MechaniCraft.Armor.SapphireChestplate;
import Will11690.mod.MechaniCraft.Armor.SapphireHelmet;
import Will11690.mod.MechaniCraft.Armor.SapphireLeggings;
import Will11690.mod.MechaniCraft.Blocks.BronzeBlock;
import Will11690.mod.MechaniCraft.Blocks.ChiseledQuartzBrick;
import Will11690.mod.MechaniCraft.Blocks.CopperBlock;
import Will11690.mod.MechaniCraft.Blocks.CopperOre;
import Will11690.mod.MechaniCraft.Blocks.EndBlock;
import Will11690.mod.MechaniCraft.Blocks.EvilGemBlock;
import Will11690.mod.MechaniCraft.Blocks.EvilOre;
import Will11690.mod.MechaniCraft.Blocks.PureGemBlock;
import Will11690.mod.MechaniCraft.Blocks.PureOre;
import Will11690.mod.MechaniCraft.Blocks.QuartzBrick;
import Will11690.mod.MechaniCraft.Blocks.RubyBlock;
import Will11690.mod.MechaniCraft.Blocks.RubyOre;
import Will11690.mod.MechaniCraft.Blocks.SapphireBlock;
import Will11690.mod.MechaniCraft.Blocks.SapphireOre;
import Will11690.mod.MechaniCraft.Blocks.TinBlock;
import Will11690.mod.MechaniCraft.Blocks.TinOre;
import Will11690.mod.MechaniCraft.Capes.DevCapesUtil;
import Will11690.mod.MechaniCraft.Foods.CookedLambchop;
import Will11690.mod.MechaniCraft.Foods.RawLambchop;
import Will11690.mod.MechaniCraft.GUI.GuiHandler;
import Will11690.mod.MechaniCraft.Handlers.MechaniCraftPacketHandler;
import Will11690.mod.MechaniCraft.Items.BronzeIngot;
import Will11690.mod.MechaniCraft.Items.CopperDust;
import Will11690.mod.MechaniCraft.Items.CopperIngot;
import Will11690.mod.MechaniCraft.Items.CopperNugget;
import Will11690.mod.MechaniCraft.Items.EndIngot;
import Will11690.mod.MechaniCraft.Items.EvilCrystal;
import Will11690.mod.MechaniCraft.Items.GlassIngot;
import Will11690.mod.MechaniCraft.Items.GoldDust;
import Will11690.mod.MechaniCraft.Items.IronDust;
import Will11690.mod.MechaniCraft.Items.IronNugget;
import Will11690.mod.MechaniCraft.Items.ObsidianChunk;
import Will11690.mod.MechaniCraft.Items.ObsidianIngot;
import Will11690.mod.MechaniCraft.Items.PureCrystal;
import Will11690.mod.MechaniCraft.Items.Ruby;
import Will11690.mod.MechaniCraft.Items.Sapphire;
import Will11690.mod.MechaniCraft.Items.TinDust;
import Will11690.mod.MechaniCraft.Items.TinIngot;
import Will11690.mod.MechaniCraft.Items.TinNugget;
import Will11690.mod.MechaniCraft.MachineBlocks.IronFurnace;
import Will11690.mod.MechaniCraft.MachineBlocks.MachineFrame;
import Will11690.mod.MechaniCraft.MachineBlocks.OreGrinder;
import Will11690.mod.MechaniCraft.MachineItems.FurnaceSmeltry;
import Will11690.mod.MechaniCraft.MachineItems.MachineFramePart;
import Will11690.mod.MechaniCraft.MachineItems.OreGrinderBlade;
import Will11690.mod.MechaniCraft.OreGen.NewOreGen;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityIronFurnace;
import Will11690.mod.MechaniCraft.TileEntity.TileEntityOreGrinder;
import Will11690.mod.MechaniCraft.Tools.BronzeAxe;
import Will11690.mod.MechaniCraft.Tools.BronzeHoe;
import Will11690.mod.MechaniCraft.Tools.BronzePickaxe;
import Will11690.mod.MechaniCraft.Tools.BronzeShovel;
import Will11690.mod.MechaniCraft.Tools.EmeraldAxe;
import Will11690.mod.MechaniCraft.Tools.EmeraldHoe;
import Will11690.mod.MechaniCraft.Tools.EmeraldPickaxe;
import Will11690.mod.MechaniCraft.Tools.EmeraldShovel;
import Will11690.mod.MechaniCraft.Tools.EndAxe;
import Will11690.mod.MechaniCraft.Tools.EndHoe;
import Will11690.mod.MechaniCraft.Tools.EndPickaxe;
import Will11690.mod.MechaniCraft.Tools.EndShovel;
import Will11690.mod.MechaniCraft.Tools.EvilAxe;
import Will11690.mod.MechaniCraft.Tools.EvilHoe;
import Will11690.mod.MechaniCraft.Tools.EvilPickaxe;
import Will11690.mod.MechaniCraft.Tools.EvilShovel;
import Will11690.mod.MechaniCraft.Tools.GlassAxe;
import Will11690.mod.MechaniCraft.Tools.GlassHoe;
import Will11690.mod.MechaniCraft.Tools.GlassPickaxe;
import Will11690.mod.MechaniCraft.Tools.GlassShovel;
import Will11690.mod.MechaniCraft.Tools.ObsidianAxe;
import Will11690.mod.MechaniCraft.Tools.ObsidianHoe;
import Will11690.mod.MechaniCraft.Tools.ObsidianPickaxe;
import Will11690.mod.MechaniCraft.Tools.ObsidianShovel;
import Will11690.mod.MechaniCraft.Tools.PureAxe;
import Will11690.mod.MechaniCraft.Tools.PureHoe;
import Will11690.mod.MechaniCraft.Tools.PurePickaxe;
import Will11690.mod.MechaniCraft.Tools.PureShovel;
import Will11690.mod.MechaniCraft.Tools.RubyAxe;
import Will11690.mod.MechaniCraft.Tools.RubyHoe;
import Will11690.mod.MechaniCraft.Tools.RubyPickaxe;
import Will11690.mod.MechaniCraft.Tools.RubyShovel;
import Will11690.mod.MechaniCraft.Tools.SapphireAxe;
import Will11690.mod.MechaniCraft.Tools.SapphireHoe;
import Will11690.mod.MechaniCraft.Tools.SapphirePickaxe;
import Will11690.mod.MechaniCraft.Tools.SapphireShovel;
import Will11690.mod.MechaniCraft.Weapons.BronzeSword;
import Will11690.mod.MechaniCraft.Weapons.EmeraldSword;
import Will11690.mod.MechaniCraft.Weapons.EndSword;
import Will11690.mod.MechaniCraft.Weapons.EvilSword;
import Will11690.mod.MechaniCraft.Weapons.GlassSword;
import Will11690.mod.MechaniCraft.Weapons.ObsidianSword;
import Will11690.mod.MechaniCraft.Weapons.PureSword;
import Will11690.mod.MechaniCraft.Weapons.RubySword;
import Will11690.mod.MechaniCraft.Weapons.SapphireSword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="MechaniCraft",name="MechaniCraft",version="1.64D")

@NetworkMod(clientSideRequired=true,serverSideRequired=false, channels = "MechaniCraft", packetHandler = MechaniCraftPacketHandler.class)

public class MechaniCraft {

@Instance("MechaniCraft")
public static MechaniCraft instance = new MechaniCraft();
private GuiHandler guihandler = new GuiHandler();

@SidedProxy(clientSide = "Will11690.mod.MechaniCraft.Common.ClientProxy", serverSide = "Will11690.mod.MechaniCraft.Common.ServerProxy")
public static ServerProxy proxy;

	//Items
	public static Item RubyGem;
	public static Item PureCrystal;
	public static Item EvilCrystal;
	public static Item SapphireGem;
	public static Item EndIngot;
	public static Item GlassIngot;
	public static Item ObsidianChunk;
	public static Item ObsidianIngot;
	public static Item TinIngot;
	public static Item CopperIngot;
	public static Item BronzeIngot;
	public static Item TinNugget;
	public static Item IronNugget;
	public static Item CopperNugget;
	public static Item TinDust;
	public static Item IronDust;
	public static Item CopperDust;
	public static Item GoldDust;
	
	//Food
	public static Item RawLambchop;
	public static Item CookedLambchop;
	
	//Weapons
	public static Item GlassSword;
	public static Item RubySword;
	public static Item EmeraldSword;
	public static Item SapphireSword;
	public static Item ObsidianSword;
	public static Item EndSword;
	public static Item EvilSword;
	public static Item PureSword;
	public static Item BronzeSword;
	
	//Tools
	public static Item GlassHoe;
	public static Item GlassShovel;
	public static Item GlassAxe;
	public static Item GlassPickaxe;
	
	public static Item RubyHoe;
	public static Item RubyShovel;
	public static Item RubyAxe;
	public static Item RubyPickaxe;
	
	public static Item EmeraldHoe;
	public static Item EmeraldShovel;
	public static Item EmeraldAxe;
	public static Item EmeraldPickaxe;
	
	public static Item SapphireHoe;
	public static Item SapphireShovel;
	public static Item SapphireAxe;
	public static Item SapphirePickaxe;
	
	public static Item ObsidianHoe;
	public static Item ObsidianShovel;
	public static Item ObsidianAxe;
	public static Item ObsidianPickaxe;
	
	public static Item EndHoe;
	public static Item EndShovel;
	public static Item EndAxe;
	public static Item EndPickaxe;
	
	public static Item EvilHoe;
	public static Item EvilShovel;
	public static Item EvilAxe;
	public static Item EvilPickaxe;
	
	public static Item PureHoe;
	public static Item PureShovel;
	public static Item PureAxe;
	public static Item PurePickaxe;
	
	public static Item BronzeHoe;
	public static Item BronzeShovel;
	public static Item BronzeAxe;
	public static Item BronzePickaxe;
	
	//Armor
	public static Item GlassHelmet;
	public static Item GlassChestplate;
	public static Item GlassLeggings;
	public static Item GlassBoots;
	
	public static Item RubyHelmet;
	public static Item RubyChestplate;
	public static Item RubyLeggings;
	public static Item RubyBoots;
	
	public static Item EmeraldHelmet;
	public static Item EmeraldChestplate;
	public static Item EmeraldLeggings;
	public static Item EmeraldBoots;
	
	public static Item SapphireHelmet;
	public static Item SapphireChestplate;
	public static Item SapphireLeggings;
	public static Item SapphireBoots;
	
	public static Item ObsidianHelmet;
	public static Item ObsidianChestplate;
	public static Item ObsidianLeggings;
	public static Item ObsidianBoots;
	
	public static Item EndHelmet;
	public static Item EndChestplate;
	public static Item EndLeggings;
	public static Item EndBoots;
	
	public static Item EvilHelmet;
	public static Item EvilChestplate;
	public static Item EvilLeggings;
	public static Item EvilBoots;
	
	public static Item PureHelmet;
	public static Item PureChestplate;
	public static Item PureLeggings;
	public static Item PureBoots;
	
	public static Item BronzeHelmet;
	public static Item BronzeChestplate;
	public static Item BronzeLeggings;
	public static Item BronzeBoots;
	
	//Machine Items
	public static Item OreGrinderBlade;
	public static Item FurnaceSmeltry;
	public static Item MachineFramePart;
	
	//Blocks
	public static Block CopperOre;
	public static Block TinOre;
	public static Block RubyOre;
	public static Block EvilOre;
	public static Block PureOre;
	public static Block SapphireOre;
	public static Block BronzeBlock;
	public static Block EndBlock;
	public static Block TinBlock;
	public static Block CopperBlock;
	public static Block RubyBlock;
	public static Block SapphireBlock;
	public static Block PureGemBlock;
	public static Block EvilGemBlock;
	public static Block ChiseledQuartzBrick;
	public static Block QuartzBrick;
	
	//Machines
	public static Block IronFurnaceIdle;
	public static Block IronFurnaceBurning;
	
	public static Block OreGrinderIdle;
	public static Block OreGrinderBurning;
	
	public static Block MachineFrame;
	
	//OreGen
	public static NewOreGen NewOreGen = new NewOreGen();
	
	//Tool Material
	EnumToolMaterial GlassToolMaterial = EnumHelper.addToolMaterial("Glass", 1, 59, 4.0F, 1, 5);
	EnumToolMaterial RubyToolMaterial = EnumHelper.addToolMaterial("Ruby", 2, 1561, 6.0F, 2, 14);
	EnumToolMaterial EmeraldToolMaterial = EnumHelper.addToolMaterial("Emerald", 3, 2500, 7.0F, 3, 5);
	EnumToolMaterial SapphireToolMaterial = EnumHelper.addToolMaterial("Sapphire", 2, 1561, 6.0F, 2, 14);
	EnumToolMaterial ObsidianToolMaterial = EnumHelper.addToolMaterial("Obsidian", 3, 2400, 8.0F, 4, 10);
	EnumToolMaterial EndToolMaterial = EnumHelper.addToolMaterial("End", 2, 1561, 8.0F, 3, 25);
	EnumToolMaterial EvilToolMaterial = EnumHelper.addToolMaterial("Evil", 3, 2000, 8.0F, 3, 10);
	EnumToolMaterial PureToolMaterial = EnumHelper.addToolMaterial("Pure", 3, 2000, 8.0F, 3, 10);
	EnumToolMaterial BronzeToolMaterial = EnumHelper.addToolMaterial("Bronze", 2, 300, 6.0F, 2, 14);
	
	//Armor Material
	EnumArmorMaterial GlassArmorMaterial = EnumHelper.addArmorMaterial("GlassArmor", 7, new int[]{2, 6, 5, 2}, 9);
	EnumArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmor", 15, new int[]{3, 8, 6, 3}, 10);
	EnumArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("EmeraldArmor", 40, new int[]{3, 8, 6, 3}, 25);
	EnumArmorMaterial SapphireArmorMaterial = EnumHelper.addArmorMaterial("SapphireArmor", 15, new int[]{3, 8, 6, 3}, 10);
	EnumArmorMaterial ObsidianArmorMaterial = EnumHelper.addArmorMaterial("ObsidianArmor", 15, new int[]{3, 8, 6, 3}, 10);
	EnumArmorMaterial EndArmorMaterial = EnumHelper.addArmorMaterial("EndArmor", 40, new int[]{4, 9, 7, 4}, 25);
	EnumArmorMaterial EvilArmorMaterial = EnumHelper.addArmorMaterial("EvilArmor", 15, new int[]{3, 8, 6, 3}, 10);
	EnumArmorMaterial PureArmorMaterial = EnumHelper.addArmorMaterial("PureArmor", 15, new int[]{3, 8, 6, 3}, 10);
	EnumArmorMaterial BronzeArmorMaterial = EnumHelper.addArmorMaterial("BronzeArmor", 15, new int[]{2, 6, 5, 2}, 9);
	
	//CreativeTab
	public CreativeTabs MechaniCraftBlocks;
	public CreativeTabs MechaniCraftCombat;
	public CreativeTabs MechaniCraftTools;
	public CreativeTabs MechaniCraftMachines;
	public CreativeTabs MechaniCraftMisc;
	
@EventHandler
public void PreInit(FMLPreInitializationEvent PreEvent){
	//Cape Stuff
		DevCapesUtil.getInstance().addFileUrl("https://dl.dropboxusercontent.com/s/i82qjc6cvhwjidx/MechaniCraftCapes.txt?token_hash=AAGfxV3KsNJAmwvteHFw0mg5Sn1-yQpNB6A3FPWSu0LtSg&dl=1");
	
	Configuration Config = new Configuration(PreEvent.getSuggestedConfigurationFile());
	
	Config.load();
	
	//Items
	int RubyID = Config.getItem("Ruby", 3840).getInt();
	int PureCrystalID = Config.getItem("PureCrystal", 3841).getInt();
	int EvilCrystalID = Config.getItem("EvilCrystal", 3842).getInt();
	int SapphireID = Config.getItem("Sapphire", 3843).getInt();
	int EndIngotID = Config.getItem("EndIngot", 3844).getInt();
	int GlassIngotID = Config.getItem("GlassIngot", 3845).getInt();
	int ObsidianChunkID = Config.getItem("ObsidianChunk", 3846).getInt();
	int ObsidianIngotID = Config.getItem("ObsidianIngot", 3847).getInt();
	int TinIngotID = Config.getItem("TinIngot", 3848).getInt();
	int CopperIngotID = Config.getItem("CopperIngot", 3849).getInt();
	int BronzeIngotID = Config.getItem("BronzeIngot", 3850).getInt();
	int TinNuggetID = Config.getItem("TinNugget", 3851).getInt();
	int IronNuggetID = Config.getItem("IronNugget", 3852).getInt();
	int CopperNuggetID = Config.getItem("CopperNugget", 3853).getInt();
	int TinDustID = Config.getItem("TinDust", 3854).getInt();
	int IronDustID = Config.getItem("IronDust", 3855).getInt();
	int CopperDustID = Config.getItem("CopperDust", 3856).getInt();
	int GoldDustID = Config.getItem("GoldDust", 3857).getInt();
	
	//Machine Items
	int OreGrinderBladeID = Config.getItem("OreGrinderBlade", 3858).getInt();
	int FurnaceSmeltryID = Config.getItem("FurnaceSmeltry", 3859).getInt();
	int MachineFramePartID = Config.getItem("MachineFramePart", 3860).getInt();
	
	//Food
	int RawLambchopID = Config.getItem("RawLambchop", 3870).getInt();
	int CookedLambchopID = Config.getItem("CookedLambchop", 3871).getInt();
	
	//Weapons
	int GlassSwordID = Config.getItem("GlassSword", 3900).getInt();
	int RubySwordID = Config.getItem("RubySword", 3901).getInt();
	int EmeraldSwordID = Config.getItem("EmeraldSword", 3902).getInt();
	int SapphireSwordID = Config.getItem("SapphireSword", 3903).getInt();
	int ObsidianSwordID = Config.getItem("ObsidianSword", 3904).getInt();
	int EndSwordID = Config.getItem("EndSword", 3905).getInt();
	int EvilSwordID = Config.getItem("EvilSword", 3906).getInt();
	int PureSwordID = Config.getItem("PureSword", 3907).getInt();
	int BronzeSwordID = Config.getItem("BronzeSword", 3908).getInt();
	
	//Tools
	int GlassHoeID = Config.getItem("GlassHoe", 3909).getInt();
	int GlassShovelID = Config.getItem("GlassShovel", 3910).getInt();
	int GlassAxeID = Config.getItem("GlassAxe", 3911).getInt();
	int GlassPickaxeID = Config.getItem("GlassPickaxe", 3912).getInt();
	
	int RubyHoeID = Config.getItem("RubyHoe", 3913).getInt();
	int RubyShovelID = Config.getItem("RubyShovel", 3914).getInt();
	int RubyAxeID = Config.getItem("RubyAxe", 3915).getInt();
	int RubyPickaxeID = Config.getItem("RubyPickaxe", 3916).getInt();
	
	int EmeraldHoeID = Config.getItem("EmeraldHoe", 3917).getInt();
	int EmeraldShovelID = Config.getItem("EmeraldShovel", 3918).getInt();
	int EmeraldAxeID = Config.getItem("EmeraldAxe", 3919).getInt();
	int EmeraldPickaxeID = Config.getItem("EmeraldPickaxe", 3920).getInt();
	
	int SapphireHoeID = Config.getItem("SapphireHoe", 3921).getInt();
	int SapphireShovelID = Config.getItem("SapphireShovel", 3922).getInt();
	int SapphireAxeID = Config.getItem("SapphireAxe", 3923).getInt();
	int SapphirePickaxeID = Config.getItem("SapphirePickaxe", 3924).getInt();
	
	int ObsidianHoeID = Config.getItem("ObsidianHoe", 3925).getInt();
	int ObsidianShovelID = Config.getItem("ObsidianShovel", 3926).getInt();
	int ObsidianAxeID = Config.getItem("ObsidianAxe", 3927).getInt();
	int ObsidianPickaxeID = Config.getItem("ObsidianPickaxe", 3928).getInt();
	
	int EndHoeID = Config.getItem("EndHoe", 3929).getInt();
	int EndShovelID = Config.getItem("EndShovel", 3930).getInt();
	int EndAxeID = Config.getItem("EndAxe", 3931).getInt();
	int EndPickaxeID = Config.getItem("EndPickaxe", 3932).getInt();
	
	int EvilHoeID = Config.getItem("EvilHoe", 3933).getInt();
	int EvilShovelID = Config.getItem("EvilShovel", 3934).getInt();
	int EvilAxeID = Config.getItem("EvilAxe", 3935).getInt();
	int EvilPickaxeID = Config.getItem("EvilPickaxe", 3936).getInt();
	
	int PureHoeID = Config.getItem("PureHoe", 3937).getInt();
	int PureShovelID = Config.getItem("PureShovel", 3938).getInt();
	int PureAxeID = Config.getItem("PureAxe", 3939).getInt();
	int PurePickaxeID = Config.getItem("PurePickaxe", 3940).getInt();
	
	int BronzeHoeID = Config.getItem("BronzeHoe", 3941).getInt();
	int BronzeShovelID = Config.getItem("BronzeShovel", 3942).getInt();
	int BronzeAxeID = Config.getItem("BronzeAxe", 3943).getInt();
	int BronzePickaxeID = Config.getItem("BronzePickaxe", 3944).getInt();
	
	//Armor
	int GlassHelmetID = Config.getItem("GlassHelmet", 4000).getInt();
	int GlassChestplateID = Config.getItem("GlassChestplate", 4001).getInt();
	int GlassLeggingsID = Config.getItem("GlassLeggings", 4002).getInt();
	int GlassBootsID = Config.getItem("GlassBoots", 4003).getInt();
	
	int RubyHelmetID = Config.getItem("RubyHelmet", 4004).getInt();
	int RubyChestplateID = Config.getItem("RubyChestplate", 4005).getInt();
	int RubyLeggingsID = Config.getItem("RubyLeggings", 4006).getInt();
	int RubyBootsID = Config.getItem("RubyBoots", 4007).getInt();
	
	int EmeraldHelmetID = Config.getItem("EmeraldHelmet", 4008).getInt();
	int EmeraldChestplateID = Config.getItem("EmeraldChestplate", 4009).getInt();
	int EmeraldLeggingsID = Config.getItem("EmeraldLeggings", 4010).getInt();
	int EmeraldBootsID = Config.getItem("EmeraldBoots", 4011).getInt();
	
	int SapphireHelmetID = Config.getItem("SapphireHelmet", 4012).getInt();
	int SapphireChestplateID = Config.getItem("SapphireChestplate", 4013).getInt();
	int SapphireLeggingsID = Config.getItem("SapphireLeggings", 4014).getInt();
	int SapphireBootsID = Config.getItem("SapphireBoots", 4015).getInt();
	
	int ObsidianHelmetID = Config.getItem("ObsidianHelmet", 4016).getInt();
	int ObsidianChestplateID = Config.getItem("ObsidianChestplate", 4017).getInt();
	int ObsidianLeggingsID = Config.getItem("ObsidianLeggings", 4018).getInt();
	int ObsidianBootsID = Config.getItem("ObsidianBoots", 4019).getInt();
	
	int EndHelmetID = Config.getItem("EndHelmet", 4020).getInt();
	int EndChestplateID = Config.getItem("EndChestplate", 4021).getInt();
	int EndLeggingsID = Config.getItem("EndLeggings", 4022).getInt();
	int EndBootsID = Config.getItem("EndBoots", 4023).getInt();
	
	int EvilHelmetID = Config.getItem("EvilHelmet", 4024).getInt();
	int EvilChestplateID = Config.getItem("EvilChestplate", 4025).getInt();
	int EvilLeggingsID = Config.getItem("EvilLeggings", 4026).getInt();
	int EvilBootsID = Config.getItem("EvilBoots", 4027).getInt();
	
	int PureHelmetID = Config.getItem("PureHelmet", 4028).getInt();
	int PureChestplateID = Config.getItem("PureChestplate", 4029).getInt();
	int PureLeggingsID = Config.getItem("PureLeggings", 4030).getInt();
	int PureBootsID = Config.getItem("PureBoots", 4031).getInt();
	
	int BronzeHelmetID = Config.getItem("BronzeHelmet", 4032).getInt();
	int BronzeChestplateID = Config.getItem("BronzeChestplate", 4033).getInt();
	int BronzeLeggingsID = Config.getItem("BronzeLeggings", 4034).getInt();
	int BronzeBootsID = Config.getItem("BronzeBoots", 4035).getInt();
	
	//Blocks
	int CopperOreID = Config.getBlock("CopperOre", 3500).getInt();
	int TinOreID = Config.getBlock("TinOre", 3501).getInt();
	int RubyOreID = Config.getBlock("RubyOre", 3502).getInt();
	int EvilOreID = Config.getBlock("EvilOre", 3503).getInt();
	int PureOreID = Config.getBlock("PureOre", 3504).getInt();
	int SapphireOreID = Config.getBlock("SapphireOre", 3505).getInt();
	int BronzeBlockID = Config.getBlock("BronzeBlock", 3506).getInt();
	int EndBlockID = Config.getBlock("EndBlock", 3507).getInt();
	int TinBlockID = Config.getBlock("TinBlock", 3508).getInt();
	int CopperBlockID = Config.getBlock("CopperBlock", 3509).getInt();
	int RubyBlockID = Config.getBlock("RubyBlock", 3510).getInt();
	int SapphireBlockID = Config.getBlock("SapphireBlock", 3511).getInt();
	int PureGemBlockID = Config.getBlock("PureGemBlock", 3512).getInt();
	int EvilGemBlockID = Config.getBlock("EvilGemBlock", 3513).getInt();
	
	int ChiseledQuartzBrickID = Config.getBlock("ChiseledQuartzBrick", 3514).getInt();
	int QuartzBrickID = Config.getBlock("QuartzBrick", 3515).getInt();
	
	//Machines
	int IronFurnaceIdleID = Config.getBlock("IronFurnaceIdle", 3516).getInt();
	int IronFurnaceBurningID = Config.getBlock("IronFurnaceBurning", 3517).getInt();
	
	int OreGrinderIdleID = Config.getBlock("OreGrinderIdle", 3518).getInt();
	int OreGrinderBurningID = Config.getBlock("OreGrinderBurning", 3519).getInt();
	
	int MachineFrameID = Config.getBlock("MachineFrame", 3520).getInt();
	
	
	
	Config.save();
	
	MechaniCraftBlocks = new CreativeTabs("MechaniCraftBlocks"){ public ItemStack getIconItemStack(){ return new ItemStack(Block.obsidian);}};
	MechaniCraftCombat = new CreativeTabs("MechaniCraftCombat"){ public ItemStack getIconItemStack(){ return new ItemStack(MechaniCraft.ObsidianSword);}};
	MechaniCraftTools = new CreativeTabs("MechaniCraftTools"){ public ItemStack getIconItemStack(){ return new ItemStack(MechaniCraft.ObsidianPickaxe);}};
	MechaniCraftMachines = new CreativeTabs("MechaniCraftMachines"){ public ItemStack getIconItemStack(){ return new ItemStack(MechaniCraft.IronFurnaceBurning);}};
	MechaniCraftMisc = new CreativeTabs("MechaniCraftMisc"){ public ItemStack getIconItemStack(){ return new ItemStack(MechaniCraft.ObsidianIngot);}};
	
	LanguageRegistry.instance().addStringLocalization("itemGroup.MechaniCraftBlocks", "en_US", "MechaniCraft Blocks");
	LanguageRegistry.instance().addStringLocalization("itemGroup.MechaniCraftCombat", "en_US", "MechaniCraft Combat");
	LanguageRegistry.instance().addStringLocalization("itemGroup.MechaniCraftTools", "en_US", "MechaniCraft Tools");
	LanguageRegistry.instance().addStringLocalization("itemGroup.MechaniCraftMachines", "en_US", "MechaniCraft Machines");
	LanguageRegistry.instance().addStringLocalization("itemGroup.MechaniCraftMisc", "en_US", "MechaniCraft Misc");
	
	proxy.registerServerTickHandler();
	
	//Items
	RubyGem = new Ruby(RubyID).setUnlocalizedName("Ruby").setCreativeTab(MechaniCraftMisc);
	PureCrystal = new PureCrystal(PureCrystalID).setUnlocalizedName("PureCrystal").setCreativeTab(MechaniCraftMisc);
	EvilCrystal = new EvilCrystal(EvilCrystalID).setUnlocalizedName("EvilCrystal").setCreativeTab(MechaniCraftMisc);
	SapphireGem = new Sapphire(SapphireID).setUnlocalizedName("Sapphire").setCreativeTab(MechaniCraftMisc);
	EndIngot = new EndIngot(EndIngotID).setUnlocalizedName("EndIngot").setCreativeTab(MechaniCraftMisc);
	GlassIngot = new GlassIngot(GlassIngotID).setUnlocalizedName("GlassIngot").setCreativeTab(MechaniCraftMisc);
	ObsidianChunk = new ObsidianChunk(ObsidianChunkID).setUnlocalizedName("ObsidianChunk").setCreativeTab(MechaniCraftMisc);
	ObsidianIngot = new ObsidianIngot(ObsidianIngotID).setUnlocalizedName("ObsidianIngot").setCreativeTab(MechaniCraftMisc);
	TinIngot = new TinIngot(TinIngotID).setUnlocalizedName("TinIngot").setCreativeTab(MechaniCraftMisc);
	CopperIngot = new CopperIngot(CopperIngotID).setUnlocalizedName("CopperIngot").setCreativeTab(MechaniCraftMisc);
	BronzeIngot = new BronzeIngot(BronzeIngotID).setUnlocalizedName("BronzeIngot").setCreativeTab(MechaniCraftMisc);
	TinNugget = new TinNugget(TinNuggetID).setUnlocalizedName("TinNugget").setCreativeTab(MechaniCraftMisc);
	IronNugget = new IronNugget(IronNuggetID).setUnlocalizedName("IronNugget").setCreativeTab(MechaniCraftMisc);
	CopperNugget = new CopperNugget(CopperNuggetID).setUnlocalizedName("CopperNugget").setCreativeTab(MechaniCraftMisc);
	TinDust = new TinDust(TinDustID).setUnlocalizedName("TinDust").setCreativeTab(MechaniCraftMisc);
	IronDust = new IronDust(IronDustID).setUnlocalizedName("IronDust").setCreativeTab(MechaniCraftMisc);
	CopperDust = new CopperDust(CopperDustID).setUnlocalizedName("CopperDust").setCreativeTab(MechaniCraftMisc);
	GoldDust = new GoldDust(GoldDustID).setUnlocalizedName("GoldDust").setCreativeTab(MechaniCraftMisc);
	
	//Food
	RawLambchop = new RawLambchop(RawLambchopID, 3, 0.3F, true).setUnlocalizedName("RawLambchop").setCreativeTab(CreativeTabs.tabFood);
	CookedLambchop = new CookedLambchop(CookedLambchopID, 8, 0.8F, false).setUnlocalizedName("CookedLambchop").setCreativeTab(CreativeTabs.tabFood);
	
	//Weapons
	GlassSword = new GlassSword(GlassSwordID, GlassToolMaterial).setUnlocalizedName("GlassSword").setCreativeTab(this.MechaniCraftCombat);
	RubySword = new RubySword(RubySwordID, RubyToolMaterial).setUnlocalizedName("RubySword").setCreativeTab(this.MechaniCraftCombat);
	EmeraldSword = new EmeraldSword(EmeraldSwordID, EmeraldToolMaterial).setUnlocalizedName("EmeraldSword").setCreativeTab(this.MechaniCraftCombat);
	SapphireSword = new SapphireSword(SapphireSwordID, SapphireToolMaterial).setUnlocalizedName("SapphireSword").setCreativeTab(this.MechaniCraftCombat);
	ObsidianSword = new ObsidianSword(ObsidianSwordID, ObsidianToolMaterial).setUnlocalizedName("ObsidianSword").setCreativeTab(this.MechaniCraftCombat);
	EndSword = new EndSword(EndSwordID, EndToolMaterial).setUnlocalizedName("EndSword").setCreativeTab(this.MechaniCraftCombat);
	EvilSword = new EvilSword(EvilSwordID, EvilToolMaterial).setUnlocalizedName("EvilSword").setCreativeTab(this.MechaniCraftCombat);
	PureSword = new PureSword(PureSwordID, PureToolMaterial).setUnlocalizedName("PureSword").setCreativeTab(this.MechaniCraftCombat);
	BronzeSword = new BronzeSword(BronzeSwordID, BronzeToolMaterial).setUnlocalizedName("BronzeSword").setCreativeTab(this.MechaniCraftCombat);
	
	//Tools
	GlassHoe = new GlassHoe(GlassHoeID, GlassToolMaterial).setUnlocalizedName("GlassHoe").setCreativeTab(this.MechaniCraftTools);
	GlassShovel = new GlassShovel(GlassShovelID, GlassToolMaterial).setUnlocalizedName("GlassShovel").setCreativeTab(this.MechaniCraftTools);
	GlassAxe = new GlassAxe(GlassAxeID, GlassToolMaterial).setUnlocalizedName("GlassAxe").setCreativeTab(this.MechaniCraftTools);
	GlassPickaxe = new GlassPickaxe(GlassPickaxeID, GlassToolMaterial).setUnlocalizedName("GlassPickaxe").setCreativeTab(this.MechaniCraftTools);
	
	RubyHoe = new RubyHoe(RubyHoeID, RubyToolMaterial).setUnlocalizedName("RubyHoe").setCreativeTab(this.MechaniCraftTools);
	RubyShovel = new RubyShovel(RubyShovelID, RubyToolMaterial).setUnlocalizedName("RubyShovel").setCreativeTab(this.MechaniCraftTools);
	RubyAxe = new RubyAxe(RubyAxeID, RubyToolMaterial).setUnlocalizedName("RubyAxe").setCreativeTab(this.MechaniCraftTools);
	RubyPickaxe = new RubyPickaxe(RubyPickaxeID, RubyToolMaterial).setUnlocalizedName("RubyPickaxe").setCreativeTab(this.MechaniCraftTools);
	
	EmeraldHoe = new EmeraldHoe(EmeraldHoeID, EmeraldToolMaterial).setUnlocalizedName("EmeraldHoe").setCreativeTab(this.MechaniCraftTools);
	EmeraldShovel = new EmeraldShovel(EmeraldShovelID, EmeraldToolMaterial).setUnlocalizedName("EmeraldShovel").setCreativeTab(this.MechaniCraftTools);
	EmeraldAxe = new EmeraldAxe(EmeraldAxeID, EmeraldToolMaterial).setUnlocalizedName("EmeraldAxe").setCreativeTab(this.MechaniCraftTools);
	EmeraldPickaxe = new EmeraldPickaxe(EmeraldPickaxeID, EmeraldToolMaterial).setUnlocalizedName("EmeraldPickaxe").setCreativeTab(this.MechaniCraftTools);
	
	SapphireHoe = new SapphireHoe(SapphireHoeID, SapphireToolMaterial).setUnlocalizedName("SapphireHoe").setCreativeTab(this.MechaniCraftTools);
	SapphireShovel = new SapphireShovel(SapphireShovelID, SapphireToolMaterial).setUnlocalizedName("SapphireShovel").setCreativeTab(this.MechaniCraftTools);
	SapphireAxe = new SapphireAxe(SapphireAxeID, SapphireToolMaterial).setUnlocalizedName("SapphireAxe").setCreativeTab(this.MechaniCraftTools);
	SapphirePickaxe = new SapphirePickaxe(SapphirePickaxeID, SapphireToolMaterial).setUnlocalizedName("SapphirePickaxe").setCreativeTab(this.MechaniCraftTools);
	
	ObsidianHoe = new ObsidianHoe(ObsidianHoeID, ObsidianToolMaterial).setUnlocalizedName("ObsidianHoe").setCreativeTab(this.MechaniCraftTools);
	ObsidianShovel = new ObsidianShovel(ObsidianShovelID, ObsidianToolMaterial).setUnlocalizedName("ObsidianShovel").setCreativeTab(this.MechaniCraftTools);
	ObsidianAxe = new ObsidianAxe(ObsidianAxeID, ObsidianToolMaterial).setUnlocalizedName("ObsidianAxe").setCreativeTab(this.MechaniCraftTools);
	ObsidianPickaxe = new ObsidianPickaxe(ObsidianPickaxeID, ObsidianToolMaterial).setUnlocalizedName("ObsidianPickaxe").setCreativeTab(this.MechaniCraftTools);
	
	EndHoe = new EndHoe(EndHoeID, EndToolMaterial).setUnlocalizedName("EndHoe").setCreativeTab(this.MechaniCraftTools);
	EndShovel = new EndShovel(EndShovelID, EndToolMaterial).setUnlocalizedName("EndShovel").setCreativeTab(this.MechaniCraftTools);
	EndAxe = new EndAxe(EndAxeID, EndToolMaterial).setUnlocalizedName("EndAxe").setCreativeTab(this.MechaniCraftTools);
	EndPickaxe = new EndPickaxe(EndPickaxeID, EndToolMaterial).setUnlocalizedName("EndPickaxe").setCreativeTab(this.MechaniCraftTools);
	
	EvilHoe = new EvilHoe(EvilHoeID, EvilToolMaterial).setUnlocalizedName("EvilHoe").setCreativeTab(this.MechaniCraftTools);
	EvilShovel = new EvilShovel(EvilShovelID, EvilToolMaterial).setUnlocalizedName("EvilShovel").setCreativeTab(this.MechaniCraftTools);
	EvilAxe = new EvilAxe(EvilAxeID, EvilToolMaterial).setUnlocalizedName("EvilAxe").setCreativeTab(this.MechaniCraftTools);
	EvilPickaxe = new EvilPickaxe(EvilPickaxeID, EvilToolMaterial).setUnlocalizedName("EvilPickaxe").setCreativeTab(this.MechaniCraftTools);
	
	PureHoe = new PureHoe(PureHoeID, PureToolMaterial).setUnlocalizedName("PureHoe").setCreativeTab(this.MechaniCraftTools);
	PureShovel = new PureShovel(PureShovelID, PureToolMaterial).setUnlocalizedName("PureShovel").setCreativeTab(this.MechaniCraftTools);
	PureAxe = new PureAxe(PureAxeID, PureToolMaterial).setUnlocalizedName("PureAxe").setCreativeTab(this.MechaniCraftTools);
	PurePickaxe = new PurePickaxe(PurePickaxeID, PureToolMaterial).setUnlocalizedName("PurePickaxe").setCreativeTab(this.MechaniCraftTools);
	
	BronzeHoe = new BronzeHoe(BronzeHoeID, BronzeToolMaterial).setUnlocalizedName("BronzeHoe").setCreativeTab(this.MechaniCraftTools);
	BronzeShovel = new BronzeShovel(BronzeShovelID, BronzeToolMaterial).setUnlocalizedName("BronzeShovel").setCreativeTab(this.MechaniCraftTools);
	BronzeAxe = new BronzeAxe(BronzeAxeID, BronzeToolMaterial).setUnlocalizedName("BronzeAxe").setCreativeTab(this.MechaniCraftTools);
	BronzePickaxe = new BronzePickaxe(BronzePickaxeID, BronzeToolMaterial).setUnlocalizedName("BronzePickaxe").setCreativeTab(this.MechaniCraftTools);
	
	//Armor
	GlassHelmet = new GlassHelmet(GlassHelmetID, GlassArmorMaterial, proxy.addArmor("GlassArmor"), 0).setUnlocalizedName("GlassHelmet").setCreativeTab(this.MechaniCraftCombat);
	GlassChestplate = new GlassChestplate(GlassChestplateID, GlassArmorMaterial, proxy.addArmor("GlassArmor"), 1).setUnlocalizedName("GlassChestplate").setCreativeTab(this.MechaniCraftCombat);
	GlassLeggings = new GlassLeggings(GlassLeggingsID, GlassArmorMaterial, proxy.addArmor("GlassArmor"), 2).setUnlocalizedName("GlassLeggings").setCreativeTab(this.MechaniCraftCombat);
	GlassBoots = new GlassBoots(GlassBootsID, GlassArmorMaterial, proxy.addArmor("GlassArmor"), 3).setUnlocalizedName("GlassBoots").setCreativeTab(this.MechaniCraftCombat);
	
	RubyHelmet = new RubyHelmet(RubyHelmetID, RubyArmorMaterial, proxy.addArmor("RubyArmor"), 0).setUnlocalizedName("RubyHelmet").setCreativeTab(this.MechaniCraftCombat);
	RubyChestplate = new RubyChestplate(RubyChestplateID, RubyArmorMaterial, proxy.addArmor("RubyArmor"), 1).setUnlocalizedName("RubyChestplate").setCreativeTab(this.MechaniCraftCombat);
	RubyLeggings = new RubyLeggings(RubyLeggingsID, RubyArmorMaterial, proxy.addArmor("RubyArmor"), 2).setUnlocalizedName("RubyLeggings").setCreativeTab(this.MechaniCraftCombat);
	RubyBoots = new RubyBoots(RubyBootsID, RubyArmorMaterial, proxy.addArmor("RubyArmor"), 3).setUnlocalizedName("RubyBoots").setCreativeTab(this.MechaniCraftCombat);
	
	EmeraldHelmet = new EmeraldHelmet(EmeraldHelmetID, EmeraldArmorMaterial, proxy.addArmor("EmeraldArmor"), 0).setUnlocalizedName("EmeraldHelmet").setCreativeTab(this.MechaniCraftCombat);
	EmeraldChestplate = new EmeraldChestplate(EmeraldChestplateID, EmeraldArmorMaterial, proxy.addArmor("EmeraldArmor"), 1).setUnlocalizedName("EmeraldChestplate").setCreativeTab(this.MechaniCraftCombat);
	EmeraldLeggings = new EmeraldLeggings(EmeraldLeggingsID, EmeraldArmorMaterial, proxy.addArmor("EmeraldArmor"), 2).setUnlocalizedName("EmeraldLeggings").setCreativeTab(this.MechaniCraftCombat);
	EmeraldBoots = new EmeraldBoots(EmeraldBootsID, EmeraldArmorMaterial, proxy.addArmor("EmeraldArmor"), 3).setUnlocalizedName("EmeraldBoots").setCreativeTab(this.MechaniCraftCombat);
	
	SapphireHelmet = new SapphireHelmet(SapphireHelmetID, SapphireArmorMaterial, proxy.addArmor("SapphireArmor"), 0).setUnlocalizedName("SapphireHelmet").setCreativeTab(this.MechaniCraftCombat);
	SapphireChestplate = new SapphireChestplate(SapphireChestplateID, SapphireArmorMaterial, proxy.addArmor("SapphireArmor"), 1).setUnlocalizedName("SapphireChestplate").setCreativeTab(this.MechaniCraftCombat);
	SapphireLeggings = new SapphireLeggings(SapphireLeggingsID, SapphireArmorMaterial, proxy.addArmor("SapphireArmor"), 2).setUnlocalizedName("SapphireLeggings").setCreativeTab(this.MechaniCraftCombat);
	SapphireBoots = new SapphireBoots(SapphireBootsID, SapphireArmorMaterial, proxy.addArmor("SapphireArmor"), 3).setUnlocalizedName("SapphireBoots").setCreativeTab(this.MechaniCraftCombat);
	
	ObsidianHelmet = new ObsidianHelmet(ObsidianHelmetID, ObsidianArmorMaterial, proxy.addArmor("ObsidianArmor"), 0).setUnlocalizedName("ObsidianHelmet").setCreativeTab(this.MechaniCraftCombat);
	ObsidianChestplate = new ObsidianChestplate(ObsidianChestplateID, ObsidianArmorMaterial, proxy.addArmor("ObsidianArmor"), 1).setUnlocalizedName("ObsidianChestplate").setCreativeTab(this.MechaniCraftCombat);
	ObsidianLeggings = new ObsidianLeggings(ObsidianLeggingsID, ObsidianArmorMaterial, proxy.addArmor("ObsidianArmor"), 2).setUnlocalizedName("ObsidianLeggings").setCreativeTab(this.MechaniCraftCombat);
	ObsidianBoots = new ObsidianBoots(ObsidianBootsID, ObsidianArmorMaterial, proxy.addArmor("ObsidianArmor"), 3).setUnlocalizedName("ObsidianBoots").setCreativeTab(this.MechaniCraftCombat);
	
	EndHelmet = new EndHelmet(EndHelmetID, EndArmorMaterial, proxy.addArmor("EndArmor"), 0).setUnlocalizedName("EndHelmet").setCreativeTab(this.MechaniCraftCombat);
	EndChestplate = new EndChestplate(EndChestplateID, EndArmorMaterial, proxy.addArmor("EndArmor"), 1).setUnlocalizedName("EndChestplate").setCreativeTab(this.MechaniCraftCombat);
	EndLeggings = new EndLeggings(EndLeggingsID, EndArmorMaterial, proxy.addArmor("EndArmor"), 2).setUnlocalizedName("EndLeggings").setCreativeTab(this.MechaniCraftCombat);
	EndBoots = new EndBoots(EndBootsID, EndArmorMaterial, proxy.addArmor("EndArmor"), 3).setUnlocalizedName("EndBoots").setCreativeTab(this.MechaniCraftCombat);
	
	EvilHelmet = new EvilHelmet(EvilHelmetID, EvilArmorMaterial, proxy.addArmor("EvilArmor"), 0).setUnlocalizedName("EvilHelmet").setCreativeTab(this.MechaniCraftCombat);
	EvilChestplate = new EvilChestplate(EvilChestplateID, EvilArmorMaterial, proxy.addArmor("EvilArmor"), 1).setUnlocalizedName("EvilChestplate").setCreativeTab(this.MechaniCraftCombat);
	EvilLeggings = new EvilLeggings(EvilLeggingsID, EvilArmorMaterial, proxy.addArmor("EvilArmor"), 2).setUnlocalizedName("EvilLeggings").setCreativeTab(this.MechaniCraftCombat);
	EvilBoots = new EvilBoots(EvilBootsID, EvilArmorMaterial, proxy.addArmor("EvilArmor"), 3).setUnlocalizedName("EvilBoots").setCreativeTab(this.MechaniCraftCombat);
	
	PureHelmet = new PureHelmet(PureHelmetID, PureArmorMaterial, proxy.addArmor("PureArmor"), 0).setUnlocalizedName("PureHelmet").setCreativeTab(this.MechaniCraftCombat);
	PureChestplate = new PureChestplate(PureChestplateID, PureArmorMaterial, proxy.addArmor("PureArmor"), 1).setUnlocalizedName("PureChestplate").setCreativeTab(this.MechaniCraftCombat);
	PureLeggings = new PureLeggings(PureLeggingsID, PureArmorMaterial, proxy.addArmor("PureArmor"), 2).setUnlocalizedName("PureLeggings").setCreativeTab(this.MechaniCraftCombat);
	PureBoots = new PureBoots(PureBootsID, PureArmorMaterial, proxy.addArmor("PureArmor"), 3).setUnlocalizedName("PureBoots").setCreativeTab(this.MechaniCraftCombat);
	
	BronzeHelmet = new BronzeHelmet(BronzeHelmetID, BronzeArmorMaterial, proxy.addArmor("BronzeArmor"), 0).setUnlocalizedName("BronzeHelmet").setCreativeTab(this.MechaniCraftCombat);
	BronzeChestplate = new BronzeChestplate(BronzeChestplateID, BronzeArmorMaterial, proxy.addArmor("BronzeArmor"), 1).setUnlocalizedName("BronzeChestplate").setCreativeTab(this.MechaniCraftCombat);
	BronzeLeggings = new BronzeLeggings(BronzeLeggingsID, BronzeArmorMaterial, proxy.addArmor("BronzeArmor"), 2).setUnlocalizedName("BronzeLeggings").setCreativeTab(this.MechaniCraftCombat);
	BronzeBoots = new BronzeBoots(BronzeBootsID, BronzeArmorMaterial, proxy.addArmor("BronzeArmor"), 3).setUnlocalizedName("BronzeBoots").setCreativeTab(this.MechaniCraftCombat);
	
	//Blocks
	CopperOre = new CopperOre(CopperOreID, 2).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("CopperOre").setCreativeTab(MechaniCraftBlocks);
	TinOre = new TinOre(TinOreID, 2).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("TinOre").setCreativeTab(MechaniCraftBlocks);
	RubyOre = new RubyOre(RubyOreID, 2).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("RubyOre").setCreativeTab(MechaniCraftBlocks);
	EvilOre = new EvilOre(EvilOreID, 3).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("EvilOre").setCreativeTab(MechaniCraftBlocks);
	PureOre = new PureOre(PureOreID, 3).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("PureOre").setCreativeTab(MechaniCraftBlocks);
	SapphireOre = new SapphireOre(SapphireOreID, 3).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("SapphireOre").setCreativeTab(MechaniCraftBlocks);
	BronzeBlock = new BronzeBlock(BronzeBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("BronzeBlock").setCreativeTab(MechaniCraftBlocks);
	EndBlock = new EndBlock(EndBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("EndBlock").setCreativeTab(MechaniCraftBlocks);
	TinBlock = new TinBlock(TinBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("TinBlock").setCreativeTab(MechaniCraftBlocks);
	CopperBlock = new CopperBlock(CopperBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("CopperBlock").setCreativeTab(MechaniCraftBlocks);
	RubyBlock = new RubyBlock(RubyBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("RubyBlock").setCreativeTab(MechaniCraftBlocks);
	SapphireBlock = new SapphireBlock(SapphireBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("SapphireBlock").setCreativeTab(MechaniCraftBlocks);
	PureGemBlock = new PureGemBlock(PureGemBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("PureGemBlock").setCreativeTab(MechaniCraftBlocks);
	EvilGemBlock = new EvilGemBlock(EvilGemBlockID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("EvilGemBlock").setCreativeTab(MechaniCraftBlocks);
	
	ChiseledQuartzBrick = new ChiseledQuartzBrick(ChiseledQuartzBrickID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("ChiseledQuartzBrick").setCreativeTab(MechaniCraftBlocks);
	QuartzBrick = new QuartzBrick(QuartzBrickID, 1).setHardness(1.5F).setResistance(0.25F).setUnlocalizedName("QuartzBrick").setCreativeTab(MechaniCraftBlocks);
	
	//Machines
	IronFurnaceIdle = new IronFurnace(IronFurnaceIdleID, false).setHardness(3.5F).setUnlocalizedName("IronFurnaceIdle").setCreativeTab(this.MechaniCraftMachines);
	IronFurnaceBurning = new IronFurnace(IronFurnaceBurningID, true).setHardness(3.5F).setUnlocalizedName("IronFurnaceBurning");
	
	OreGrinderIdle = new OreGrinder(OreGrinderIdleID, false).setHardness(3.5F).setUnlocalizedName("OreGrinderIdle").setCreativeTab(this.MechaniCraftMachines);
	OreGrinderBurning = new OreGrinder(OreGrinderBurningID, true).setHardness(3.5F).setUnlocalizedName("OreGrinderBurning");
	
	MachineFrame = new MachineFrame(MachineFrameID, 1).setHardness(3.5F).setUnlocalizedName("MachineFrame").setCreativeTab(this.MechaniCraftMachines);
	
	//Machine Items
	OreGrinderBlade = new OreGrinderBlade(OreGrinderBladeID).setUnlocalizedName("OreGrinderBlade").setCreativeTab(this.MechaniCraftMachines);
	FurnaceSmeltry = new FurnaceSmeltry(FurnaceSmeltryID).setUnlocalizedName("FurnaceSmeltry").setCreativeTab(this.MechaniCraftMachines);
	MachineFramePart = new MachineFramePart(MachineFramePartID).setUnlocalizedName("MachineFramePart").setCreativeTab(this.MechaniCraftMachines);
	
	//Block Harvest Level
	
		//Blocks
		MinecraftForge.setBlockHarvestLevel(RubyOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SapphireOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(EvilOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(PureOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(BronzeBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(EndBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(TinBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(CopperBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(TinOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SapphireBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(RubyBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(PureGemBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(EvilGemBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ChiseledQuartzBrick, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(QuartzBrick, "pickaxe", 1);
	
//GameRegistery
		
	//OreGen
	GameRegistry.registerWorldGenerator(NewOreGen);
		
	//Items
	GameRegistry.registerItem(RubyGem, "RubyGem");
	GameRegistry.registerItem(PureCrystal, "PureCrystal");
	GameRegistry.registerItem(EvilCrystal, "EvilCrystal");
	GameRegistry.registerItem(SapphireGem, "SapphireGem");
	GameRegistry.registerItem(EndIngot, "EndIngot");
	GameRegistry.registerItem(GlassIngot, "GlassIngot");
	GameRegistry.registerItem(ObsidianChunk, "ObsidianChunk");
	GameRegistry.registerItem(ObsidianIngot, "ObsidianIngot");
	GameRegistry.registerItem(TinIngot, "TinIngot");
	GameRegistry.registerItem(CopperIngot, "CopperIngot");
	GameRegistry.registerItem(BronzeIngot, "BronzeIngot");
	GameRegistry.registerItem(TinNugget, "TinNugget");
	GameRegistry.registerItem(IronNugget, "IronNugget");
	GameRegistry.registerItem(CopperNugget, "CopperNugget");
	GameRegistry.registerItem(TinDust, "TinDust");
	GameRegistry.registerItem(IronDust, "IronDust");
	GameRegistry.registerItem(CopperDust, "CopperDust");
	GameRegistry.registerItem(GoldDust, "GoldDust");
	
	//Machine Items
	GameRegistry.registerItem(MachineFramePart, "MachineFramePart");
	GameRegistry.registerItem(OreGrinderBlade, "OreGrinderBlade");
	GameRegistry.registerItem(FurnaceSmeltry, "FurnaceSmeltry");

	//Food
	GameRegistry.registerItem(RawLambchop, "RawLambchop");
	GameRegistry.registerItem(CookedLambchop, "CookedLambchop");
	
	//Weapons
	GameRegistry.registerItem(GlassSword, "GlassSword");
	GameRegistry.registerItem(RubySword, "RubySword");
	GameRegistry.registerItem(EmeraldSword, "EmeraldSword");
	GameRegistry.registerItem(SapphireSword, "SapphireSword");
	GameRegistry.registerItem(ObsidianSword, "ObsidianSword");
	GameRegistry.registerItem(EndSword, "EndSword");
	GameRegistry.registerItem(EvilSword, "EvilSword");
	GameRegistry.registerItem(PureSword, "PureSword");
	GameRegistry.registerItem(BronzeSword, "BronzeSword");
	
	//Tools
	GameRegistry.registerItem(GlassHoe, "GlassHoe");
	GameRegistry.registerItem(GlassShovel, "GlassShovel");
	GameRegistry.registerItem(GlassAxe, "GlassAxe");
	GameRegistry.registerItem(GlassPickaxe, "GlassPickaxe");
	
	GameRegistry.registerItem(RubyHoe, "RubyHoe");
	GameRegistry.registerItem(RubyShovel, "RubyShovel");
	GameRegistry.registerItem(RubyAxe, "RubyAxe");
	GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");
	
	GameRegistry.registerItem(EmeraldHoe, "EmeraldHoe");
	GameRegistry.registerItem(EmeraldShovel, "EmeraldShovel");
	GameRegistry.registerItem(EmeraldAxe, "EmeraldAxe");
	GameRegistry.registerItem(EmeraldPickaxe, "EmeraldPickaxe");
	
	GameRegistry.registerItem(SapphireHoe, "SapphireHoe");
	GameRegistry.registerItem(SapphireShovel, "SapphireShovel");
	GameRegistry.registerItem(SapphireAxe, "SapphireAxe");
	GameRegistry.registerItem(SapphirePickaxe, "SapphirePickaxe");
	
	GameRegistry.registerItem(ObsidianHoe, "ObsidianHoe");
	GameRegistry.registerItem(ObsidianShovel, "ObsidianShovel");
	GameRegistry.registerItem(ObsidianAxe, "ObsidianAxe");
	GameRegistry.registerItem(ObsidianPickaxe, "ObsidianPickaxe");
	
	GameRegistry.registerItem(EndHoe, "EndHoe");
	GameRegistry.registerItem(EndShovel, "EndShovel");
	GameRegistry.registerItem(EndAxe, "EndAxe");
	GameRegistry.registerItem(EndPickaxe, "EndPickaxe");
	
	GameRegistry.registerItem(EvilHoe, "EvilHoe");
	GameRegistry.registerItem(EvilShovel, "EvilShovel");
	GameRegistry.registerItem(EvilAxe, "EvilAxe");
	GameRegistry.registerItem(EvilPickaxe, "EvilPickaxe");
	
	GameRegistry.registerItem(PureHoe, "PureHoe");
	GameRegistry.registerItem(PureShovel, "PureShovel");
	GameRegistry.registerItem(PureAxe, "PureAxe");
	GameRegistry.registerItem(PurePickaxe, "PurePickaxe");
	
	GameRegistry.registerItem(BronzeHoe, "BronzeHoe");
	GameRegistry.registerItem(BronzeShovel, "BronzeShovel");
	GameRegistry.registerItem(BronzeAxe, "BronzeAxe");
	GameRegistry.registerItem(BronzePickaxe, "BronzePickaxe");
	
	//Armor
	GameRegistry.registerItem(GlassHelmet, "GlassHelmet");
	GameRegistry.registerItem(GlassChestplate, "GlassChestplate");
	GameRegistry.registerItem(GlassLeggings, "GlassLeggings");
	GameRegistry.registerItem(GlassBoots, "GlassBoots");
	
	GameRegistry.registerItem(RubyHelmet, "RubyHelmet");
	GameRegistry.registerItem(RubyChestplate, "RubyChestplate");
	GameRegistry.registerItem(RubyLeggings, "RubyLeggings");
	GameRegistry.registerItem(RubyBoots, "RubyBoots");
	
	GameRegistry.registerItem(EmeraldHelmet, "EmeraldHelmet");
	GameRegistry.registerItem(EmeraldChestplate, "EmeraldChestplate");
	GameRegistry.registerItem(EmeraldLeggings, "EmeraldLeggings");
	GameRegistry.registerItem(EmeraldBoots, "EmeraldBoots");
	
	GameRegistry.registerItem(SapphireHelmet, "SapphireHelmet");
	GameRegistry.registerItem(SapphireChestplate, "SapphireChestplate");
	GameRegistry.registerItem(SapphireLeggings, "SapphireLeggings");
	GameRegistry.registerItem(SapphireBoots, "SapphireBoots");
	
	GameRegistry.registerItem(ObsidianHelmet, "ObsidianHelmet");
	GameRegistry.registerItem(ObsidianChestplate, "ObsidianChestplate");
	GameRegistry.registerItem(ObsidianLeggings, "ObsidianLeggings");
	GameRegistry.registerItem(ObsidianBoots, "ObsidianBoots");
	
	GameRegistry.registerItem(EndHelmet, "EndHelmet");
	GameRegistry.registerItem(EndChestplate, "EndChestplate");
	GameRegistry.registerItem(EndLeggings, "EndLeggings");
	GameRegistry.registerItem(EndBoots, "EndBoots");
	
	GameRegistry.registerItem(EvilHelmet, "EvilHelmet");
	GameRegistry.registerItem(EvilChestplate, "EvilChestplate");
	GameRegistry.registerItem(EvilLeggings, "EvilLeggings");
	GameRegistry.registerItem(EvilBoots, "EvilBoots");
	
	GameRegistry.registerItem(PureHelmet, "PureHelmet");
	GameRegistry.registerItem(PureChestplate, "PureChestplate");
	GameRegistry.registerItem(PureLeggings, "PureLeggings");
	GameRegistry.registerItem(PureBoots, "PureBoots");
	
	GameRegistry.registerItem(BronzeHelmet, "BronzeHelmet");
	GameRegistry.registerItem(BronzeChestplate, "BronzeChestplate");
	GameRegistry.registerItem(BronzeLeggings, "BronzeLeggings");
	GameRegistry.registerItem(BronzeBoots, "BronzeBoots");
	
	//Blocks
	GameRegistry.registerBlock(RubyOre, "RubyOre");
	GameRegistry.registerBlock(EvilOre, "EvilOre");
	GameRegistry.registerBlock(PureOre, "PureOre");
	GameRegistry.registerBlock(SapphireOre, "SapphireOre");
	GameRegistry.registerBlock(BronzeBlock, "BronzeBlock");
	GameRegistry.registerBlock(EndBlock, "EndBlock");
	GameRegistry.registerBlock(TinBlock, "TinBlock");
	GameRegistry.registerBlock(CopperBlock, "CopperBlock");
	GameRegistry.registerBlock(TinOre, "TinOre");
	GameRegistry.registerBlock(CopperOre, "CopperOre");
	GameRegistry.registerBlock(SapphireBlock, "SapphireBlock");
	GameRegistry.registerBlock(RubyBlock, "RubyBlock");
	GameRegistry.registerBlock(PureGemBlock, "PureGemBlock");
	GameRegistry.registerBlock(EvilGemBlock, "EvilGemBlock");
	GameRegistry.registerBlock(ChiseledQuartzBrick, "ChiseledQuartzBrick");
	GameRegistry.registerBlock(QuartzBrick, "QuartzBrick");
	
	//Machines
	GameRegistry.registerBlock(IronFurnaceIdle, "IronFurnaceIdle");
	GameRegistry.registerBlock(IronFurnaceBurning, "IronFurnaceBurning");
	
	GameRegistry.registerBlock(OreGrinderIdle, "OreGrinderIdle");
	GameRegistry.registerBlock(OreGrinderBurning, "OreGrinderBurning");
	
	GameRegistry.registerBlock(MachineFrame, "MachineFrame");
	
//Language Registry
	
	//Items
	LanguageRegistry.addName(RubyGem, "Ruby");
	LanguageRegistry.addName(EvilCrystal, "Evil Crystal");
	LanguageRegistry.addName(PureCrystal, "Pure Crystal");
	LanguageRegistry.addName(SapphireGem, "Sapphire");
	LanguageRegistry.addName(EndIngot, "End Ingot");
	LanguageRegistry.addName(GlassIngot, "Glass Ingot");
	LanguageRegistry.addName(ObsidianIngot, "Obsidian Ingot");
	LanguageRegistry.addName(TinIngot, "Tin Ingot");
	LanguageRegistry.addName(CopperIngot, "Copper Ingot");
	LanguageRegistry.addName(BronzeIngot, "Bronze Ingot");
	LanguageRegistry.addName(TinNugget, "Tin Nugget");
	LanguageRegistry.addName(IronNugget, "Iron Nugget");
	LanguageRegistry.addName(CopperNugget, "Copper Nugget");
	LanguageRegistry.addName(TinDust, "Tin Dust");
	LanguageRegistry.addName(IronDust, "Iron Dust");
	LanguageRegistry.addName(CopperDust, "Copper Dust");
	LanguageRegistry.addName(GoldDust, "Gold Dust");
	LanguageRegistry.addName(ObsidianChunk, "Obsidian Chunk");
	
	//Machine Items
	LanguageRegistry.addName(MachineFramePart, "Machine Frame Part");
	LanguageRegistry.addName(OreGrinderBlade, "Ore Grinder Blade");
	LanguageRegistry.addName(FurnaceSmeltry, "Furnace Smeltry");
	
	//Food
	LanguageRegistry.addName(RawLambchop, "Raw Lambchop");
	LanguageRegistry.addName(CookedLambchop, "Cooked Lambchop");
	
	//Weapons
	LanguageRegistry.addName(BronzeSword, "Bronze Sword");
	LanguageRegistry.addName(RubySword, "Ruby Sword");
	LanguageRegistry.addName(GlassSword, "Glass Sword");
	LanguageRegistry.addName(EvilSword, "Evil Sword");
	LanguageRegistry.addName(ObsidianSword, "Obsidian Sword");
	LanguageRegistry.addName(EndSword, "End Sword");
	LanguageRegistry.addName(PureSword, "Pure Sword");
	LanguageRegistry.addName(SapphireSword, "Sapphire Sword");
	LanguageRegistry.addName(EmeraldSword, "Emerald Sword");
		
	//Tools
	LanguageRegistry.addName(BronzePickaxe, "Bronze Pickaxe");
	LanguageRegistry.addName(BronzeAxe, "Bronze Axe");
	LanguageRegistry.addName(BronzeHoe, "Bronze Hoe");
	LanguageRegistry.addName(BronzeShovel, "Bronze Shovel");
		
	LanguageRegistry.addName(RubyPickaxe, "Ruby Pickaxe");
	LanguageRegistry.addName(RubyAxe, "Ruby Axe");
	LanguageRegistry.addName(RubyHoe, "Ruby Hoe");
	LanguageRegistry.addName(RubyShovel, "Ruby Shovel");
		
	LanguageRegistry.addName(EndPickaxe, "End Pickaxe");
	LanguageRegistry.addName(EndAxe, "End Axe");
	LanguageRegistry.addName(EndShovel, "End Shovel");
	LanguageRegistry.addName(EndHoe, "End Hoe");
		
	LanguageRegistry.addName(EvilPickaxe, "Evil Pickaxe");
	LanguageRegistry.addName(EvilAxe, "Evil Axe");
	LanguageRegistry.addName(EvilHoe, "Evil Hoe");
	LanguageRegistry.addName(EvilShovel, "Evil Shovel");
		
	LanguageRegistry.addName(ObsidianPickaxe, "Obsidian Pickaxe");
	LanguageRegistry.addName(ObsidianAxe, "Obsidian Axe");
	LanguageRegistry.addName(ObsidianHoe, "Obsidian Hoe");
	LanguageRegistry.addName(ObsidianShovel, "Obsidian Shovel");
		
	LanguageRegistry.addName(PurePickaxe, "Pure Pickaxe");
	LanguageRegistry.addName(PureAxe, "Pure Axe");
	LanguageRegistry.addName(PureHoe, "Pure Hoe");
	LanguageRegistry.addName(PureShovel, "Pure Shovel");
		
	LanguageRegistry.addName(SapphirePickaxe, "Sapphire Pickaxe");
	LanguageRegistry.addName(SapphireAxe, "Sapphire Axe");
	LanguageRegistry.addName(SapphireHoe, "Sapphire Hoe");
	LanguageRegistry.addName(SapphireShovel, "Sapphire Shovel");
		
	LanguageRegistry.addName(EmeraldPickaxe, "Emerald Pickaxe");
	LanguageRegistry.addName(EmeraldAxe, "Emerald Axe");
	LanguageRegistry.addName(EmeraldHoe, "Emerald Hoe");
	LanguageRegistry.addName(EmeraldShovel, "Emerald Shovel");
		
	LanguageRegistry.addName(GlassPickaxe, "Glass Pickaxe");
	LanguageRegistry.addName(GlassAxe, "Glass Axe");
	LanguageRegistry.addName(GlassHoe, "Glass Hoe");
	LanguageRegistry.addName(GlassShovel, "Glass Shovel");
		
	//Armor
	LanguageRegistry.addName(BronzeHelmet, "Bronze Helmet");
	LanguageRegistry.addName(BronzeChestplate, "Bronze Chestplate");
	LanguageRegistry.addName(BronzeLeggings, "Bronze Leggings");
	LanguageRegistry.addName(BronzeBoots, "Bronze Boots");
	
	LanguageRegistry.addName(RubyHelmet, "Ruby Helmet");
	LanguageRegistry.addName(RubyChestplate, "Ruby Chestplate");
	LanguageRegistry.addName(RubyLeggings, "Ruby Leggings");
	LanguageRegistry.addName(RubyBoots, "Ruby Boots");
	
	LanguageRegistry.addName(EmeraldHelmet, "Emerald Helmet");
	LanguageRegistry.addName(EmeraldChestplate, "Emerald Chestplate");
	LanguageRegistry.addName(EmeraldLeggings, "Emerald Leggings");
	LanguageRegistry.addName(EmeraldBoots, "Emerald Boots");
	
	LanguageRegistry.addName(SapphireHelmet, "Sapphire Helmet");
	LanguageRegistry.addName(SapphireChestplate, "Sapphire Chestplate");
	LanguageRegistry.addName(SapphireLeggings, "Sapphire Leggings");
	LanguageRegistry.addName(SapphireBoots, "Sapphire Boots");
	
	LanguageRegistry.addName(PureHelmet, "Pure Helmet");
	LanguageRegistry.addName(PureChestplate, "Pure Chestplate");
	LanguageRegistry.addName(PureLeggings, "Pure Leggings");
	LanguageRegistry.addName(PureBoots, "Pure Boots");
	
	LanguageRegistry.addName(ObsidianHelmet, "Obsidian Helmet");
	LanguageRegistry.addName(ObsidianChestplate, "Obsidian Chestplate");
	LanguageRegistry.addName(ObsidianLeggings, "Obsidian Leggings");
	LanguageRegistry.addName(ObsidianBoots, "Obsidian Boots");
	
	LanguageRegistry.addName(GlassHelmet, "Glass Helmet");
	LanguageRegistry.addName(GlassChestplate, "Glass Chestplate");
	LanguageRegistry.addName(GlassLeggings, "Glass Leggings");
	LanguageRegistry.addName(GlassBoots, "Glass Boots");
	
	LanguageRegistry.addName(EndHelmet, "End Helmet");
	LanguageRegistry.addName(EndChestplate, "End Chestplate");
	LanguageRegistry.addName(EndLeggings, "End Leggings");
	LanguageRegistry.addName(EndBoots, "End Boots");
	
	LanguageRegistry.addName(EvilHelmet, "Evil Helmet");
	LanguageRegistry.addName(EvilChestplate, "Evil Chestplate");
	LanguageRegistry.addName(EvilLeggings, "Evil Leggings");
	LanguageRegistry.addName(EvilBoots, "Evil Boots");
	
	//Blocks
	LanguageRegistry.addName(RubyOre,  "Ruby Ore");
	LanguageRegistry.addName(EvilOre,  "Evil Ore");
	LanguageRegistry.addName(PureOre,  "Pure Ore");
	LanguageRegistry.addName(SapphireOre,  "Sapphire Ore");
	LanguageRegistry.addName(BronzeBlock,  "Bronze Block");
	LanguageRegistry.addName(EndBlock,  "End Block");
	LanguageRegistry.addName(TinBlock,  "Tin Block");
	LanguageRegistry.addName(CopperBlock,  "Copper Block");
	LanguageRegistry.addName(CopperOre,  "Copper Ore");
	LanguageRegistry.addName(TinOre,  "Tin Ore");
	LanguageRegistry.addName(RubyBlock,  "Ruby Block");
	LanguageRegistry.addName(SapphireBlock,  "Sapphire Block");
	LanguageRegistry.addName(PureGemBlock,  "Pure Crystal Block");
	LanguageRegistry.addName(EvilGemBlock,  "Evil Crystal Block");
	LanguageRegistry.addName(ChiseledQuartzBrick, "Chiseled Quartz Brick");
	LanguageRegistry.addName(QuartzBrick, "Quartz Brick");
	
	//Machines
	LanguageRegistry.addName(IronFurnaceIdle, "Iron Furnace");
	LanguageRegistry.addName(IronFurnaceBurning, "Iron FurnaceB");
	
	LanguageRegistry.addName(OreGrinderIdle, "Ore Grinder");
	LanguageRegistry.addName(OreGrinderBurning, "Ore GrinderB");
	
	LanguageRegistry.addName(MachineFrame, "Machine Frame");
	
	//Other
	GameRegistry.registerTileEntity(TileEntityIronFurnace.class, "tileentityironfurnace");
	GameRegistry.registerTileEntity(TileEntityOreGrinder.class, "tileentityoregrinder");
	NetworkRegistry.instance().registerGuiHandler(this, guihandler);

	//Ore Dictonary
	
		OreDictionary.registerOre("ingotCopper", new ItemStack(CopperIngot));
		OreDictionary.registerOre("ingotBronze", new ItemStack(BronzeIngot));
		OreDictionary.registerOre("ingotEnd", new ItemStack(EndIngot));
		OreDictionary.registerOre("ingotTin", new ItemStack(TinIngot));
		OreDictionary.registerOre("ingotGlass", new ItemStack(GlassIngot));
		OreDictionary.registerOre("ingotObsidian", new ItemStack(ObsidianIngot));
		OreDictionary.registerOre("gemRuby", new ItemStack(RubyGem));
		OreDictionary.registerOre("gemEvil", new ItemStack(EvilCrystal));
		OreDictionary.registerOre("gemPure", new ItemStack(PureCrystal));
		OreDictionary.registerOre("gemSapphire", new ItemStack(SapphireGem));
		
		OreDictionary.registerOre("oreCopper", new ItemStack(CopperOre));
		OreDictionary.registerOre("oreTin", new ItemStack(TinOre));
		OreDictionary.registerOre("oreRuby", new ItemStack(RubyOre));
		OreDictionary.registerOre("oreSappire", new ItemStack(SapphireOre));
		OreDictionary.registerOre("orePure", new ItemStack(PureOre));
		OreDictionary.registerOre("oreEvil", new ItemStack(EvilOre));
		
		OreDictionary.registerOre("blockEvil", new ItemStack(EvilGemBlock));
		OreDictionary.registerOre("blockCopper", new ItemStack(CopperBlock));
		OreDictionary.registerOre("blockTin", new ItemStack(TinBlock));
		OreDictionary.registerOre("blockBronze", new ItemStack(BronzeBlock));
		OreDictionary.registerOre("blockPure", new ItemStack(PureGemBlock));
		OreDictionary.registerOre("blockEnd", new ItemStack(EndBlock));
		OreDictionary.registerOre("blockSapphire", new ItemStack(SapphireBlock));
		OreDictionary.registerOre("blockRuby", new ItemStack(RubyBlock));
		
		OreDictionary.registerOre("dustCopper", new ItemStack(CopperDust));
		OreDictionary.registerOre("dustTin", new ItemStack(TinDust));
		OreDictionary.registerOre("dustIron", new ItemStack(IronDust));
		OreDictionary.registerOre("dustGold", new ItemStack(GoldDust));
		
		OreDictionary.registerOre("nuggetIron", new ItemStack(IronNugget));
		OreDictionary.registerOre("nuggetCopper", new ItemStack(CopperNugget));
		OreDictionary.registerOre("nuggetTin", new ItemStack(TinNugget));
		
//Crafting
		
		//Nuggets to Ingots
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.CopperIngot, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "nuggetCopper" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.TinIngot, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "nuggetTin" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Item.ingotIron, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "nuggetIron" }));
		
		//Ingots to Nuggets
		/*GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.CopperNugget, new Object[]{
			"ingotCopper" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.TinNugget, new Object[]{
			"ingotTin" }));*/
		
		//Ingots to Blocks
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.CopperBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "ingotCopper" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "ingotEnd" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.TinBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "ingotTin" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "ingotBronze" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "gemRuby" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "gemSapphire" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureGemBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "gemPure" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilGemBlock, true,  new Object [] {
			"TTT", "TTT", "TTT", 'T', "gemEvil" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Block.obsidian, true,  new Object [] {
			"TT ", "TT ", "   ", 'T', "ingotObsidian" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Block.obsidian, true,  new Object [] {
			" TT", " TT", "   ", 'T', "ingotObsidian" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Block.obsidian, true,  new Object [] {
			"   ", "TT ", "TT ", 'T', "ingotObsidian" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Block.obsidian, true,  new Object [] {
			"   ", " TT", " TT", 'T', "ingotObsidian" }));
		
		//Blocks to Ingots
		/*GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.CopperIngot, new Object[]{
			"blockCopper" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.TinIngot, new Object[]{
			"blockTin" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.BronzeIngot, new Object[]{
			"blockBronze" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.EndIngot, new Object[]{
			"blockEnd" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.SapphireGem, new Object[]{
			"blockSapphire" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.RubyGem, new Object[]{
			"blockRuby" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.EvilCrystal, new Object[]{
			"blockEvil" }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(MechaniCraft.PureCrystal, new Object[]{
			"blockPure" }));*/
		
		//Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "ingotBronze"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "ingotBronze" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "ingotBronze" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeBoots, true,  new Object [] {
			"T T", "T T", 'T', "ingotBronze" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "gemRuby" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "gemRuby" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "gemRuby" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyBoots, true,  new Object [] {
			"T T", "T T", 'T', "gemRuby" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "gemSapphire" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "gemSapphire" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "gemSapphire" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireBoots, true,  new Object [] {
			"T T", "T T", 'T', "gemSapphire" }));

		/*GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "gemEmerald" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "gemEmerald" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "gemEmerald" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldBoots, true,  new Object [] {
			"T T", "T T", 'T', "gemEmerald" }));*/
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "ingotObsidian" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "ingotObsidian" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "ingotObsidian" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianBoots, true,  new Object [] {
			"T T", "T T", 'T', "ingotObsidian" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "gemPure" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "gemPure" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "gemPure" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureBoots, true,  new Object [] {
			"T T", "T T", 'T', "gemPure" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "ingotGlass" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "ingotGlass" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "ingotGlass" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassBoots, true,  new Object [] {
			"T T", "T T", 'T', "ingotGlass" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "ingotEnd" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "ingotEnd" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "ingotEnd" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndBoots, true,  new Object [] {
			"T T", "T T", 'T', "ingotEnd" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilHelmet, true,  new Object [] {
			"TTT", "T T", 'T', "gemEvil" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilChestplate, true,  new Object [] {
			"T T", "TTT", "TTT", 'T', "gemEvil" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilLeggings, true,  new Object [] {
			"TTT", "T T", "T T", 'T', "gemEvil" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilBoots, true,  new Object [] {
			"T T", "T T", 'T', "gemEvil" }));
		
		//Tools
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "ingotBronze", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "ingotBronze", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "ingotBronze", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "ingotBronze", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzePickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "ingotBronze", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "ingotGlass", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "ingotGlass", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "ingotGlass", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "ingotGlass", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.GlassPickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "ingotGlass", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubySword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "gemRuby", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "gemRuby", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "gemRuby", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "gemRuby", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.RubyPickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "gemRuby", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "ingotEnd", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "ingotEnd", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "ingotEnd", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndPickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "ingotEnd", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EndHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "ingotEnd", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "ingotObsidian", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "ingotObsidian", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "ingotObsidian", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "ingotObsidian", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.ObsidianPickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "ingotObsidian", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "gemEvil", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "gemEvil", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "gemEvil", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "gemEvil", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EvilPickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "gemEvil", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "gemPure", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "gemPure", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "gemPure", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PureAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "gemPure", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.PurePickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "gemPure", 'X', Item.stick }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "gemSapphire", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "gemSapphire", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "gemSapphire", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphireAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "gemSapphire", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.SapphirePickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "gemSapphire", 'X', Item.stick }));
		
		/*GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldSword, true,  new Object [] {
			" T ", " T ", " X ", 'T', "gemEmerald", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldShovel, true,  new Object [] {
			" T ", " X ", " X ", 'T', "gemEmerald", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldHoe, true,  new Object [] {
			" TT", " X ", " X ", 'T', "gemEmerald", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldAxe, true,  new Object [] {
			"TT ", "TX ", " X ", 'T', "gemEmerald", 'X', Item.stick }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.EmeraldPickaxe, true,  new Object [] {
			"TTT", " X ", " X ", 'T', "gemEmerald", 'X', Item.stick }));*/
		
		//Bronze
		/*GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeIngot, true,  new Object [] {
			"TT ", "TX ", "   ", 'T', "ingotCopper", 'X', "ingotTin" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeIngot, true,  new Object [] {
			" TT", " TX", "   ", 'T', "ingotCopper", 'X', "ingotTin" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeIngot, true,  new Object [] {
			"   ", " TT", " TX", 'T', "ingotCopper", 'X', "ingotTin" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.BronzeIngot, true,  new Object [] {
			"   ", "TT ", "TX ", 'T', "ingotCopper", 'X', "ingotTin" }));*/
		
		//Machine Parts
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.FurnaceSmeltry, true,  new Object [] {
			"DTD", "TXT", "DTD", 'T', "ingotTin", 'X', Block.furnaceIdle, 'D', "ingotCopper"}));
		/*GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.OreGrinderFramePart, true,  new Object [] {
			"DTD", "TXT", "DTD", 'T', Item.ingotIron, 'X', "ingotTin", 'D', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe (MechaniCraft.ElectricFurnaceFramePart, true,  new Object [] {
			"TTT", "TXT", "TTT", 'T', Item.ingotIron, 'X', "ingotTin"}));*/
		
		//Machines
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.IronFurnaceIdle, true,  new Object [] {
			"DKD", "KTK", "DXD", 'T', MechaniCraft.MachineFrame, 'X', MechaniCraft.FurnaceSmeltry, 'D', "ingotCopper", 'K', Item.ingotIron}));
		GameRegistry.addRecipe(new ShapedOreRecipe(MechaniCraft.OreGrinderIdle, true,  new Object [] {
			"DXD", "KTK", "DKD", 'T', MechaniCraft.MachineFrame, 'X', MechaniCraft.OreGrinderBlade, 'D', "ingotCopper", 'K', Item.ingotIron}));
		
	//Other Crafting
		
		//Machine Parts
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.OreGrinderBlade, 1), new Object [] {
			" T ", "TXT", " T ", 'T', Item.ingotIron, 'X', MechaniCraft.ObsidianChunk});
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.MachineFramePart, 2),  new Object [] {
			"DTD", "TXT", "DTD", 'T', Item.ingotIron, 'X', MechaniCraft.TinIngot, 'D', MechaniCraft.CopperIngot});
		
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.MachineFrame, 1),  new Object [] {
			"TTT", "T T", "TTT", 'T', MechaniCraft.MachineFramePart });
		
		//Bronze
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.BronzeIngot, 4),  new Object [] {
			"TT ", "TX ", "   ", 'T', MechaniCraft.CopperIngot, 'X', MechaniCraft.TinIngot });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.BronzeIngot, 4),  new Object [] {
			" TT", " TX", "   ", 'T', MechaniCraft.CopperIngot, 'X', MechaniCraft.TinIngot });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.BronzeIngot, 4),  new Object [] {
			"   ", " TT", " TX", 'T', MechaniCraft.CopperIngot, 'X', MechaniCraft.TinIngot });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.BronzeIngot, 4),  new Object [] {
			"   ", "TT ", "TX ", 'T', MechaniCraft.CopperIngot, 'X', MechaniCraft.TinIngot });
		
		//Blocks to Ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.CopperIngot, 9), new Object[]{
			MechaniCraft.CopperBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.TinIngot, 9), new Object[]{
			MechaniCraft.TinBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.BronzeIngot, 9), new Object[]{
			MechaniCraft.BronzeBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.EndIngot, 9), new Object[]{
			MechaniCraft.EndBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.SapphireGem, 9), new Object[]{
			MechaniCraft.SapphireBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.RubyGem, 9), new Object[]{
			MechaniCraft.RubyBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.EvilCrystal, 9), new Object[]{
			MechaniCraft.EvilGemBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.PureCrystal, 9), new Object[]{
			MechaniCraft.PureGemBlock });
		
		//Ingots to Nuggets
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.CopperNugget, 9), new Object[]{
			MechaniCraft.CopperIngot });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.TinNugget, 9), new Object[]{
			MechaniCraft.TinIngot });
		GameRegistry.addShapelessRecipe(new ItemStack(MechaniCraft.IronNugget, 9), new Object[]{
			Item.ingotIron});
		
	//Emerald Tools And Armor
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldHelmet, 1),  new Object [] {
			"TTT", "T T", 'T', Item.emerald });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldChestplate, 1),  new Object [] {
			"T T", "TTT", "TTT", 'T', Item.emerald });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldLeggings, 1),  new Object [] {
			"TTT", "T T", "T T", 'T', Item.emerald });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldBoots, 1),  new Object [] {
			"T T", "T T", 'T', Item.emerald });
			
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldSword, 1),  new Object [] {
			" T ", " T ", " X ", 'T', Item.emerald, 'X', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldShovel, 1),  new Object [] {
			" T ", " X ", " X ", 'T', Item.emerald, 'X', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldHoe, 1),  new Object [] {
			" TT", " X ", " X ", 'T', Item.emerald, 'X', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldAxe, 1),  new Object [] {
			"TT ", "TX ", " X ", 'T', Item.emerald, 'X', Item.stick });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.EmeraldPickaxe, 1),  new Object [] {
			"TTT", " X ", " X ", 'T', Item.emerald, 'X', Item.stick });
		
		//Quartz Bricks(Meta Data Crafting)
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.QuartzBrick, 4),  new Object [] {
			"TT ", "TT ", "   ", 'T', new ItemStack(Block.blockNetherQuartz, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.QuartzBrick, 4),  new Object [] {
			" TT", " TT", "   ", 'T', new ItemStack(Block.blockNetherQuartz, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.QuartzBrick, 4),  new Object [] {
			"   ", " TT", " TT", 'T', new ItemStack(Block.blockNetherQuartz, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.QuartzBrick, 4),  new Object [] {
			"   ", "TT ", "TT ", 'T', new ItemStack(Block.blockNetherQuartz, 1, 0) });
		
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.ChiseledQuartzBrick, 4),  new Object [] {
			"TT ", "TT ", "   ", 'T', new ItemStack(Block.blockNetherQuartz, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.ChiseledQuartzBrick, 4),  new Object [] {
			" TT", " TT", "   ", 'T', new ItemStack(Block.blockNetherQuartz, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.ChiseledQuartzBrick, 4),  new Object [] {
			"   ", " TT", " TT", 'T', new ItemStack(Block.blockNetherQuartz, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(MechaniCraft.ChiseledQuartzBrick, 4),  new Object [] {
			"   ", "TT ", "TT ", 'T', new ItemStack(Block.blockNetherQuartz, 1, 1) });
		
	//Smelting
		
		GameRegistry.addSmelting(Item.eyeOfEnder.itemID, new ItemStack(MechaniCraft.EndIngot), 0.5F);
		GameRegistry.addSmelting(MechaniCraft.ObsidianChunk.itemID, new ItemStack(MechaniCraft.ObsidianIngot), 0.5F);
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(MechaniCraft.GlassIngot), 0.5F);
		GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(MechaniCraft.ObsidianChunk, 4), 0.5F);
		GameRegistry.addSmelting(MechaniCraft.CopperOre.blockID, new ItemStack(MechaniCraft.CopperIngot), 0.5F);
		GameRegistry.addSmelting(MechaniCraft.TinOre.blockID, new ItemStack(MechaniCraft.TinIngot), 0.5F);
		GameRegistry.addSmelting(MechaniCraft.TinDust.itemID, new ItemStack(MechaniCraft.TinIngot), 0.2F);
		GameRegistry.addSmelting(MechaniCraft.IronDust.itemID, new ItemStack(Item.ingotIron), 0.2F);
		GameRegistry.addSmelting(MechaniCraft.GoldDust.itemID, new ItemStack(Item.ingotGold), 0.2F);
		GameRegistry.addSmelting(MechaniCraft.CopperDust.itemID, new ItemStack(MechaniCraft.CopperIngot), 0.2F);
		GameRegistry.addSmelting(MechaniCraft.RawLambchop.itemID, new ItemStack(MechaniCraft.CookedLambchop), 0.5F);
	
proxy.entityDropEvents();
proxy.registerRenderThings();
}

@EventHandler
public void Init(FMLInitializationEvent event){
	

}
}