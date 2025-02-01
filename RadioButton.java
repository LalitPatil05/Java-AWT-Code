import javax.swing.*;
import java.awt.event.*;

public class RadioButton
{

	JFrame F;
	JPanel P;
	JLabel lblMessage;
	JRadioButton rbtnMale,rbtnFemale,rbtnOthers;
	ButtonGroup bg;	
	JLabel lblSelection;

	public RadioButton()
	{
		F = new JFrame("RadioButton");
		P = new JPanel();
		lblMessage = new JLabel("Select the Gender : ");
		rbtnMale = new JRadioButton("Male");
		rbtnFemale = new JRadioButton("Female");
		rbtnOthers = new JRadioButton("Others");
		bg = new ButtonGroup();
		lblSelection = new JLabel("Selected Gender is : ");
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setVisible(true);

		lblMessage.setBounds(20,20,150,30);
		P.add(lblMessage);	

		rbtnMale.setBounds(20,60,100,30);
		P.add(rbtnMale);
		rbtnFemale.setBounds(130,60,100,30);
		P.add(rbtnFemale);
		rbtnOthers.setBounds(240,60,100,30);
		P.add(rbtnOthers);
		bg.add(rbtnMale);
		bg.add(rbtnFemale);
		bg.add(rbtnOthers);

		lblSelection.setBounds(20,100,180,30);
		P.add(lblSelection);


		rbtnMale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				lblSelection.setText("Selected Gender is : Male");
			}
		});

		rbtnFemale.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				lblSelection.setText("Selected Gender is : Female");
			}
		});

		rbtnOthers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				lblSelection.setText("Selected Gender is : Others");
			}
		});
	
		
		P.setLayout(null);
		F.add(P);


		
	}	

	public static void main(String args[])
	{
		new RadioButton();
	}
}