
package com.example.memecraft.client.gui;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
public class DeckScreen extends Screen {
    protected DeckScreen() { super(Text.literal("Meme Deck")); }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        context.drawCenteredTextWithShadow(this.textRenderer, "Сова на скакалке", this.width / 2, this.height / 2, 0xFFFFFF);
    }
}
