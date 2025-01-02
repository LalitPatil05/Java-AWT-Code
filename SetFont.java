import java.awt.*;
import javax.swing.*;

public class SetFont extends JFrame
{
	public SetFont()
	{
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = getContentPane();
		content.setBackground(Color.RED);

		mypanel p1 = new mypanel();
		p1.setBackground(Color.WHITE);

		content.add(p1);

		setContentPane(content);
		}
	
		class mypanel extends JPanel 
		{
			public void paintComponent(Graphics g)
			{
				Font sanbold = new Font("SansSerif", Font.BOLD, 20);
				g.setFont(sanbold);
				g.drawString("North Maharashatra University",80,110);
				Font tnr = new Font("Times New Roman", Font.BOLD, 30);
				g.setFont(tnr);
				g.drawString("Science Senior Collage Shahada",20,150);
			}
		}
	

	public static void main(String args[])
	{
		SetFont sf = new SetFont();
	}
}