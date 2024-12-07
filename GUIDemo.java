import java.awt.*;

public class GUIDemo
{	
	Frame F;
	Panel P;
	Label lblUsername, lblPassword;
	TextField txtUsername, txtPassword;
	Button btnLogin, btnCancel;
	
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

		btnCancel.setBounds(130,250,70,30);
		P.add(btnCancel);

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