package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage {

    List<Color> palette;
    Color[][] matrix;

    public PaletteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public PaletteRasterImage(Color[][] matrix) {
        super(matrix);
    }

    @Override
    public void createRepresentation() {
        matrix = new Color[this.getWidth()][this.getHeight()];
        palette = new ArrayList<>();
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return matrix[x][y];
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        matrix[x][y] = color;
        if (!palette.contains(color))
            palette.add(color);
    }
}