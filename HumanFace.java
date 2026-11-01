
import java.applet.Applet;
import java.awt.*;

public class HumanFace extends Applet {
    public void paint(Graphics g) {
        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(145, 110, 20, 20);
        g.fillOval(235, 110, 20, 20);

        // Nose
        g.drawLine(200, 130, 190, 170);
        g.drawLine(190, 170, 210, 170);

        // Mouth
        g.drawArc(160, 160, 80, 50, 180, 180);
    }
}
