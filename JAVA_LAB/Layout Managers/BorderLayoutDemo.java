import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Application Dashboard");

        // Set BorderLayout
        frame.setLayout(new BorderLayout(5, 5));

        // Header (NORTH)
        JLabel header = new JLabel("Dashboard Header", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.LIGHT_GRAY);

        // Footer (SOUTH)
        JLabel footer = new JLabel("Dashboard Footer", SwingConstants.CENTER);
        footer.setOpaque(true);
        footer.setBackground(Color.LIGHT_GRAY);

        // Menu (WEST)
        JButton menu = new JButton("Side Menu");

        // Extra Info (EAST)
        JButton extraInfo = new JButton("Quick Links");

        // Main Content (CENTER)
        JTextArea content = new JTextArea("Main Content Area");

        // Add components to respective regions
        frame.add(header, BorderLayout.NORTH);
        frame.add(footer, BorderLayout.SOUTH);
        frame.add(menu, BorderLayout.WEST);
        frame.add(extraInfo, BorderLayout.EAST);
        frame.add(content, BorderLayout.CENTER);

        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}