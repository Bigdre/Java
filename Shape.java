package Animation;

import java.awt.Point;

public class Shape {
    
    public static final int POINT = 0;
    public static final int LINE = 1;
    public static final int OVAL = 2;
    public static final int RECTANGLE = 3;
    public static final int TRIANGLE = 4;
    public int shape;
    public int color;
    public Point startPoint, stopPoint;
    public int x, y, dx, dy;
    
    public Shape(int shape, Point startPoint, Point stopPoint) {
        this.shape = shape;
        this.startPoint = startPoint;
        this.stopPoint = stopPoint;
        x = startPoint.x;
        y = startPoint.y;
        dx = stopPoint.x;
        dy = stopPoint.y;
    }
    
    public void drawShape(java.awt.Graphics g) {
        switch(shape) {
            case 1:
                g.drawLine(x, y, dx, dy);
                break;
            case 2:
                g.drawOval(x, y, dx, dy);
                break;
            case 3:
                g.drawRect(x, y, dx, dy);
                break;
        }
    }
}
