import java.applet.*;
import java.awt.*;

public class Second extends Applet
{
	public void init()
	{
		System.out.println("init Called");
	}
	public void start()
	{
		System.out.println("start Called");
	}
	public void stop()
	{
		System.out.println("stop Called");
	}
	public void destroy()
	{
		System.out.println("destroy Called");
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello Applet", 50,50);
	}
}