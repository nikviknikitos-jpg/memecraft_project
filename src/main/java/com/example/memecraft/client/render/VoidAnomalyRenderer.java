
package com.example.memecraft.client.render;
import com.example.memecraft.entities.VoidAnomalyEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
public class VoidAnomalyRenderer extends EntityRenderer<VoidAnomalyEntity> {
    protected VoidAnomalyRenderer(EntityRendererFactory.Context ctx) { super(ctx); }
    @Override public Identifier getTexture(VoidAnomalyEntity entity) { return new Identifier("minecraft:textures/entity/ender_dragon/dragon.png"); }
}
