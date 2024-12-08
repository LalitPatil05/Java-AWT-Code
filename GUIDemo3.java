import javax.swing.*;

public class GUIDemo3
{	
	JFrame F;
	JPanel P;
	JLabel lblItem;
	JLabel lblList;
	JComboBox cmbItem;

	public GUIDemo3()
	{
		F = new JFrame();
		P = new JPanel();
		lblItem = new JLabel("Select the Items : ");
		cmbItem = new JComboBox();
		

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("GUI Demo");
		F.setVisible(true);

		P.setLayout(null);
		F.add(P);


		lblItem.setBounds(20,20,150,30);
		P.add(lblItem);

		cmbItem.setBounds(180,20,100,30);
		P.add(cmbItem);
		cmbItem.addItem("Pen");
		cmbItem.addItem("Pencil");
		cmbItem.addItem("Book");
		cmbItem.addItem("NoteBook");

	
	}
	public static void main(String args[])
	{
		new GUIDemo3();
	}
}