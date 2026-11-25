
package com.example.memecraft.blocks;

import com.example.memecraft.MemeCraft;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block INDUS_MOTOR = new IndusMotorBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK));
    public static final Block SLOT_MACHINE = new SlotMachineBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK));
    public static final Block PINEAPPLE_BLOCK = new PineappleBlock(AbstractBlock.Settings.copy(Blocks.MELON));
    public static final Block RED_BUTTON_BOX = new Block(AbstractBlock.Settings.copy(Blocks.STONE));

    public static void register() {
        registerBlock("indus_motor", INDUS_MOTOR);
        registerBlock("slot_machine", SLOT_MACHINE);
        registerBlock("pineapple_block", PINEAPPLE_BLOCK);
        registerBlock("red_button_box", RED_BUTTON_BOX);
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MemeCraft.MOD_ID, name), block);
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
}
