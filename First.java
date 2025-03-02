import java.applet.*;
import java.awt.*;

public class First extends Applet
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
		g.drawString("HelloWorld",50,50);
		g.drawRect(100,100,200,200);
	}
}