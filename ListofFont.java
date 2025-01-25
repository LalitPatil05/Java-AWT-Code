import java.awt.*;
import javax.swing.*;

class ListofFonts extends GraphicsEnvironment
{
	public static void main(String atgs[])
	{
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyName();
		for(int i = 0; i<=10 ; i++);
		{
			System.out.println(fontNames);
		}
	}
}