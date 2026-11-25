
package com.example.memecraft.entities;

import com.example.memecraft.MemeCraft;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FlyingTireEntity> FLYING_TIRE = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "flying_tire"),
            FabricEntityTypeBuilder.<FlyingTireEntity>create(SpawnGroup.MISC, FlyingTireEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());

    public static final EntityType<VoidAnomalyEntity> VOID_ANOMALY = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "void_anomaly"),
            FabricEntityTypeBuilder.<VoidAnomalyEntity>create(SpawnGroup.MISC, VoidAnomalyEntity::new)
                    .dimensions(EntityDimensions.fixed(5.0f, 5.0f)).build());

    public static final EntityType<AnomalyMinionEntity> ANOMALY_MINION = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "anomaly_minion"),
            FabricEntityTypeBuilder.createMob(SpawnGroup.MISC, AnomalyMinionEntity::new, EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static final EntityType<HamsterEntity> HAMSTER = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "hamster"),
            FabricEntityTypeBuilder.createMob(SpawnGroup.AMBIENT, HamsterEntity::new, EntityDimensions.fixed(0.6f, 0.6f)).build());

    public static final EntityType<BeggarEntity> BEGGAR = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "beggar"),
            FabricEntityTypeBuilder.createMob(SpawnGroup.MISC, BeggarEntity::new, EntityDimensions.fixed(0.6f, 1.8f)).build());

    public static final EntityType<BananaMonkeyEntity> MONKEY = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "monkey"),
            FabricEntityTypeBuilder.createMob(SpawnGroup.MISC, BananaMonkeyEntity::new, EntityDimensions.fixed(0.6f, 1.2f)).build());

    public static final EntityType<WormParasiteEntity> WORM = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "worm"),
            FabricEntityTypeBuilder.createMob(SpawnGroup.MISC, WormParasiteEntity::new, EntityDimensions.fixed(1.0f, 1.0f)).build());

    public static final EntityType<PlayerMimicEntity> MIMIC = Registry.register(Registries.ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "mimic"),
            FabricEntityTypeBuilder.createMob(SpawnGroup.MISC, PlayerMimicEntity::new, EntityDimensions.fixed(0.6f, 1.8f)).build());

    public static final net.minecraft.item.Item ANOMALY_SPAWNER_EGG = new net.minecraft.item.SpawnEggItem(VOID_ANOMALY, 0x8A2BE2, 0x000000, new net.minecraft.item.Item.Settings());
    public static final net.minecraft.item.Item HAMSTER_SPAWN_EGG = new net.minecraft.item.SpawnEggItem(HAMSTER, 0xFFD700, 0xFFFFFF, new net.minecraft.item.Item.Settings());
    public static final net.minecraft.item.Item BEGGAR_SPAWN_EGG = new net.minecraft.item.SpawnEggItem(BEGGAR, 0x8B4513, 0xD2B48C, new net.minecraft.item.Item.Settings());
    public static final net.minecraft.item.Item MONKEY_SPAWN_EGG = new net.minecraft.item.SpawnEggItem(MONKEY, 0x8B4513, 0xFFFF00, new net.minecraft.item.Item.Settings());
    public static final net.minecraft.item.Item WORM_SPAWN_EGG = new net.minecraft.item.SpawnEggItem(WORM, 0xFF00FF, 0x000000, new net.minecraft.item.Item.Settings());
    public static final net.minecraft.item.Item MIMIC_SPAWN_EGG = new net.minecraft.item.SpawnEggItem(MIMIC, 0x333333, 0x000000, new net.minecraft.item.Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, "anomaly_spawner"), ANOMALY_SPAWNER_EGG);
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, "hamster_spawn_egg"), HAMSTER_SPAWN_EGG);
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, "beggar_spawn_egg"), BEGGAR_SPAWN_EGG);
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, "monkey_spawn_egg"), MONKEY_SPAWN_EGG);
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, "worm_spawn_egg"), WORM_SPAWN_EGG);
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, "mimic_spawn_egg"), MIMIC_SPAWN_EGG);

        // ПРАВИЛО 9: Атрибуты ТОЛЬКО для LivingEntity
        FabricDefaultAttributeRegistry.register(HAMSTER, HamsterEntity.createHamsterAttributes());
        FabricDefaultAttributeRegistry.register(BEGGAR, BeggarEntity.createBeggarAttributes());
        FabricDefaultAttributeRegistry.register(MONKEY, BananaMonkeyEntity.createMonkeyAttributes());
        FabricDefaultAttributeRegistry.register(WORM, WormParasiteEntity.createWormAttributes());
        FabricDefaultAttributeRegistry.register(MIMIC, PlayerMimicEntity.createMimicAttributes());
        FabricDefaultAttributeRegistry.register(ANOMALY_MINION, AnomalyMinionEntity.createMinionAttributes());
    }
}
