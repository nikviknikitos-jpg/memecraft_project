
package com.example.memecraft.client.render;
import com.example.memecraft.entities.HamsterEntity;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Identifier;
public class HamsterRenderer extends MobEntityRenderer<HamsterEntity, BipedEntityModel<HamsterEntity>> {
    public HamsterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BipedEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER)), 0.3f);
    }
    @Override public Identifier getTexture(HamsterEntity entity) { return new Identifier("memecraft:entity/hamster.png"); }
}
