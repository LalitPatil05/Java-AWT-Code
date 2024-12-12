import javax.swing.*;
import java.awt.event.*;

public class ActionEventHandeling
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
	JLabel lblList;
	JList lstItem;
	String item[] = {"Pen","Pencil","Book","NoteBook"};
	JLabel lblMessage;

	public ActionEventHandeling()
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
	
		lblList = new JLabel("Select into List : ");
		lstItem = new JList(item);

		lblMessage = new JLabel("Label Message : ");

		F.setSize(500,600);
		F.setLocation(100,100);
		F.setTitle("GUI Demo");
		F.setVisible(true);

		lblGender.setBounds(20,20,150,30);
		P.add(lblGender);

		rbMale.setBounds(20,60,60,30);
		P.add(rbMale);
		rbMale.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				lblMessage.setText("You are Selected : Male");
			}
		});		

		rbFemale.setBounds(90,60,80,30);
		P.add(rbFemale);
		rbFemale.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				lblMessage.setText("You are Selected : FeMale");
			}
		});

		rbOthers.setBounds(180,60,100,30);
		P.add(rbOthers);
		rbOthers.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				lblMessage.setText("You are Selected : Others");
			}
		});

		
		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		lblDocs.setBounds(20,220,150,30);
		P.add(lblDocs);

		chkAadhar.setBounds(20,250,100,30);
		P.add(chkAadhar);
	
		chkAadhar.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkAadhar.isSelected() == true)
				{
					System.out.println("You are Selected : Aadhar");
				}
			}
		});
		
		chkPan.setBounds(130,250,100,30);
		P.add(chkPan);

		chkPan.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkPan.isSelected() == true)
				{
					System.out.println("You are Selected : Pan");
				}
			}
		});

		chkLC.setBounds(20,290,100,30);
		P.add(chkLC);

		chkLC.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkLC.isSelected() == true)
				{
					System.out.println("You are Selected :LC");
				}
			}
		});

		chkTC.setBounds(130,290,100,30);
		P.add(chkTC);
		
		chkTC.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkTC.isSelected() == true)
				{
					System.out.println("You are Selected : TC");
				}
			}
		});


		lblItem.setBounds(20,330,150,30);
		P.add(lblItem);

		cmbItem.setBounds(180,330,100,30);
		P.add(cmbItem);
		cmbItem.addItem("Pen");
		cmbItem.addItem("Pencil");
		cmbItem.addItem("Book");
		cmbItem.addItem("NoteBook");
		
		cmbItem.addItemListener(new ItemListener()
		{	public void itemStateChanged(ItemEvent ie)
			{
				System.out.println("Selected Item is : "+cmbItem.getSelectedItem().toString() + "\t Index :"+cmbItem.getSelectedIndex());
			}
		});

		lblList.setBounds(20,380,150,30);
		P.add(lblList);
		lstItem.setBounds(180,380,150,100);
		P.add(lstItem);

		lstItem.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				System.out.println("Selected Item is : "+lstItem.getSelectedItem().toString());
			}
		});


		lblMessage.setBounds(20,100,150,30);
		P.add(lblMessage);
	
		P.setLayout(null);
		F.add(P);
		
	}

	public static void main(String args[])
	{
		new ActionEventHandeling();	
	}
}