import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusListenerExample {
    
    public static void main(String[] args) {

        JFrame F = new JFrame("FocusListener Example");
	JTextField textField = new JTextField(20); 
        F.setSize(300, 300);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setLayout(new FlowLayout());
                       
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
              
                System.out.println("TextField has gained focus.");
            }

            @Override
            public void focusLost(FocusEvent e) {
                
                System.out.println("TextField has lost focus.");
            }
        });

       F.add(textField);
	F.setVisible(true);
    }
}
