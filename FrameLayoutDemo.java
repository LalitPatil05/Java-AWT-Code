import java.awt.*;

public class FrameLayoutDemo
{
	Frame F;
	Panel P;
	Button btnEast, btnWest, btnSouth, btnNorth, btnCenter;
	
	public FrameLayoutDemo()
	{
		F = new Frame();
		P = new Panel();
		btnEast = new Button("East");
		btnWest = new Button("West");
		btnSouth = new Button("South");
		btnNorth = new Button("North");
		btnCenter = new Button("Center");

		P.setLayout(new BorderLayout()); // Set the Panel Layout into the Frame

		P.add(btnEast,BorderLayout.EAST); //Add the Button into the East Side on Panel
		P.add(btnWest,BorderLayout.WEST); // Add the Button into the West Side on Panel
		P.add(btnSouth,BorderLayout.SOUTH); // Add the Button into the South Side on Panel
		P.add(btnNorth,BorderLayout.NORTH); // Add the Button into the North Side on Panel
		P.add(btnCenter,BorderLayout.CENTER); // Add the Button into the Center Side on Panel		

		F.add(P);
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("LayoutDemo");
		F.setVisible(true);
	}
	public static void main(String args[])
	{
		new FrameLayoutDemo();
	}
}