
package com.example.memecraft.entities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
public class WormParasiteEntity extends MobEntity {
    protected WormParasiteEntity(EntityType<? extends MobEntity> entityType, World world) { super(entityType, world); }
    public static DefaultAttributeContainer.Builder createWormAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0);
    }
}
