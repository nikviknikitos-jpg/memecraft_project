package com.example.memecraft.blocks;
import net.minecraft.util.math.BlockPos;

import com.example.memecraft.blockentity.IndusMotorBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class IndusMotorBlock extends BlockWithEntity {
    public IndusMotorBlock(Settings settings) { super(settings); }
    @Override public BlockRenderType getRenderType(BlockState state) { return BlockRenderType.ENTITYBLOCK_ANIMATED; }
    @Override public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) { return new IndusMotorBlockEntity(pos, state); }
}
