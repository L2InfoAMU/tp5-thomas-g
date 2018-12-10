package image;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javafx.scene.paint.Color;

public class SparseRasterImage extends RasterImage implements Map<Point, Color> {

    private Map<Point, Color> colorMaps;

    public SparseRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public SparseRasterImage(Color[][] pixels) {
        super(pixels);
    }

    @Override
    public void createRepresentation() {
        colorMaps = new HashMap<>();
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
    protected int setHeight(int height) {
        return super.setHeight(height);
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
