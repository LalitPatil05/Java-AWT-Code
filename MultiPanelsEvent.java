import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiPanelsEvent
{
	
	JFrame F;
	JPanel P1,P2,P3;
	JButton btn1,btn2,btn3,btnClear;

	public MultiPanelsEvent()
	{
		F = new JFrame();
		
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();

		btn1 = new JButton("Panel1");
		btn2 = new JButton("Panel2");
		btn3 = new JButton("Panel3");
		btnClear = new JButton("Clear");
		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("MultiPanel");
		F.setVisible(true);
		F.setLayout(null);
		

		btn1.setBounds(20,400,100,30);
		F.add(btn1);

		btn2.setBounds(130,400,100,30);
		F.add(btn2);

		btn3.setBounds(240,400,100,30);
		F.add(btn3);

		btnClear.setBounds(350,400,100,30);
		F.add(btnClear);

		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				F.add(P1);
				P1.setBackground(Color.RED);
				P1.setBounds(50,10,300,100);
				
			}
		});

		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				F.add(P2);
				P2.setBackground(Color.GREEN);
				P2.setBounds(50,120,300,100);
			}
		});

		
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				F.add(P3);
				P3.setBackground(Color.BLUE);
				P3.setBounds(50,230,300,100);
				
			}
		});

		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				P1.setVisible(false);
				P2.setVisible(false);
				P3.setVisible(false);
			}
		});

		
		F.add(P1);
		F.add(P2);
		F.add(P3);

		

	}
	
	public static void main(String args[])
	{
		new MultiPanelsEvent();
	}
}