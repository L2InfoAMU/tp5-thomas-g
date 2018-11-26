package image;

import javafx.scene.paint.Color;
import static util.Matrices.requiresNonNull;
import static util.Matrices.requiresNonZeroDimensions;

public abstract class RasterImage implements Image {

    private Color color;
    private int width;
    private int height;
    Color[][] matrix;

    public RasterImage(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
        createRepresentation();
    }

    public RasterImage(Color[][] matrix) {
        requiresNonNull(matrix);
        requiresNonZeroDimensions(matrix);
        this.width = matrix.length;
        this.height = matrix[0].length;
        this.matrix = matrix;
    }

    public void createRepresentation() {
        this.matrix = new Color[width][height];
        for(int i = 0; i < this.width; i++) {
            for(int j = 0; j < this.height; j++) {
                matrix[i][j] = this.color;
            }
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return matrix[x][y];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setPixelColor(Color color, int x, int y){
        matrix[x][y] = color;
    }

    public void setPixelsColor(Color[][] pixels){
        this.matrix = pixels;
    }

    private void setPixelsColor(Color color) {
        for(int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                matrix[i][j] = color;
            }
        }
    }

    protected int setWidth(int width) {
        return this.width = width;
    }

    protected int setHeiht(int height) {
        return this.height = height;
    }
}
