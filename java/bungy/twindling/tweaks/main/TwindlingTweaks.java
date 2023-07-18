package bungy.twindling.tweaks.main;

import bungy.twindling.tweaks.main.block.custom.*;
import bungy.twindling.tweaks.main.block.custom.ores.*;
import bungy.twindling.tweaks.main.block.custom.seeds.CucumberSeeds;
import bungy.twindling.tweaks.main.block.custom.seeds.LettuceSeeds;
import bungy.twindling.tweaks.main.block.custom.seeds.TomatoSeeds;
import bungy.twindling.tweaks.main.entity.ModBlockEntities;
import bungy.twindling.tweaks.main.item.ModArmorMaterial;
import bungy.twindling.tweaks.main.item.ToolMaterial;
import bungy.twindling.tweaks.main.item.custom.CustomAxeItem;
import bungy.twindling.tweaks.main.item.custom.CustomHoeItem;
import bungy.twindling.tweaks.main.item.custom.CustomPickaxeItem;
import bungy.twindling.tweaks.main.item.custom.ModArmorItem;
import bungy.twindling.tweaks.main.recipe.ModRecipes;
import bungy.twindling.tweaks.main.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.AliasedBlockItem;


import static bungy.twindling.tweaks.main.item.ModItemGroup.TTWEAKS;

public class TwindlingTweaks implements ModInitializer {

	public static final String MOD_ID = "twindlingtweaks";

	public static final CropBlock TOMATO_SEEDS_BLOCK = new TomatoSeeds(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

	public static final Item TOMATO_SEEDS = new AliasedBlockItem(TwindlingTweaks.TOMATO_SEEDS_BLOCK, new FabricItemSettings().group(TTWEAKS));

	public static final CropBlock CUCUMBER_SEEDS_BLOCK = new CucumberSeeds(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

	public static final Item CUCUMBER_SEEDS = new AliasedBlockItem(TwindlingTweaks.CUCUMBER_SEEDS_BLOCK, new FabricItemSettings().group(TTWEAKS));

	public static final CropBlock LETTUCE_SEEDS_BLOCK = new LettuceSeeds(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

	public static final Item LETTUCE_SEEDS = new AliasedBlockItem(TwindlingTweaks.LETTUCE_SEEDS_BLOCK, new FabricItemSettings().group(TTWEAKS));

	public static final Item MUD_BALL = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item RAW_ALLUMINITE = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item RANCH_BOTTLE = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item ALLUMINITE_INGOT = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item REINFORCED_ALUMINITE_INGOT = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item ALLUMINITE_NUGGET = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item ALLUMINITE_ROD = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final Item ALLUMINITE_ROD_SHARD = new Item(new FabricItemSettings().group(TTWEAKS));

	public static final ToolItem ALLUMINITE_SWORD = new SwordItem(bungy.twindling.tweaks.main.item.ToolMaterial.INSTANCE, 7, -2.2F, new Item.Settings().group(TTWEAKS));

	public static final ToolItem ALLUMINITE_SHOVEL = new ShovelItem(bungy.twindling.tweaks.main.item.ToolMaterial.INSTANCE, 2, -1.9F, new Item.Settings().group(TTWEAKS));

	public static ToolItem ALLUMINITE_PICKAXE = new CustomPickaxeItem(bungy.twindling.tweaks.main.item.ToolMaterial.INSTANCE, 1, -1.9F, new Item.Settings().group(TTWEAKS));

	public static ToolItem ALLUMINITE_AXE = new CustomAxeItem(bungy.twindling.tweaks.main.item.ToolMaterial.INSTANCE, 10, -2.8F, new Item.Settings().group(TTWEAKS));

	public static ToolItem ALLUMINITE_HOE = new CustomHoeItem(ToolMaterial.INSTANCE, 2, -1.9F, new Item.Settings().group(TTWEAKS));

	public static Item ALLUMINITE_HELMET = new ModArmorItem(ModArmorMaterial.ALLUMINITE, EquipmentSlot.HEAD, new FabricItemSettings().group(TTWEAKS));

	public static Item ALLUMINITE_CHESTPLATE = new ArmorItem(ModArmorMaterial.ALLUMINITE, EquipmentSlot.CHEST, new FabricItemSettings().group(TTWEAKS));

	public static Item ALLUMINITE_LEGGINGS = new ArmorItem(ModArmorMaterial.ALLUMINITE, EquipmentSlot.LEGS, new FabricItemSettings().group(TTWEAKS));

	public static Item ALLUMINITE_BOOTS = new ArmorItem(ModArmorMaterial.ALLUMINITE, EquipmentSlot.FEET, new FabricItemSettings().group(TTWEAKS));

	public static Item OBSIDIAN_HELMET = new ModArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlot.HEAD, new FabricItemSettings().group(TTWEAKS));

	public static Item OBSIDIAN_CHESTPLATE = new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlot.CHEST, new FabricItemSettings().group(TTWEAKS));

	public static Item OBSIDIAN_LEGGINGS = new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlot.LEGS, new FabricItemSettings().group(TTWEAKS));

	public static Item OBSIDIAN_BOOTS = new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlot.FEET, new FabricItemSettings().group(TTWEAKS));

	public static final Block OBSIDIAN_FORGER = new ObsidianForgerBlock(FabricBlockSettings.of(Material.METAL).strength(2.4F, 10.0F).sounds(BlockSoundGroup.BASALT).requiresTool());

	public static final Block REINFORCED_OBSIDIAN = new ReinforcedObsidian(FabricBlockSettings.of(Material.METAL).strength(2.4F, 10.0F).sounds(BlockSoundGroup.BASALT).requiresTool());

	public static final Block ALLUMINITE_BLOCK = new AlluminiteBlock(FabricBlockSettings.of(Material.STONE).strength(0.7F, 0.5F).sounds(BlockSoundGroup.BASALT).requiresTool());

	public static final Block RAW_ALLUMINITE_BLOCK = new RawAlluminiteBlock(FabricBlockSettings.of(Material.STONE).strength(0.7F, 0.5F).sounds(BlockSoundGroup.BASALT).requiresTool());

	public static final Block MUD_TRAPDOOR = new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5F, 0.5F).sounds(BlockSoundGroup.WOOD).nonOpaque().requiresTool());

	public static final Block MUD_DOOR = new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5F, 0.5F).sounds(BlockSoundGroup.WOOD).nonOpaque().requiresTool());

	public static final Block MUD_BLOCK = new MudBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5F, 0.5F).sounds(BlockSoundGroup.SLIME).requiresTool());

	public static final Block DRIED_MUD_BLOCK = new DriedMudBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5F, 0.5F).sounds(BlockSoundGroup.GRAVEL).requiresTool());

	public static final Block MUD_ORE = new MudOreBlock(FabricBlockSettings.of(Material.STONE).strength(0.6F, 0.6F).sounds(BlockSoundGroup.STONE).requiresTool());

	public static final Block DEEPSLATE_MUD_ORE = new DEEPSLATE_MUD_ORE(FabricBlockSettings.of(Material.STONE).strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE).requiresTool());

	public static final Block SUGAR_ORE = new SugarOreBlock(FabricBlockSettings.of(Material.STONE).strength(1.0F, 1.0F).sounds(BlockSoundGroup.STONE).requiresTool());

	public static final Block DEEPSLATE_SUGAR_ORE = new DEEPSLATE_SUGAR_ORE(FabricBlockSettings.of(Material.STONE).strength(1.2F, 1.2F).sounds(BlockSoundGroup.STONE).requiresTool());

	public static final Item LETTUCE =  new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Item CUCUMBER =  new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Item CROUTON =  new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Item DRIED_MUD_BALL =  new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Item SALAD_TOPPINGS =  new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Item SALAD =  new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Item TOMATO = new Item(new FabricItemSettings().food(bungy.twindling.tweaks.main.item.FoodComponents.LETTUCE).group(TTWEAKS));

	public static final Block ALLUMINITE_ORE = new AlluminiteOreBlock(FabricBlockSettings.of(Material.STONE).strength(1.3F, 1.4F).sounds(BlockSoundGroup.BASALT).requiresTool());

	public static final Block DEEPSLATE_ALLUMINITE_ORE = new DEEPSLATE_ALLUMINITE_ORE(FabricBlockSettings.of(Material.STONE).strength(1.7F, 1.8F).sounds(BlockSoundGroup.BASALT).requiresTool());



	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "salad_toppings"), SALAD_TOPPINGS);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_rod"), ALLUMINITE_ROD);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_nugget"), ALLUMINITE_NUGGET );
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_rod_shard"), ALLUMINITE_ROD_SHARD);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_ingot"), ALLUMINITE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "reinforced_alluminite_ingot"), REINFORCED_ALUMINITE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_helmet"), ALLUMINITE_HELMET);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_chestplate"), ALLUMINITE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_leggings"), ALLUMINITE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_boots"), ALLUMINITE_BOOTS);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "obsidian_helmet"), OBSIDIAN_HELMET);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "obsidian_leggings"), OBSIDIAN_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "obsidian_boots"), OBSIDIAN_BOOTS);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_sword"), ALLUMINITE_SWORD);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_shovel"), ALLUMINITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_axe"), ALLUMINITE_AXE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_pickaxe"), ALLUMINITE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_hoe"), ALLUMINITE_HOE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "raw_alluminite"), RAW_ALLUMINITE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "mud_ball"), MUD_BALL);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","obsidian_forger"), new BlockItem(OBSIDIAN_FORGER, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","obsidian_forger"), OBSIDIAN_FORGER);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","reinforced_obsidian"), new BlockItem(REINFORCED_OBSIDIAN, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","reinforced_obsidian"), REINFORCED_OBSIDIAN);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","raw_alluminite_block"), new BlockItem(RAW_ALLUMINITE_BLOCK, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","raw_alluminite_block"), RAW_ALLUMINITE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","mud_block"), MUD_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","dried_mud_block"), DRIED_MUD_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","alluminite_block"), ALLUMINITE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","mud_block"), new BlockItem(MUD_BLOCK, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","mud_door"), new BlockItem(MUD_DOOR, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","mud_trapdoor"), new BlockItem(MUD_TRAPDOOR, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","dried_mud_block"), new BlockItem(DRIED_MUD_BLOCK, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","alluminite_block"), new BlockItem(ALLUMINITE_BLOCK, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "lettuce"), LETTUCE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "salad"), SALAD);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "dried_mud_ball"), DRIED_MUD_BALL);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "mud_ore"), new BlockItem(MUD_ORE, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "deepslate_mud_ore"), new BlockItem(DEEPSLATE_MUD_ORE, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "alluminite_ore"), new BlockItem(ALLUMINITE_ORE, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "deepslate_alluminite_ore"), new BlockItem(DEEPSLATE_ALLUMINITE_ORE, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "sugar_ore"), new BlockItem(SUGAR_ORE, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","alluminite_ore"), ALLUMINITE_ORE);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","deepslate_alluminite_ore"), DEEPSLATE_ALLUMINITE_ORE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "deepslate_sugar_ore"), new BlockItem(DEEPSLATE_SUGAR_ORE, new FabricItemSettings().group(TTWEAKS)));
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","mud_ore"), MUD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","mud_trapdoor"), MUD_TRAPDOOR);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","mud_door"), MUD_DOOR);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","deepslate_mud_ore"), DEEPSLATE_MUD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","sugar_ore"), SUGAR_ORE);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","deepslate_sugar_ore"), DEEPSLATE_SUGAR_ORE);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "lettuce_seeds"), LETTUCE_SEEDS);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","lettuce_seeds"), LETTUCE_SEEDS_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "tomato"), TOMATO);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "crouton"), CROUTON);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "cucumber"), CUCUMBER);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks", "ranch_bottle"), RANCH_BOTTLE);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","tomato_seeds"), TOMATO_SEEDS_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registry.BLOCK, new Identifier("twindlingtweaks","cucumber_seeds"), CUCUMBER_SEEDS_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("twindlingtweaks","cucumber_seeds"), CUCUMBER_SEEDS);

		ModOreGeneration.generateOres();
		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();
	}
}

