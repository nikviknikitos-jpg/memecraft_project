
package com.example.memecraft.items;
import com.example.memecraft.blocks.ModBlocks;
import com.example.memecraft.entities.ModEntities;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class CasinoTicketItem extends Item {
    public CasinoTicketItem(Settings settings) { super(settings); }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            BlockPos center = user.getBlockPos();
            // Build Casino 13x7x13
            for (int x = -6; x <= 6; x++) {
                for (int y = 0; y < 7; y++) {
                    for (int z = -6; z <= 6; z++) {
                        BlockPos p = center.add(x, y, z);
                        if (y == 0) world.setBlockState(p, Blocks.GOLD_BLOCK.getDefaultState(), 3);
                        else if (y == 6) world.setBlockState(p, Blocks.RED_WOOL.getDefaultState(), 3);
                        else if (Math.abs(x)==6 || Math.abs(z)==6) world.setBlockState(p, Blocks.QUARTZ_BLOCK.getDefaultState(), 3);
                        else world.setBlockState(p, Blocks.AIR.getDefaultState(), 3);
                    }
                }
            }
            // Spawn Slot Machines
            world.setBlockState(center.add(0, 1, 0), ModBlocks.SLOT_MACHINE.getDefaultState(), 3);
            world.setBlockState(center.add(2, 1, 0), ModBlocks.SLOT_MACHINE.getDefaultState(), 3);
            world.setBlockState(center.add(-2, 1, 0), ModBlocks.SLOT_MACHINE.getDefaultState(), 3);
            
            // Spawn Hamster & Beggar
            var hamster = ModEntities.HAMSTER.create(world);
            if(hamster != null) { hamster.setPosition(center.getX()+0.5, center.getY()+1, center.getZ()+0.5); world.spawnEntity(hamster); }
            var beggar = ModEntities.BEGGAR.create(world);
            if(beggar != null) { beggar.setPosition(center.getX()-0.5, center.getY()+1, center.getZ()-0.5); world.spawnEntity(beggar); }
            
            world.playSound(null, center, SoundEvents.ENTITY_FIREWORK_ROCKET_LAUNCH, net.minecraft.sound.SoundCategory.PLAYERS, 1.0f, 1.0f);
            user.getStackInHand(hand).decrement(1);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
