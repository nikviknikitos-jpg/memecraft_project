
package com.example.memecraft.client.render;
import com.example.memecraft.entities.AnomalyMinionEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Identifier;
public class AnomalyMinionRenderer extends BipedEntityRenderer<AnomalyMinionEntity, BipedEntityModel<AnomalyMinionEntity>> {
    public AnomalyMinionRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BipedEntityModel<>(ctx.getPart(net.minecraft.client.render.entity.model.EntityModelLayers.PLAYER)), 0.5f);
    }
    @Override public Identifier getTexture(AnomalyMinionEntity entity) { return new Identifier("memecraft:entity/anomaly_minion.png"); }
}
