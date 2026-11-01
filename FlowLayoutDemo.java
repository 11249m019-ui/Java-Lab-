
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Flow Layout");

        f.setLayout(new FlowLayout());

        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));
        f.add(new Button("Button 4"));

        f.setSize(400, 200);
        f.setVisible(true);
    }
}
