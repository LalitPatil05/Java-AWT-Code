import javax.swing.*;
import java.awt.event.*;

public class WindowEventDemo
{
	JFrame F;
	
	public WindowEventDemo()
	{
		F = new JFrame();

		F.addWindowListener(new WindowListener()
		{
			public void windowActivated(WindowEvent we1)
			{
				System.out.println("Window Activated");
			}
			public void windowDeactivated(WindowEvent we2)
			{
				System.out.println("Window DeActivated");
			}
			public void windowOpened(WindowEvent we3)
			{
				System.out.println("Window Opened");
			}
			public void windowClosing(WindowEvent we4)
			{
				System.out.println("Window Closing");
			}
			public void windowClosed(WindowEvent we5)
			{
				System.out.println("Window Closed");
			}
			public void windowIconified(WindowEvent we6)
			{
				System.out.println("Window Iconified");
			}
			public void windowDeiconified(WindowEvent we7)
			{
				System.out.println("Window Deiconified");
			}			

		});
		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("WindowEvent");
		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	
	public static void main(String args[])
	{
		new WindowEventDemo();
	}
}