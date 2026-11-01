
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");

        f.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String b : buttons) {
            f.add(new Button(b));
        }

        f.setSize(400, 300);
        f.setVisible(true);
    }
}
