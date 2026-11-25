
package com.example.memecraft.client.gui;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
public class DeckScreen extends Screen {
    Run if [ -f "./gradlew" ]; then

Welcome to Gradle 8.8!

Here are the highlights of this release:
 - Running Gradle on Java 22
 - Configurable Gradle daemon JVM
 - Improved IDE performance for large projects

For more details see https://docs.gradle.org/8.8/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)
                       public DeckScreen() {super(Text.literal("Meme Deck")); }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        context.drawCenteredTextWithShadow(this.textRenderer, "Сова на скакалке", this.width / 2, this.height / 2, 0xFFFFFF);
    }
}
