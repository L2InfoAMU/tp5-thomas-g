package image;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javafx.scene.paint.Color;

public class SparseRasterImage extends RasterImage implements Map<Point, Color> {

    private Map<Point, Color> colorMaps = new HashMap<>();

    public SparseRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public SparseRasterImage(Color[][] pixels) {
        super(pixels);
    }

    @Override
    public void createRepresentation() {
        for (int i = 0; i < this.getWidth(); i++) {
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
        return colorMaps.getOrDefault(point, Color.WHITE);
    }

    @Override
    public void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                this.setPixelColor(pixels[i][j], i, j);
            }
        }
    }

    @Override
    public void setPixelsColor(Color color) {
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                this.setPixelColor(color, i, j);
            }
        }
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    protected int setWidth(int width) {
        return super.setWidth(width);
    }

    @Override
    protected int setHeiht(int height) {
        return super.setHeiht(height);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Color get(Object key) {
        return null;
    }

    @Override
    public Color put(Point key, Color value) {
        return null;
    }

    @Override
    public Color remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Point, ? extends Color> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Point> keySet() {
        return null;
    }

    @Override
    public Collection<Color> values() {
        return null;
    }

    @Override
    public Set<Entry<Point, Color>> entrySet() {
        return null;
    }
}
