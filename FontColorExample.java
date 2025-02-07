// Java program to test  
// Custom available font in AWT  
import java.awt.*; 
import java.awt.Color; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 
 
public class FontColorExample extends Frame {   
      //class to close the AWT frame 
    FontColorExample(){ 
        // To close the AWT frame we use the WindowAdapter class 
        this.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent we) { 
                System.exit(0); 
            } 
        }); 
       
    } 
   
    // Here to draw the string we use the  
    // Graphics class in java 
    public void paint(Graphics g){ 
       
        g.setColor(Color.GREEN); 
       
        // Algerian font family is present in the above 
        // mentioned program output 
        g.setFont(new Font("Algerian", Font.BOLD, 50)); 
        g.drawString("Lalit Patil", 100, 200); 
    } 
   
      //Main Method 
    public static void main(String args[]){ 
        FontColorExample obj = new FontColorExample(); 
        obj.setTitle("Font&Color"); 
        obj.setSize(600, 600); 
        obj.setVisible(true); 
    } 
} 