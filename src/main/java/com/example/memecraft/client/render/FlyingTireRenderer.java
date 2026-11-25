
package com.example.memecraft.client.render;
import com.example.memecraft.entities.FlyingTireEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
public class FlyingTireRenderer extends EntityRenderer<FlyingTireEntity> {
    public FlyingTireRenderer(EntityRendererFactory.Context ctx) { super(ctx); }
    @Override public Identifier getTexture(FlyingTireEntity entity) { return new Identifier("memecraft:item/tire_item"); }
}
