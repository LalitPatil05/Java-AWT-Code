import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class DateChooserExample {

    	public static void main(String[] args) {
        
        JFrame frame = new JFrame("JDateChooser Example");
        frame.setLayout(new FlowLayout());

        // Create a JDateChooser component
        JDateChooser dateChooser = new JDateChooser();

        // Add the JDateChooser to the frame
        frame.add(dateChooser);

        // Button to get the date
        JButton getDateButton = new JButton("Get Selected Date");
        frame.add(getDateButton);

        // ActionListener for the button to fetch the selected date
        getDateButton.addActionListener(e -> {
            // Get the date from JDateChooser
            Date selectedDate = dateChooser.getDate();
            if (selectedDate != null) {
                System.out.println("Selected Date: " + selectedDate);
            } else {
                System.out.println("No date selected.");
            }
        });

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
