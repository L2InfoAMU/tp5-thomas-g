package image;

import javafx.scene.paint.Color;
import static util.Matrices.requiresNonNull;


public class BruteRasterImage implements Image {

    private  int width;
    private  int height;
    private Color color;
    private Color[][] colors;

    public BruteRasterImage(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public BruteRasterImage(Color[][] colors) {
            this.colors = colors;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
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
        Color[][] matrix = new Color[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                matrix[i][j] = colors[i][j];
            }
        }
    }



}
