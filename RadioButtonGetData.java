import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtonGetData
{
	
	JFrame F;
	JPanel P;
	JRadioButton rbMale, rbFemale, rbOthers;
	JLabel lblMessage;
	
	public RadioButtonGetData()
	{
	
		F = new JFrame();
		P = new JPanel();
		

		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");
		lblMessage = new JLabel("Select the Gender : ");
		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("RadioButton");
		F.setVisible(true);
		F.add(P);
		P.setLayout(null);

		lblMessage.setBounds(50,50,150,30);
		P.add(lblMessage);

		rbMale.setBounds(50,100,100,30);
		P.add(rbMale);
		
		rbFemale.setBounds(160,100,100,30);
		P.add(rbFemale);

		rbOthers.setBounds(270,100,100,30);
		P.add(rbOthers);

		rbMale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String result = rbMale.getText();
				System.out.println(result);
			}
		});

		rbFemale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String result = rbFemale.getText();
				System.out.println(result);
			}
		});

		rbOthers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String result = rbOthers.getText();
				System.out.println(result);
			}
		});
		
	}	

	public static void main(String args[])
	{
		new RadioButtonGetData();
	}
}