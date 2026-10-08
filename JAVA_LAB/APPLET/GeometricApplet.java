import java.applet.Applet;
import java.awt.*;

/*
<applet code="GeometricApplet.class" width="400" height="300">
</applet>
*/
public class GeometricApplet extends Applet {
    public void paint(Graphics g) {
        // Line
        g.drawLine(30, 30, 150, 30);

        // Rectangle
        g.drawRect(30, 60, 100, 50);

        // Circle
        g.drawOval(160, 60, 60, 60);

        // Triangle
        int[] xPoints = {60, 30, 90};
        int[] yPoints = {140, 200, 200};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}