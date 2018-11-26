package image;

import javafx.scene.paint.Color;
import static util.Matrices.requiresNonNull;


public class BruteRasterImage implements Image {

    private  int width;
    private  int height;
    private Color color;
    private Color[][] colors;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public BruteRasterImage(Color[][] colors) {
        requiresNonNull(colors);
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
        for(int i = 0; i < this.width; i++){
            for(int j = 0; j < this.height; j++){
                matrix[i][j] = colors[i][j];
            }
        }
    }

    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y] = color;
    }

    public void setPixelsColor(Color[][] pixels){
        this.colors = pixels;
    }

    private void setPixelsColor(Color color){
        for(int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                this.colors[i][j] = color;
            }
        }
    }

    protected int setWidth(int width){
        return this.width = width;
    }

    protected int setHeight(int height){
        return this.height = height;
    }

}
