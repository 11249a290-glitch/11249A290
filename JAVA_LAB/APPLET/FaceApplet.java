import java.applet.Applet;
import java.awt.*;

/*
<applet code="FaceApplet.class" width="300" height="300">
</applet>
*/
public class FaceApplet extends Applet {
    public void paint(Graphics g) {
        // Head Outline
        g.drawOval(50, 30, 200, 220);

        // Eyes
        g.fillOval(90, 80, 25, 25);  // Left Eye
        g.fillOval(185, 80, 25, 25); // Right Eye

        // Nose (Triangle)
        int[] xNose = {150, 140, 160};
        int[] yNose = {120, 150, 150};
        g.drawPolygon(xNose, yNose, 3);

        // Mouth (Arc)
        g.drawArc(100, 160, 100, 50, 180, 180);
    }
}