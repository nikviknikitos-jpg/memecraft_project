
package com.example.memecraft.client.render;
import com.example.memecraft.blockentity.IndusMotorBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
public class IndusMotorBER implements BlockEntityRenderer<IndusMotorBlockEntity> {
    public IndusMotorBER(BlockEntityRendererFactory.Context context) {}
    @Override
    public void render(IndusMotorBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        // Rule 5: Use MinecraftClient.getInstance().getBlockRenderManager() if needed
        // Render logic for lever and tire would go here
    }
}
