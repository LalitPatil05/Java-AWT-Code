import javax.swing.*;

public class GUIDemo2
{	
	JFrame F;
	JPanel P;
	JLabel lblGender;
	JLabel lblDocs;
	JLabel lblItem;
	JRadioButton rbMale, rbFemale, rbOthers;
	ButtonGroup bg;
	JCheckBox chkAadhar, chkPan, chkLC, chkTC;
	JComboBox cmbItem;

	public GUIDemo2()
	{
		F = new JFrame();
		P = new JPanel();
		bg = new ButtonGroup();

		lblGender = new JLabel("Select the Gender : ");
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");
		
		lblDocs = new JLabel("Select the Documents : ");
		chkAadhar = new JCheckBox("Aadhar");
		chkPan = new JCheckBox("Pan");
		chkLC = new JCheckBox("L.C");
		chkTC = new JCheckBox("T.C");

		lblItem = new JLabel("Select the Items : ");
		cmbItem = new JComboBox();

		F.setSize(500,500);
		F.setLocation(100,100);
		F.setTitle("GUI Demo");
		F.setVisible(true);

		P.setLayout(null);
		F.add(P);


		lblGender.setBounds(20,20,150,30);
		P.add(lblGender);

		rbMale.setBounds(20,60,60,30);
		P.add(rbMale);
		rbFemale.setBounds(90,60,80,30);
		P.add(rbFemale);
		rbOthers.setBounds(180,60,100,30);
		P.add(rbOthers);
		
		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		lblDocs.setBounds(20,220,150,30);
		P.add(lblDocs);

		chkAadhar.setBounds(20,250,100,30);
		P.add(chkAadhar);
		chkPan.setBounds(130,250,100,30);
		P.add(chkPan);
		chkLC.setBounds(20,290,100,30);
		P.add(chkLC);
		chkTC.setBounds(130,290,100,30);
		P.add(chkTC);
		
		lblItem.setBounds(20,330,150,30);
		P.add(lblItem);

		cmbItem.setBounds(180,330,100,30);
		P.add(cmbItem);
		cmbItem.addItem("Pen");
		cmbItem.addItem("Pencil");
		cmbItem.addItem("Book");
		cmbItem.addItem("NoteBook");
		
	}

	public static void main(String args[])
	{
		new GUIDemo2();	
	}
}