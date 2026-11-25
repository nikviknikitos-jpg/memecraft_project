package com.example.memecraft.client.gui;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Random;

public class DeckScreen extends Screen {
    private static final String[] CARDS = {
            "Сова на скакалке", "Собака-гольфач", "Жираф с мыльными пузырями",
            "Змейка на сёрфе", "Скунс-гонщик", "Дельфин-боксёр",
            "Медведь на скейтборде", "Тигр-фокусник", "Обезьяна с шариками",
            "Фламинго в супермаркете", "Осьминог с мороженым", "Индюк-пират"
    };

    private boolean flipped = false;
    private int animTicks = 0;
    private int selectedCard = 0;

    public DeckScreen() {
        super(Text.literal("Колода: Сова на скакалке"));
        this.selectedCard = new Random().nextInt(CARDS.length);
    }

    @Override
    public void tick() {
        if (flipped && animTicks < 20) {
            animTicks++;
            if (animTicks == 15) {
                var buf = PacketByteBufs.create();
                buf.writeInt(selectedCard);
                ClientPlayNetworking.send(new Identifier("memecraft", "activate_card"), buf);
            }
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (!flipped) {
            flipped = true;
            if (this.client != null && this.client.player != null) {
                this.client.player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.2f);
            }
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        int cx = this.width / 2;
        int cy = this.height / 2;

        float scale = 1.0f;
        if (flipped && animTicks < 10) {
            scale = 1.0f + (float) Math.sin((animTicks / 10.0) * Math.PI) * 0.45f;
        }

        context.getMatrices().push();
        context.getMatrices().translate(cx, cy, 0);
        context.getMatrices().scale(scale, scale, 1.0f);

        int w = 130;
        int h = 190;
        if (!flipped || animTicks < 6) {
            context.fill(-w / 2, -h / 2, w / 2, h / 2, 0xFF1A3A8A);
            context.drawBorder(-w / 2, -h / 2, w, h, 0xFFFFD700);
            context.drawCenteredTextWithShadow(this.textRenderer, "Нажми на карту!", 0, -5, 0xFFFFFFFF);
        } else {
            context.fill(-w / 2, -h / 2, w / 2, h / 2, 0xFFF5E6C8);
            context.drawBorder(-w / 2, -h / 2, w, h, 0xFF8B4513);
            context.drawCenteredTextWithShadow(this.textRenderer, CARDS[selectedCard], 0, -10, 0xFF222222);
        }

        context.getMatrices().pop();
        super.render(context, mouseX, mouseY, delta);
    }
}
