import java.awt.Container; 
import java.awt.Graphics; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
class TextDisplayPanel extends JPanel 
{ 
public void paintComponent(Graphics g) 
{ 
// Don't forget to do this! 
super.paintComponent(g); 
// Display the text in the panel 
g.drawString("Hello from a Java Swing application!", 50, 80); 
} 
} 
class TextDisplayFrame extends JFrame 
{ 
public TextDisplayFrame() 
{ 
setTitle("Text Display Frame"); 
setSize(300, 200); 
setDefaultCloseOperation(EXIT_ON_CLOSE); 
// Find the JFrame's content pane 
Container contentPane = getContentPane(); 
// Add the TextDisplayPanel to the content pane 
contentPane.add( new TextDisplayPanel() ); 
} 
} 
public class TextDisplay 
{ 
public static void main(String[] args) 
{ 
TextDisplayFrame frame = new TextDisplayFrame(); 
frame.setVisible(true); 
} 
} 