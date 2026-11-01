
import java.applet.Applet;
import java.awt.*;

public class GeometricShapes extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 60);
        g.drawOval(200, 50, 80, 80);
        g.drawLine(50, 180, 250, 180);

        int x[] = {150, 100, 200};
        int y[] = {220, 300, 300};

        g.drawPolygon(x, y, 3);
    }
}
