import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample
{
	JFrame F;
	JPanel P;
	JLabel lblMessage;

	public MouseListenerExample()
	{
		F = new JFrame();
		P = new JPanel();
		lblMessage = new JLabel("MouseListener Action : ");
		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("MouseListener");
		F.setVisible(true);
		F.add(P);
		P.setLayout(null);

		lblMessage.setBounds(50,200,200,30);
		P.add(lblMessage);
		
		F.addMouseListener(new MouseListener()
		{	
			public void mouseClicked(MouseEvent e1)
			{
				lblMessage.setText("MouseListener Action : Clicked.");
			}
			
			public void mouseExited(MouseEvent e2)
			{
				lblMessage.setText("MouseListener Action : Exited.");
			}

			public void mouseEntered(MouseEvent e3)
			{
				lblMessage.setText("MouseListener Action : Entered.");
			}
	
			public void mousePressed(MouseEvent e4)
			{
				lblMessage.setText("MouseListener Action : Pressed.");	
			}

			public void mouseReleased(MouseEvent e5)
			{
				lblMessage.setText("MouseListener Action : Released.");
			}
		
		});

		
	}

	public static void main(String args[])
	{
		new MouseListenerExample();
	}
}