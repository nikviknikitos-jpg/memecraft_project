
package com.example.memecraft.entities;
import com.example.memecraft.items.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
public class HamsterEntity extends MobEntity {
    protected HamsterEntity(EntityType<? extends MobEntity> entityType, World world) { super(entityType, world); }
    public static DefaultAttributeContainer.Builder createHamsterAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 5.0);
    }
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (!this.getWorld().isClient) {
            this.playSound(SoundEvents.ENTITY_RABBIT_AMBIENT, 1.0f, 1.0f);
            player.giveItemStack(new net.minecraft.item.ItemStack(ModItems.MEME_COIN, 1));
            player.sendMessage(Text.literal("[Hamster Kombat]: *пищит*"));
        }
        return ActionResult.SUCCESS;
    }
}
