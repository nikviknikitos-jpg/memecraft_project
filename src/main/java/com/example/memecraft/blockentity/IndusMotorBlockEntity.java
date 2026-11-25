
package com.example.memecraft.blockentity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
public class IndusMotorBlockEntity extends BlockEntity {
    public boolean hasTire = false;
    public float rpm = 0;
    public IndusMotorBlockEntity(BlockPos pos, BlockState state) { super(ModBlockEntities.INDUS_MOTOR_BE, pos, state); }
    @Override protected void writeNbt(NbtCompound nbt) { nbt.putBoolean("hasTire", hasTire); nbt.putFloat("rpm", rpm); }
    @Override public void readNbt(NbtCompound nbt) { super.readNbt(nbt); hasTire = nbt.getBoolean("hasTire"); rpm = nbt.getFloat("rpm"); }
}
