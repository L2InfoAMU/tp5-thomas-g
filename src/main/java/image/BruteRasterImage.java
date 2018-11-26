package image;

import javafx.scene.paint.Color;



public class BruteRasterImage extends RasterImage implements Image {

    public BruteRasterImage(Color color, int width, int height) {
        super(color, width, height);
    }

    public BruteRasterImage(Color[][] matrix) {
        super(matrix);
    }


}
