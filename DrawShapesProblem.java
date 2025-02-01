import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class DrawShapesProblem extends JPanel
{
	boolean drawCircleShape = false;
	boolean drawRectangleShape = false;
	boolean drawLineShape = false;
	
	public DrawShapesProblem()
	{
		JFrame F = new JFrame();
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("Problem");
		F.setVisible(true);
		F.add(this);
		
	F.setFocusable(true);
	F.addKeyListener(new KeyListener()
	{
		public void keyTyped(KeyEvent ke1)
		{

		}

		public void keyPressed(KeyEvent ke2)
		{
			char key = ke2.getKeyChar();

			if(key == 'c' || key == 'C')
			{
				drawCircleShape = true;
				drawRectangleShape = false;
				drawLineShape = false;
			}

			else if(key == 'l' || key == 'L')
			{
				drawCircleShape = false;
				drawLineShape = true;
				drawRectangleShape = false;
			}

			else if(key == 'r' || key == 'R')
			{
				drawCircleShape = false;
				drawLineShape = false;
				drawRectangleShape = true;
			}
				repaint();
			}

		public void keyReleased(KeyEvent ke3)
		{

		}

	});

	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		if(drawCircleShape)
		{
			g.drawOval(100,100,200,200);
		}
				
		if(drawRectangleShape)
		{
			g.drawRect(100,100,250,250);
		}

		if(drawLineShape)
		{
			g.drawLine(100,100,200,200);
		}

	}
	
	public static void main(String args[])
	{
		new DrawShapesProblem();
	}
}