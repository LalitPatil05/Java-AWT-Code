import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DialogBoxDemo
{
	JFrame F;
	JPanel P;
	JButton btnClick;
		
	public DialogBoxDemo()
	{
		F = new JFrame();
		P = new JPanel();
		btnClick = new JButton("Click me!");

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("Dialog Box");
		F.setVisible(true);

		P.setLayout(null);
		F.add(P);

		btnClick.setBounds(100,100,100,30);
		P.add(btnClick);

		btnClick.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(F,"Hello Java");
			}
		});

		JOptionPane.showMessageDialog(F, "Sample Text");
		
	}
	public static void main(String args[])
	{
		new DialogBoxDemo();
	}
}