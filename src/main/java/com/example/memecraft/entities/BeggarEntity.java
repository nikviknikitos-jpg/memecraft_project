
package com.example.memecraft.entities;
import com.example.memecraft.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
public class BeggarEntity extends MobEntity {
    protected BeggarEntity(EntityType<? extends MobEntity> entityType, World world) { super(entityType, world); }
    public static DefaultAttributeContainer.Builder createBeggarAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0);
    }
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (!this.getWorld().isClient) {
            if (player.getInventory().contains(new net.minecraft.item.ItemStack(ModItems.MEME_COIN))) {
                player.getInventory().removeOne(new net.minecraft.item.ItemStack(ModItems.MEME_COIN));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 3600, 2));
                player.sendMessage(Text.literal("Бродяга: Спасибо на удачу!"));
            } else {
                player.sendMessage(Text.literal("Бродяга: Эй, друг, подкинь монетку на удачу!"));
            }
        }
        return ActionResult.SUCCESS;
    }
}
