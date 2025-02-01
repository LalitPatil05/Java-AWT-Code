import java.awt.*;
import javax.swing.*;

public class MultiPanels
{
	
	JFrame F;
	JPanel P,P1,P2,P3,P4;
	JButton btn1,btn2,btn3,btn4;

	public MultiPanels()
	{
		F = new JFrame();
		
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();
		P4 = new JPanel();
		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("MultiPanel");
		F.setVisible(true);
		F.setLayout(null);
		
		P1.setBackground(Color.RED);
		P1.setBounds(50,10,300,100);

		P2.setBackground(Color.GREEN);
		P2.setBounds(50,120,300,100);

		P3.setBackground(Color.BLUE);
		P3.setBounds(50,230,300,100);
		
		F.add(P1);
		F.add(P2);
		F.add(P3);

		

	}
	
	public static void main(String args[])
	{
		new MultiPanels();
	}
}