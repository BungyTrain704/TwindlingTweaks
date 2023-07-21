package bungy.twindling.tweaks.main.item;

import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.minecraft.recipe.Ingredient;

public class ToolMaterial2 implements net.minecraft.item.ToolMaterial {

    public static final ToolMaterial2 INSTANCE = new ToolMaterial2();

    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TwindlingTweaks.REINFORCED_OBSIDIAN);
    }
}