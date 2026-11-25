
package com.example.memecraft.client.gui;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
public class PhoneScreen extends Screen {
    private int clicks = 0;
    protected PhoneScreen() { super(Text.literal("RK Phone")); }
    @Override protected void init() {
        this.addDrawableChild(net.minecraft.client.gui.widget.ButtonWidget.builder(Text.literal("Обновить страницу"), button -> {
            clicks++;
            if (clicks >= 2) this.close();
        }).dimensions(this.width / 2 - 50, this.height / 2 + 20, 100, 20).build());
    }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context); // Rule 7
        super.render(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(this.textRenderer, "Доступ к YouTube ограничен", this.width / 2, this.height / 2 - 40, 0xFF0000);
    }
}
