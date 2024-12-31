import java.awt.*;
import javax.swing.JFrame;

public class MyCanvas extends Canvas
{
	public void paint(Graphics g)
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("image.jpg");
		g.drawImage(i, 120,100,this);
	}
	
	public static void main(String args[])
	{
		MyCanvas mc = new MyCanvas();
		JFrame F = new JFrame();
		F.add(mc);

		F.setSize(500,500);
		F.setVisible(true);
		
	}
}