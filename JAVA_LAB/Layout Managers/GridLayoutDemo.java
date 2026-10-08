import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator Keypad");

        // Set GridLayout: 4 rows, 4 columns, with 5px horizontal and vertical gaps
        frame.setLayout(new GridLayout(4, 4, 5, 5));

        // Calculator button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Add all buttons to the grid
        for (String text : buttons) {
            frame.add(new JButton(text));
        }

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}