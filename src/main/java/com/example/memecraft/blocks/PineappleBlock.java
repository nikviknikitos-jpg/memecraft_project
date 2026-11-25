
package com.example.memecraft.blocks;
import com.example.memecraft.entities.ModEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class PineappleBlock extends Block {
    public PineappleBlock(Settings settings) { super(settings); }
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @org.jetbrains.annotations.Nullable net.minecraft.entity.LivingEntity placer, net.minecraft.item.ItemStack itemStack) {
        if (!world.isClient) {
            for (int i = 0; i < 4; i++) {
                double angle = i * Math.PI / 2;
                double x = pos.getX() + 1.5 * Math.cos(angle);
                double z = pos.getZ() + 1.5 * Math.sin(angle);
                var monkey = ModEntities.MONKEY.create(world);
                if (monkey != null) {
                    monkey.setPosition(x, pos.getY() + 1, z);
                    world.spawnEntity(monkey);
                }
            }
        }
    }
}
