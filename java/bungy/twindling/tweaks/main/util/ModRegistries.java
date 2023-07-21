package bungy.twindling.tweaks.main.util;

import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammableBlock();
    }
    private static void registerStrippables() {
        StrippableBlockRegistry.register(TwindlingTweaks.CATALPA_LOG, TwindlingTweaks.STRIPPED_CATALPA_LOG);
        StrippableBlockRegistry.register(TwindlingTweaks.CATALPA_WOOD, TwindlingTweaks.STRIPPED_CATALPA_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(TwindlingTweaks.CATALPA_LOG, 5, 5);
        instance.add(TwindlingTweaks.STRIPPED_CATALPA_LOG, 5, 5);
        instance.add(TwindlingTweaks.CATALPA_WOOD, 5, 5);
        instance.add(TwindlingTweaks.STRIPPED_CATALPA_WOOD, 5, 5);
        instance.add(TwindlingTweaks.CATALPA_PLANKS, 5, 20);
        instance.add(TwindlingTweaks.CATALPA_LEAVES, 30, 60);
    }

    }

