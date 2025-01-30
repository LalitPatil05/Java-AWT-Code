import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class KeyListenerExample
{
	JFrame F;
	JPanel P;
	JLabel lblMessage;
	JTextField txtMessage;
	
	public KeyListenerExample()
	{
		F = new JFrame();
		P = new JPanel();

		lblMessage = new JLabel("Status : ");	
		txtMessage = new JTextField();

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("KeyListener");
		F.setVisible(true);
		F.add(P);
		P.setLayout(null);

		lblMessage.setBounds(100,100,300,30);
		P.add(lblMessage);

		txtMessage.setBounds(100,250,200,50);
		P.add(txtMessage);
	
		txtMessage.addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent ke1)
			{
				lblMessage.setText("Status : Typing...");
			}

			public void keyPressed(KeyEvent ke2)
			{
				lblMessage.setText("Status : Online");
			}

			public void keyReleased(KeyEvent ke3)
			{
				lblMessage.setText("Status : Online");
				
			}
		});

	}	

	public static void main(String args[])
	{
		new KeyListenerExample();
	}
}