import java.applet.Applet;
import java.awt.*;

/*
<applet code="StyledApplet.class" width="400" height="300">
</applet>
*/
public class StyledApplet extends Applet {
    public void paint(Graphics g) {
        // Red Rectangle
        g.setColor(Color.RED);
        g.fillRect(30, 30, 120, 60);

        // Blue Oval
        g.setColor(Color.BLUE);
        g.fillOval(180, 30, 100, 60);

        // Bold Text Message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Java Applets are fun!", 50, 150);
    }
}