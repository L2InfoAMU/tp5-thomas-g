package image;

import javafx.scene.paint.Color;
import static util.Matrices.requiresNonNull;
import static util.Matrices.requiresNonZeroDimensions;

public abstract class RasterImage implements Image {

    private int width;
    private int height;


    public RasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public RasterImage(Color[][] matrix) {
        requiresNonNull(matrix);
        requiresNonZeroDimensions(matrix);
        this.width = matrix.length;
        this.height = matrix[0].length;
        createRepresentation();
        setPixelsColor(matrix);
    }

    public abstract void createRepresentation();

    @Override
    public abstract Color getPixelColor(int x, int y);

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setPixelColor(Color color, int x, int y){
        Color[][] matrix = new Color[this.getWidth()][this.getHeight()];
        matrix[x][y] = color;
    }

    public void setPixelsColor(Color[][] pixels){
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                this.setPixelColor(pixels[i][j], i, j);
            }
        }
    }

    public void setPixelsColor(Color color) {
        for(int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                this.setPixelColor(color, i, j);
            }
        }
    }

    protected int setWidth(int width) {
        return this.width = width;
    }

    protected int setHeight(int height) {
        return this.height = height;
    }
}
