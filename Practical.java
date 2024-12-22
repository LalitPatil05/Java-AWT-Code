import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Practical
{
	JFrame F;
	JPanel P;
	JTextField txtMessage,txtMessage2;
	JLabel lblMessage,lblPosition;

	public Practical()
	{
		F = new JFrame();
		P = new JPanel();
		txtMessage = new JTextField();
		lblMessage = new JLabel("Status : ");
		txtMessage2 = new JTextField();
		lblPosition = new JLabel("Position : ");

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("KeyListener");
		F.setVisible(true);
		P.setLayout(null);
		F.add(P);
		
		txtMessage.setBounds(50,50,150,30);
		P.add(txtMessage);

		txtMessage.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent ke1)
			{
				lblMessage.setText("Status : Typing....");
			}
			public void keyReleased(KeyEvent ke2)
			{
				lblMessage.setText("Status : Online");
			}
			public void keyTyped(KeyEvent ke3)
			{
				lblMessage.setText("Status : Typing....");
			}
		});		


		txtMessage.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe1)
			{
				txtMessage.setBackground(Color.LIGHT_GRAY);
			}
			public void focusLost(FocusEvent fe2)
			{
				txtMessage.setBackground(Color.WHITE);
			}
		});

		lblMessage.setBounds(50,90,150,30);
		P.add(lblMessage);
		lblMessage.setOpaque(true);

		lblMessage.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me1)
			{
				lblMessage.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent me2)
			{
				lblMessage.setBackground(Color.YELLOW);
			}
			public void mousePressed(MouseEvent me3)
			{
				lblMessage.setBackground(Color.GREEN);
			}
			public void mouseReleased(MouseEvent me4)
			{
				lblMessage.setBackground(Color.YELLOW);
			}
			public void mouseClicked(MouseEvent me5)
			{
				lblMessage.setBackground(Color.YELLOW);
			}
			
		});

		txtMessage2.setBounds(50,130,150,30);
		P.add(txtMessage2);

		txtMessage2.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe1)
			{
				txtMessage2.setBackground(Color.LIGHT_GRAY);
			}
			public void focusLost(FocusEvent fe2)
			{
				txtMessage2.setBackground(Color.WHITE);
			}
		});

		lblPosition.setBounds(50,400,150,30);
		P.add(lblPosition);

		F.addMouseListener(new MouseListener()
		{
			public void mouseReleased(MouseEvent me1)
			{
		
			}
			public void mouseClicked(MouseEvent me2)
			{

			}
			public void mouseExited(MouseEvent me3)
			{
		
			}
			public void mousePressed(MouseEvent me4)
			{
				lblPosition.setText("Position : "+me4.getX()+","+me4.getY());
			}
			public void mouseEntered(MouseEvent me5)
			{

			}

		});		


	}
	public static void main(String args[])
	{
		new Practical();
	}
}
