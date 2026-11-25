
package com.example.memecraft.client;

import com.example.memecraft.blockentity.ModBlockEntities;
import com.example.memecraft.client.render.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(ModBlockEntities.INDUS_MOTOR_BE, IndusMotorBER::new);
        
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.FLYING_TIRE, FlyingTireRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.VOID_ANOMALY, VoidAnomalyRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.ANOMALY_MINION, AnomalyMinionRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.HAMSTER, HamsterRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.BEGGAR, BeggarRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.MONKEY, BananaMonkeyRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.WORM, WormParasiteRenderer::new);
        EntityRendererRegistry.register(com.example.memecraft.entities.ModEntities.MIMIC, PlayerMimicRenderer::new);
    }
}
