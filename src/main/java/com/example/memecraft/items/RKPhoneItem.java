
package com.example.memecraft.items;
import com.example.memecraft.client.gui.PhoneScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
public class RKPhoneItem extends Item {
    public RKPhoneItem(Settings settings) { super(settings); }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            MinecraftClient.getInstance().setScreen(new PhoneScreen());
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
