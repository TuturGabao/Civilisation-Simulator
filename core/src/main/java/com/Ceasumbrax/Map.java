package com.Ceasumbrax;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Map {
    FileHandle groundRelatedMiscFolder = Gdx.files.internal("GroundRelated/Misc");

    Texture[] groundRelatedMisc = new Texture[groundRelatedMiscFolder.list().length];

    Texture tile = new Texture("GroundRelated/Tiles/GroundGrassTile.png");
    Texture debugTile = new Texture("GroundRelated/Tiles/SmallTileDebug.png");

    public boolean left;
    public boolean right;
    public boolean up;
    public boolean down;

    int[][] wholeMap;
    int[][] tiledIntMap;

    int tileSize = 64;
    int smallTiledSize = 8;

    int resolutionW;
    int resolutionH;

    int tiledMapWidth;
    int tiledMapHeight;
    int tileAroundVisibleArea;

    int startXTilesVisibleOnScreen;
    int startYTilesVisibleOnScreen;

    int startTilesTotalX;
    int startTilesTotalY;

    int speed = 190;

    /*
    TODO: Finish the all map functions with the chunks.
          Save the position of the map.
          When reaching an other chunk, create a new csv chunk containing infos.
          Try not to show every tile, only show visible tiles + 10% of the visible tiles.
            -> if tile > WIDTH + 10% not show, else, show a tile more at the top.
    */

    Map(int resolutionWidth, int resolutionHeight) {
        resolutionW = resolutionWidth;
        resolutionH = resolutionHeight;

        initializeTexture();
        initializeTiledMap();
        initializeData();
    }

    public void createWholeMap(int chunkWidth, int chunkHeight, int tilesColsPerChunk, int tilesRowsPerChunk) {

    }

    public void initializeData() {
        startXTilesVisibleOnScreen = (resolutionW - tiledMapWidth * tileSize) / 2 + 1;
        startYTilesVisibleOnScreen = (resolutionH - tiledMapHeight * tileSize) / 2 + 1;

        startTilesTotalX = startXTilesVisibleOnScreen - tileAroundVisibleArea / 2 * tileSize;
        startTilesTotalY = startYTilesVisibleOnScreen - tileAroundVisibleArea / 2 * tileSize;
    }

    public void initializeTexture() {
        int count = 0;
        for (FileHandle file : groundRelatedMiscFolder.list()) {
            groundRelatedMisc[count] = new Texture(file);

            count++;
        }
    }

    public void initializeTiledMap() {
        tiledMapWidth = resolutionW / tileSize;
        tiledMapHeight = resolutionH / tileSize;

        tileAroundVisibleArea = tiledMapWidth / 10 + tiledMapHeight / 10;
        tiledIntMap = new int[tiledMapWidth + tileAroundVisibleArea][tiledMapHeight + tileAroundVisibleArea];

        for (int i = 0 ; i < tiledMapWidth + tileAroundVisibleArea ; i++) {
            for (int j = 0 ; j < tiledMapHeight + tileAroundVisibleArea ; j++) {
                tiledIntMap[i][j] = 1;
            }
        }
    }

    public int[][] drawTiledMapReturningIntMap(SpriteBatch batch) {
        for (int i = 0; i < tiledIntMap.length; i++) {
            for (int j = 0; j < tiledIntMap[i].length; j++) {
                int placeTileX = startTilesTotalX + i * tileSize;
                int placeTileY = startTilesTotalY + j * tileSize;

                batch.draw(tile, placeTileX, placeTileY, tileSize, tileSize);

            }
        }

        //// drawSmalledTiledPlacingMap(batch);

        return tiledIntMap;
    }

    public void drawSmalledTiledPlacingMap(SpriteBatch batch) {    //// This will be only used for debug purposes
        for (int i = 0; i < tiledIntMap.length; i++) {
            for (int j = 0; j < tiledIntMap[i].length; j++) {
                for (int k = 0; k < (tileSize / smallTiledSize)*(tileSize/smallTiledSize); k++) {

                    int tileXPos = k % (tileSize / smallTiledSize) * smallTiledSize + i * tileSize;
                    int tileYPos = k / (tileSize / smallTiledSize) * smallTiledSize + j * tileSize;
                    batch.draw(debugTile, tileXPos, tileYPos, smallTiledSize, smallTiledSize);

                }

            }
        }
    }

    public void handleMapMovement(float delta) {
        float dx = 0;
        float dy = 0;

        if (left) dx += 1;
        if (right) dx -= 1;
        if (up) dy -= 1;
        if (down) dy += 1;

        float length = (float)Math.sqrt(dx * dx + dy * dy);

        if (length > 0) {
            dx /= length;
            dy /= length;
        }

        startTilesTotalX += (int) (dx * speed * delta);
        startTilesTotalY += (int) (dy * speed * delta);
    }
}
