package bungy.twindling.tweaks.main;


import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
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

}

