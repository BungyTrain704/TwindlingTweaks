package bungy.twindling.tweaks.main;

import net.minecraft.recipe.Ingredient;

public class ToolMaterial implements net.minecraft.item.ToolMaterial {

    public static final ToolMaterial INSTANCE = new ToolMaterial();

    @Override
    public int getDurability() {
        return 1500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3;
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
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TwindlingTweaks.ALLUMINITE_INGOT);
    }
}