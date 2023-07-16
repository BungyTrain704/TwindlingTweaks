package bungy.twindling.tweaks.main;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;



    @Environment(EnvType.CLIENT)
    public class TTweaksClientModInitializer implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.LETTUCE_SEEDS_BLOCK);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.CUCUMBER_SEEDS_BLOCK);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.TOMATO_SEEDS_BLOCK);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.MUD_TRAPDOOR);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TwindlingTweaks.MUD_DOOR);


    }
}
