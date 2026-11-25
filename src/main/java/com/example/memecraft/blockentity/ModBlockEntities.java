
package com.example.memecraft.blockentity;
import com.example.memecraft.MemeCraft;
import com.example.memecraft.blocks.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModBlockEntities {
    public static final BlockEntityType<IndusMotorBlockEntity> INDUS_MOTOR_BE = 
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "indus_motor_be"),
                    BlockEntityType.Builder.create(IndusMotorBlockEntity::new, ModBlocks.INDUS_MOTOR).build(null));
    public static final BlockEntityType<SlotMachineBlockEntity> SLOT_MACHINE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MemeCraft.MOD_ID, "slot_machine_be"),
                    BlockEntityType.Builder.create(SlotMachineBlockEntity::new, ModBlocks.SLOT_MACHINE).build(null));
    public static void register() {}
}
