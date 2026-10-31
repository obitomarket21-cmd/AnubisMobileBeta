package dev.anubis.mobile.ui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class AnubisClickGuiScreen extends Screen {

    public AnubisClickGuiScreen() {
        super(Text.literal("Anubis Client"));
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        this.addDrawableChild(
            ButtonWidget.builder(
                Text.literal("CLOSE"),
                button -> this.close()
            ).dimensions(centerX - 60, centerY + 55, 120, 25).build()
        );
    }

    @Override
    public void render(
        DrawContext context,
        int mouseX,
        int mouseY,
        float delta
    ) {
        this.renderBackground(context, mouseX, mouseY, delta);

        int centerX = this.width / 2;
        int centerY = this.height / 2;

        context.fill(
            centerX - 130,
            centerY - 85,
            centerX + 130,
            centerY + 95,
            0xEE101827
        );

        context.drawCenteredTextWithShadow(
            this.textRenderer,
            Text.literal("ANUBIS CLIENT"),
            centerX,
            centerY - 60,
            0xFF55AAFF
        );

        context.drawCenteredTextWithShadow(
            this.textRenderer,
            Text.literal("MOBILE BETA 0.1"),
            centerX,
            centerY - 35,
            0xFFFFFFFF
        );

        context.drawCenteredTextWithShadow(
            this.textRenderer,
            Text.literal("Welcome to Anubis"),
            centerX,
            centerY,
            0xFFAAAAAA
        );

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
