import java.awt.*;
import javax.swing.*;

public class ButtonSetLayout
{
	public static void main(String args[])
	{
		Frame F = new Frame();
		Panel P = new Panel();
		F.setSize(300,300);
		F.setLocation(100,100);
		F.setTitle("Button");
		F.setVisible(true);

		Button btnEast, btnWest, btnSouth, btnNorth, btnCenter;
		btnEast = new Button("East");
		btnWest = new Button("West");
		btnSouth = new Button("South");
		btnNorth = new Button("North");
		btnCenter = new Button("Center");

		F.add(P);
		P.setLayout(new BorderLayout());

		P.add(btnEast, BorderLayout.EAST);
		P.add(btnWest, BorderLayout.WEST);
		P.add(btnSouth, BorderLayout.SOUTH);
		P.add(btnNorth, BorderLayout.NORTH);
		P.add(btnCenter, BorderLayout.CENTER);

	}
}