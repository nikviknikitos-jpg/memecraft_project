
package com.example.memecraft.blocks;
import com.example.memecraft.blockentity.SlotMachineBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;
public class SlotMachineBlock extends BlockWithEntity {
    public SlotMachineBlock(Settings settings) { super(settings); }
    @Override public BlockRenderType getRenderType(BlockState state) { return BlockRenderType.ENTITYBLOCK_ANIMATED; }
    @Override public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) { return new SlotMachineBlockEntity(pos, state); }
}
