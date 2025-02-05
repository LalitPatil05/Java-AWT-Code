import javax.swing.*;
import java.awt.*;

public class AddComponent extends Component
{
    public static void main(String[] args) {
        JFrame F = new JFrame();
        F.setSize(500,500);
        F.setLocation(100,100);
        F.setTitle("Component");
        F.setVisible(true);
        F.add(new AddComponent());
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g)
    {

        g.drawLine(100,100,200,200);
        g.drawRect(250, 250, 50, 30);
        g.drawOval(300, 300, 100, 100);

        g.setColor(Color.RED);
        g.fillRect(400,400,50,50);
        g.setColor(Color.YELLOW);
        g.fillOval(400, 400, 50, 50);

        g.setColor(Color.GREEN);
        g.drawLine(400,400,450,450);
        g.drawLine(450,400,400,450);
        
    }
}