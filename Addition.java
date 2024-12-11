import javax.swing.*;
import java.awt.event.*;

public class Addition
{	
	JFrame F;
	JPanel P;
	JLabel lblFirst,lblSecond,lblAdd;
	JTextField txtFirst,txtSecond,txtAdd;
	JButton btnAdd,btnCancel;
	
	public Addition()
	{
		F = new JFrame();
		P  = new JPanel();
		lblFirst = new JLabel("Enter First Number : ");
		lblSecond = new JLabel("Enter Second Number : ");
		lblAdd = new JLabel("Addition is : ");
		txtFirst = new JTextField();
		txtSecond = new JTextField();
		txtAdd = new JTextField();
		btnAdd = new JButton("ADDITION");
		btnCancel = new JButton("CANCEL");

		
		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("Calculator");
		F.setVisible(true);
		
		P.setLayout(null);
		F.add(P);
		
		lblFirst.setBounds(20,20,150,30);
		P.add(lblFirst);
		txtFirst.setBounds(20,60,150,30);
		P.add(txtFirst);

		lblSecond.setBounds(20,100,150,30);
		P.add(lblSecond);
		txtSecond.setBounds(20,140,150,30);
		P.add(txtSecond);

		lblAdd.setBounds(20,180,150,30);
		P.add(lblAdd);
		txtAdd.setBounds(20,220,150,30);
		P.add(txtAdd);

		btnAdd.setBounds(20,300,150,30);
		P.add(btnAdd);

		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int a = Integer.parseInt(txtFirst.getText().toString());
				int b = Integer.parseInt(txtSecond.getText().toString());
				int c = a + b;
				
				txtAdd.setText(String.valueOf(c));

				txtFirst.setText("");
				txtSecond.setText("");

				txtFirst.requestFocus();
			}
		});
		
		btnCancel.setBounds(210,300,150,30);
		P.add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
				//F.hide();
			}
		});

	}
	public static void main(String[] args)
	{
		new Addition();
	}
}