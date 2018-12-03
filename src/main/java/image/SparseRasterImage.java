package image;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.paint.Color;

public class SparseRasterImage extends RasterImage implements Map<Point, Color> {

    Map<Point, Color> colorMaps = new HashMap<>();

    public SparseRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public SparseRasterImage(Color[][] pixels) {
        super(pixels);
    }

    @Override
    public void createRepresentation() {
        for(int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                Point point = new Point(i, j);
                colorMaps.put(point, this.getPixelColor(i, j));
            }
        }
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        Point point = new Point(x, y);
        colorMaps.put(point, color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        Point point = new Point(x, y);
        return colorMaps.get(point);
    }

    @Override
    public void setPixelsColor(Color[][] pixels) {
        for(int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                this.setPixelColor(pixels[i][j], i, j);
            }
        }
    }

    @Override
    public void setPixelsColor(Color color) {

    }
}
