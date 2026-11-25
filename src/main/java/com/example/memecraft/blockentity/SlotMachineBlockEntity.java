
package com.example.memecraft.blockentity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
public class SlotMachineBlockEntity extends BlockEntity {
    public SlotMachineBlockEntity(BlockPos pos, BlockState state) { super(ModBlockEntities.SLOT_MACHINE_BE, pos, state); }
    @Override protected void writeNbt(NbtCompound nbt) {}
    @Override public void readNbt(NbtCompound nbt) { super.readNbt(nbt); }
}
