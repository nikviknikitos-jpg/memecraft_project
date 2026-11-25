
package com.example.memecraft.client.render;
import com.example.memecraft.entities.BananaMonkeyEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Identifier;
public class BananaMonkeyRenderer extends BipedEntityRenderer<BananaMonkeyEntity, BipedEntityModel<BananaMonkeyEntity>> {
    public BananaMonkeyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BipedEntityModel<>(ctx.getPart(net.minecraft.client.render.entity.model.EntityModelLayers.PLAYER)), 0.5f);
    }
    @Override public Identifier getTexture(BananaMonkeyEntity entity) { return new Identifier("memecraft:entity/monkey.png"); }
}
