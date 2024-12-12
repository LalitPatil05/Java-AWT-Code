import javax.swing.*;
import java.awt.event.*;

public class WindowEventAdapter extends WindowAdapter
{	
	JFrame F;
	
	public WindowEventAdapter()
	{
		F = new JFrame("WindowEvent");
		
		F.addWindowListener(this);		

		F.setSize(300,300);
		F.setLocation(100,100);
		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void windowActivated(WindowEvent we1)
	{
		System.out.println("ONLINE");
	}
	public void windowIconified(WindowEvent we2)
	{
		System.out.println("OFFLINE");
	}
	
	public static void main(String args[])
	{
		new WindowEventAdapter();
	}
}