import javax.swing.*;
import java.awt.*;


public class Paint extends Component
{
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRect(20,20,100,100);
		g.drawLine(120,120,170,170);

		g.fillRect(200,200,250,250);
		g.setColor(Color.BLACK);
		
		g.drawOval(190,190,360,240);	
	}
	

	public static void main(String args[])
	{
		JFrame F = new JFrame("Component");
		F.setSize(500,500);
		F.setVisible(true);
		F.add(new Paint());
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 