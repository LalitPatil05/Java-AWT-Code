import javax.swing.*;
import java.awt.*;

public class SetFlowLayout
{
	public SetFlowLayout()
	{	
		JFrame F  = new JFrame("SetFlowLayout");
		F.setSize(300,300);
		FlowLayout flowlayout = new FlowLayout();
		F.setLayout(flowlayout);
		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		SetFlowLayout obj = new SetFlowLayout();
	}
}