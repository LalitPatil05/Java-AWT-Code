import java.awt.*;
import javax.swing.*;

public class DrawShape extends Component
{
	
	public static void main(String args[])
	{
		JFrame F = new JFrame();
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("Shape");
		F.add(new  DrawShape());
		F.setVisible(true);	
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(20,20,100,100);
		g.drawLine(20,20,50,50);
	}
}
