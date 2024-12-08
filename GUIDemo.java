import java.awt.*;
import java.awt.event.*;

public class GUIDemo
{	
	Frame F;
	Panel P;
	Label lblUsername, lblPassword;
	TextField txtUsername, txtPassword;
	Button btnLogin, btnCancel;
	Label lblMessage;
	
	public GUIDemo()
	{
		F = new Frame();
		P = new Panel();
		lblUsername = new Label();
		lblPassword = new Label();
		txtUsername = new TextField();
		txtPassword = new TextField();
		btnLogin = new Button("LOGIN");
		btnCancel = new Button("CANCEL");
		lblMessage = new Label("Enter the Details");

		P.setLayout(null);

		lblUsername.setText("Enter the User Name : ");
		lblUsername.setBounds(50,50,150,30);
		P.add(lblUsername);
		txtUsername.setBounds(50,90,150,30);
		P.add(txtUsername);

		lblPassword.setText("Enter the Password : ");
		lblPassword.setBounds(50,140,150,30);
		P.add(lblPassword);
		txtPassword.setBounds(50,180,150,30);
		P.add(txtPassword);


		btnLogin.setBounds(50,250,70,30);
		P.add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{	
				lblMessage.setText("Login Successfully..!!");

				txtUsername.setText("");
				txtPassword.setText("");

				F.requestFocus();
			}
		});

		btnCancel.setBounds(130,250,70,30);
		P.add(btnCancel);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});

		lblMessage.setBounds(80,320,150,30);
		P.add(lblMessage);

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("GUIDemo");
		F.setVisible(true);

		F.add(P);

	}
	public static void main(String args[])
	{
		new GUIDemo();
	}
}