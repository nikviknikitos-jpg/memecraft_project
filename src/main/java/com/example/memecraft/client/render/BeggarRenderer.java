
package com.example.memecraft.client.render;
import com.example.memecraft.entities.BeggarEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Identifier;
public class BeggarRenderer extends BipedEntityRenderer<BeggarEntity, BipedEntityModel<BeggarEntity>> {
    public BeggarRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BipedEntityModel<>(ctx.getPart(net.minecraft.client.render.entity.model.EntityModelLayers.PLAYER)), 0.5f);
    }
    @Override public Identifier getTexture(BeggarEntity entity) { return new Identifier("memecraft:entity/beggar.png"); }
}
