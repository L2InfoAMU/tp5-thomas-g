package image;

import javafx.scene.paint.Color;


public class BruteRasterImage extends RasterImage {

    Color[][] matrix;

    public BruteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public BruteRasterImage(Color[][] matrix) {
        super(matrix);
    }

    @Override
    public void createRepresentation() {
        matrix = new Color[this.getWidth()][this.getHeight()];
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return matrix[x][y];
    }
}
