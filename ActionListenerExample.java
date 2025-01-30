import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionListenerExample
{
	
	JFrame F;
	JPanel P;
	JButton btnClick, btnClear;
	JLabel lblMessage;

	public ActionListenerExample()
	{
		F = new JFrame();
		P = new JPanel();
		lblMessage = new JLabel("");
		btnClick = new JButton("Click");
		btnClear = new JButton("Clear");

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("ActionListener");
		F.setVisible(true);
	
		P.setLayout(null);
		F.add(P);
	
		lblMessage.setBounds(50,100,400,50);
		P.add(lblMessage);

		btnClick.setBounds(100,300,70,30);
		P.add(btnClick);

		btnClear.setBounds(300,300,70,30);
		P.add(btnClear);
		
		btnClick.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent ae)
			{
				lblMessage.setText("Hello Java Programming Demonstration of Action Listener.");
			}
			
		});
		
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				lblMessage.setText("");
			}
		});		

	}
	
	public static void main(String args[])
	{
		new ActionListenerExample();
	}
}