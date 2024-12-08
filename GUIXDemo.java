import javax.swing.*;

public class GUIXDemo
{	
	JFrame F;
	JPanel P;
	JLabel lblUsername, lblPassword;
	JTextField txtUsername, txtPassword;
	JButton btnLogin, btnCancel;
	
	public GUIXDemo()
	{
		F = new JFrame();
		P = new JPanel();
		lblUsername = new JLabel();
		lblPassword = new JLabel();
		txtUsername = new JTextField();
		txtPassword = new JTextField();
		btnLogin = new JButton("LOGIN");
		btnCancel = new JButton("CANCEL");

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
		new GUIXDemo();
	}
}