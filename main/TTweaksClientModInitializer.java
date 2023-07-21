package bungy.twindling.tweaks.main;

import bungy.twindling.tweaks.main.screen.ModScreenHandlers;
import bungy.twindling.tweaks.main.screen.ObsidianForgerScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.impl.client.container.ScreenProviderRegistryImpl;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.ScreenshotRecorder;


@Environment(EnvType.CLIENT)
    public class TTweaksClientModInitializer implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.LETTUCE_SEEDS_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.CUCUMBER_SEEDS_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.TOMATO_SEEDS_BLOCK);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.MUD_TRAPDOOR);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.MUD_DOOR);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.CATALPA_LEAVES);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.CATALPA_SAPLING);

        ScreenRegistry.register(ModScreenHandlers.OBSIDIAN_FORGER_SCREEN_HANDLER, ObsidianForgerScreen::new);


    }
}
