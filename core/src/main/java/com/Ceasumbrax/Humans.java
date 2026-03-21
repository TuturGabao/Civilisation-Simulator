package com.Ceasumbrax;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Humans {

    private Texture playerTexture = new Texture("AliveRelated/Humans/HumanClassic.png");
    private Texture playerTextureSide = new Texture("AliveRelated/Humans/HumanSide.png");
    private Texture playerTextureUp = new Texture("AliveRelated/Humans/HumanUp.png");
    private Texture playerTextureDown = new Texture("AliveRelated/Humans/HumanDown.png");
    private Texture playerTextureUpDiagonal = new Texture("AliveRelated/Humans/HumanUpDiagonal.png");
    private Texture playerTextureDownDiagonal = new Texture("AliveRelated/Humans/HumanDownDiagonal.png");

    public boolean left;
    public boolean right;
    public boolean up;
    public boolean down;

    boolean flipX = Boolean.FALSE;
    boolean flipY = Boolean.FALSE;

    public float x;
    public float y;

    int speed = 300;

    int playerSizeWidth;
    int playerSizeHeight;

    /*
    TODO: Change all class to make it random ( -> choose random tile and goes there ; we will start with rnd movement)
          Save each human data when leaving
    */
    Humans(float[] poses) {
        x = poses[0]; y = poses[1];

        playerSizeWidth = 38;
        playerSizeHeight = 48;
    }

    public void drawImage(SpriteBatch batch) {
        Texture showingTexture = playerTexture;

        if (left || right) {
            if (up) {
                showingTexture = playerTextureUpDiagonal;
            } else if (down) {
                showingTexture = playerTextureDownDiagonal;
            } else {
                showingTexture = playerTextureSide;
            }
        } else {
            if (up) {
                showingTexture = playerTextureUp;
            } else if (down) {
                showingTexture = playerTextureDown;
            }
        }

        batch.draw(showingTexture, x, y, playerSizeWidth, playerSizeHeight, 0, 0, showingTexture.getWidth(), showingTexture.getHeight(), flipX, flipY);

    }

    public void handleMovement() {
        if (left) flipX = Boolean.TRUE;
        if (right) flipX = Boolean.FALSE;

    }

}
