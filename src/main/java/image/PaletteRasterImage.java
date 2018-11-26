package image;

import javafx.scene.paint.Color;
import java.util.List;

public class PaletteRasterImage implements Image {

    private Color color;
    private int width;
    private int height;
    private Color[][] pixels;
    List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.pixels = new Color[width][height];
        createRepresentation();
    }

    public PaletteRasterImage(Color[][] pixels) {
        this.width = pixels.length;
        this.height = pixels[0].length;
        this.pixels = pixels;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void createRepresentation(){
        this.pixels = new Color[width][height];
        for(int i = 0; i < this.width; i++){
            for(int j = 0; j < this.height; j++) {
                pixels[i][j] = this.color;
            }
        }
    }

    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color)){
            palette.add(color);
        }
        pixels[x][y] = color;
    }

    public void setPixelsColor(Color[][] pixels){
        this.pixels = pixels;
    }
}