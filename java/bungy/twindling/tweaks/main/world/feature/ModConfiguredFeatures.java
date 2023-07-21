package bungy.twindling.tweaks.main.world.feature;


import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CATALPA_TREE =
            ConfiguredFeatures.register("catalpa_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(TwindlingTweaks.CATALPA_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(TwindlingTweaks.CATALPA_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> CATALPA_CHECKED =
            PlacedFeatures.register("catalpa_checked", CATALPA_TREE,
                    PlacedFeatures.wouldSurvive(TwindlingTweaks.CATALPA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CATALPA_SPAWN =
            ConfiguredFeatures.register("catalpa_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CATALPA_CHECKED, 0.5f)),
                            CATALPA_CHECKED));


    public static final List<OreFeatureConfig.Target> OVERWORLD_ALLUMINITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    TwindlingTweaks.ALLUMINITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                TwindlingTweaks.DEEPSLATE_ALLUMINITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALLUMINITE_ORE =
            ConfiguredFeatures.register("alluminite_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ALLUMINITE_ORES, 10));

    public static final List<OreFeatureConfig.Target> OVERWORLD_MUD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    TwindlingTweaks.MUD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    TwindlingTweaks.DEEPSLATE_MUD_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MUD_ORE =
            ConfiguredFeatures.register("mud_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_MUD_ORES, 11));

    public static final List<OreFeatureConfig.Target> OVERWORLD_SUGAR_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    TwindlingTweaks.SUGAR_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    TwindlingTweaks.DEEPSLATE_SUGAR_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SUGAR_ORE =
            ConfiguredFeatures.register("sugar_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SUGAR_ORES, 10));

    public static final List<OreFeatureConfig.Target> OVERWORLD_RAW_ALLUMINITE_BLOCKS = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    TwindlingTweaks.RAW_ALLUMINITE_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    TwindlingTweaks.RAW_ALLUMINITE_BLOCK.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RAW_ALLUMINITE_BLOCK =
            ConfiguredFeatures.register("raw_alluminite_block", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RAW_ALLUMINITE_BLOCKS, 3));

    public static void registerConfiguredFeatures() {
    }
}

