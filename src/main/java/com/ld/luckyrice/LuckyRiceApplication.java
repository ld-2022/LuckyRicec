package com.ld.luckyrice;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LuckyRiceApplication extends GameApplication {
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setFullScreenFromStart(true);
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("BasicGameSample");
        settings.setGameMenuEnabled(true);
    }


    @Override
    protected void initGame() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        FXGL.getGameScene();
        FXGL.entityBuilder()
                .at(150, 150)
                .view(new Rectangle(40, 40, Color.BLUE))
                .buildAndAttach();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
