package bungy.twindling.tweaks.main.item;

import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TTWEAKS = FabricItemGroupBuilder.build(new Identifier(TwindlingTweaks.MOD_ID, "ttweaks"),
            () -> new ItemStack(TwindlingTweaks.RAW_ALLUMINITE));
}