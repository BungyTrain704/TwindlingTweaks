package bungy.twindling.tweaks.main.screen;

import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<ObsidianForgerScreenHandler> OBSIDIAN_FORGER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        OBSIDIAN_FORGER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(TwindlingTweaks.MOD_ID, "obsidian_forger"),
                        ObsidianForgerScreenHandler::new);
    }
}