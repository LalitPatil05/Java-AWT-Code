import javax.swing.*;
import java.awt.*;

public class MultiPanelExample{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Panel at Specific Location");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);  // Set layout to null for absolute positioning

        // Create a JPanel
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setBounds(50, 50, 100, 100); // Set position (x, y) and size (width, height)

        // Create another JPanel
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setBounds(200, 100, 100, 100); // Set position (x, y) and size (width, height)

        // Add panels to the frame
        frame.add(panel1);
        frame.add(panel2);

        // Display the frame
        frame.setVisible(true);
    }
}
