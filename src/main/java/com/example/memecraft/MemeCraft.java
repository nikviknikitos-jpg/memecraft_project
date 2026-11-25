
package com.example.memecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MemeCraft implements ModInitializer {
    public static final String MOD_ID = "memecraft";
    
    public static final ItemGroup MEME_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(com.example.memecraft.items.ModItems.MEME_COIN))
            .displayName(Text.translatable("itemGroup.memecraft.general"))
            .entries((displayContext, entries) -> {
                entries.add(com.example.memecraft.items.ModItems.MEME_COIN);
                entries.add(com.example.memecraft.items.ModItems.CASINO_TICKET);
                entries.add(com.example.memecraft.items.ModItems.MEME_DECK);
                entries.add(com.example.memecraft.items.ModItems.RED_BUTTON);
                entries.add(com.example.memecraft.items.ModItems.RK_PHONE);
                entries.add(com.example.memecraft.items.ModItems.BANANA_ITEM);
                
                entries.add(com.example.memecraft.blocks.ModBlocks.INDUS_MOTOR);
                entries.add(com.example.memecraft.blocks.ModBlocks.SLOT_MACHINE);
                entries.add(com.example.memecraft.blocks.ModBlocks.PINEAPPLE_BLOCK);
                entries.add(com.example.memecraft.blocks.ModBlocks.RED_BUTTON_BOX);
                
                entries.add(com.example.memecraft.entities.ModEntities.ANOMALY_SPAWNER_EGG);
                entries.add(com.example.memecraft.entities.ModEntities.HAMSTER_SPAWN_EGG);
                entries.add(com.example.memecraft.entities.ModEntities.BEGGAR_SPAWN_EGG);
                entries.add(com.example.memecraft.entities.ModEntities.MONKEY_SPAWN_EGG);
                entries.add(com.example.memecraft.entities.ModEntities.WORM_SPAWN_EGG);
                entries.add(com.example.memecraft.entities.ModEntities.MIMIC_SPAWN_EGG);
            })
            .build();

    @Override
    public void onInitialize() {
        // ПРАВИЛО 2: Блоки ДО Предметов!
        com.example.memecraft.blocks.ModBlocks.register();
        com.example.memecraft.blockentity.ModBlockEntities.register();
        com.example.memecraft.items.ModItems.register();
        com.example.memecraft.entities.ModEntities.register();
        
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "general"), MEME_GROUP);
    }
}
