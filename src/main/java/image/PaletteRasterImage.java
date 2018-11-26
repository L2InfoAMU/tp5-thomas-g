package image;

import javafx.scene.paint.Color;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {

    List<Color> palette;

    public PaletteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public PaletteRasterImage(Color[][] matrix) {
        super(matrix);
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        super.setPixelColor(color, x, y);
        if (palette)
    }
}