package bungy.twindling.tweaks.main.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {

    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(1).saturationModifier(.4F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 2), 0.9F).snack().build();

    public static final FoodComponent SALAD = new FoodComponent.Builder().hunger(6).saturationModifier(.9F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 4), 1.0F).build();

    public static final FoodComponent DRIED_MUD_BALL = new FoodComponent.Builder().hunger(2).saturationModifier(.2F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 1), 0.8F).build();

    public static final FoodComponent CROUTON = new FoodComponent.Builder().hunger(1).saturationModifier(.1F).build();

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(4).saturationModifier(.5F).build();

    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(5).saturationModifier(.8F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 1), 0.8F).build();

    public static final FoodComponent ROUGH_SUGAR = new FoodComponent.Builder().hunger(1).saturationModifier(.1F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 1), 0.8F).build();



}