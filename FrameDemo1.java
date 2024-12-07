import java.awt.*;

public class FrameDemo1 extends Component
{
	public static void main(String args[])
	{
		Frame F = new Frame();
		F.setSize(500,500);
		F.setLocation(200,200);
		F.setTitle("MyFrame");
		F.add(new FrameDemo1());
		F.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(100,100,300,300);
		g.setColor(Color.YELLOW);
		g.fillOval(100,100,300,300);
		g.setColor(Color.BLACK);
		g.drawLine(100,100,400,400);
		g.drawLine(400,100,100,400);
		
	}
}