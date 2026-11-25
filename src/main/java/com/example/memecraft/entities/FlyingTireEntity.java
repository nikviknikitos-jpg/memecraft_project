
package com.example.memecraft.entities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
public class FlyingTireEntity extends Entity {
    public FlyingTireEntity(EntityType<?> type, World world) { super(type, world); }
    @Override protected void initDataTracker() {}
    @Override protected void readCustomDataFromNbt(NbtCompound nbt) {}
    @Override protected void writeCustomDataToNbt(NbtCompound nbt) {}
    
    @Override
    public void tick() {
        super.tick();
        if (this.age > 200) this.discard(); // Despawn after 10s
        // Simple physics logic here
    }
}
