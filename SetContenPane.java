import javax.swing.*;
import java.awt.*;

public class SetContenPane extemds JFrame
{
	public SetContenPane()
	{	
		super("SetContentPane");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		Container content = new getContentPane();
		content.setBackground(Color.WHITE);
		
		JTextField txtfld = new JTextField("DefaultText");
		content.add(txtfld);

		setContentPane(content);
		
		
	}
	public static void main(String args[])
	{
		SetContenPane obj = new SetContentPane();
	}
}