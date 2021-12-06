package assignment;
import java.awt.geom.*;

public final class Z2 extends Z {
    private static Rectangle2D.Double[] bounds = {
        new Rectangle2D.Double(-4,  0,  8, 5),
        new Rectangle2D.Double(-6, -3, 16, 3)
    };

    public static boolean pointInBounds(double x, double y) {
        Point2D.Double point = new Point2D.Double(x,y);
        for (var rectangle : bounds) {
            if (rectangle.contains(point))
                return true;
        }
        return false;
    }
}