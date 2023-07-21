package bungy.twindling.tweaks.main.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> CATALPA_PLACED = PlacedFeatures.register("catalpa_placed",
            ModConfiguredFeatures.CATALPA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> ALLUMINITE_ORE_PLACED = PlacedFeatures.register("alluminite_ore_placed",
            ModConfiguredFeatures.ALLUMINITE_ORE, ModOreFeatures.modifiersWithCount(12,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(110))));


    public static final RegistryEntry<PlacedFeature> MUD_ORE_PLACED = PlacedFeatures.register("mud_ore_placed",
            ModConfiguredFeatures.MUD_ORE, ModOreFeatures.modifiersWithCount(15,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(110))));

    public static final RegistryEntry<PlacedFeature> SUGAR_ORE_PLACED = PlacedFeatures.register("sugar_ore_placed",
            ModConfiguredFeatures.SUGAR_ORE, ModOreFeatures.modifiersWithCount(14,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(110))));

    public static final RegistryEntry<PlacedFeature> RAW_ALLUMINITE_BLOCK_PLACED = PlacedFeatures.register("raw_alluminite_block_placed",
            ModConfiguredFeatures.SUGAR_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(110))));

}
