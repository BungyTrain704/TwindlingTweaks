package bungy.twindling.tweaks.main.entity;

import bungy.twindling.tweaks.main.TwindlingTweaks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<ObsidianForgerBlockEntity> OBSIDIAN_FORGER;

    public static void  registerAllBlockEntities() {
        OBSIDIAN_FORGER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(TwindlingTweaks.MOD_ID, "obsidian_forger"),
                FabricBlockEntityTypeBuilder.create(ObsidianForgerBlockEntity::new,
                        TwindlingTweaks.OBSIDIAN_FORGER).build(null));

    }
}
