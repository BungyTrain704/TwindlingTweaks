package bungy.twindling.tweaks.main.recipe;

import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void  registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(TwindlingTweaks.MOD_ID, ObsidianForgerRecipe.Serializer.ID),
            ObsidianForgerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(TwindlingTweaks.MOD_ID, ObsidianForgerRecipe.Type.ID),
                ObsidianForgerRecipe.Type.INSTANCE);
    }
}
