
package com.example.memecraft.client.render;
import com.example.memecraft.entities.WormParasiteEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
public class WormParasiteRenderer extends EntityRenderer<WormParasiteEntity> {
    public WormParasiteRenderer(EntityRendererFactory.Context ctx) { super(ctx); }
    @Override public Identifier getTexture(WormParasiteEntity entity) { return new Identifier("memecraft:entity/worm.png"); }
}
