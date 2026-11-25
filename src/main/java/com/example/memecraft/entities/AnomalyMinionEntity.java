
package com.example.memecraft.entities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
public class AnomalyMinionEntity extends MobEntity {
    protected AnomalyMinionEntity(EntityType<? extends MobEntity> entityType, World world) { super(entityType, world); }
    public static DefaultAttributeContainer.Builder createMinionAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0);
    }
}
