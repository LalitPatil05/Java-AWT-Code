import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonNullLayout {

    Frame F;
    Panel P;
    Button btnOne, btnTwo, btnThree, btnFour, btnCancel;
    Label lbldemo;
    Label lblCancel;
    Label lbltext;

    public ButtonNullLayout()
    {
        F = new Frame("Button");
        P = new Panel();
        lbldemo = new Label("Click the Button : ");
        lbltext = new Label("Clicked Button is : ");
        lblCancel = new Label("Cancel");


        btnOne = new Button("One");
        btnTwo = new Button("Two");
        btnThree = new Button("Three");
        btnFour = new Button("Four");
        btnCancel = new Button("Cancel");


        F.setSize(500,500);
        F.setLocation(100,100);
        F.setVisible(true);

        P.setLayout(null);

        btnOne.setBounds(20,20,100,30);
        P.add(btnOne);
        btnTwo.setBounds(20,60,100,30);
        P.add(btnTwo);
        btnThree.setBounds(20,100,100,30);
        P.add(btnThree);
        btnFour.setBounds(20,140,100,30);
        P.add(btnFour);
        lbldemo.setBounds(20,180,100,30);
        P.add(lbldemo);

        lbltext.setBounds(20,210,150,30);
        P.add(lbltext);

        btnCancel.setBounds(20,240,100,30);
        P.add(btnCancel);
        

        btnOne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                lbltext.setText("Clicked Button is : One");
            }
        });

        
        btnTwo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                lbltext.setText("Clicked Button is : Two");
            }
        });

        
        btnThree.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                lbltext.setText("Clicked Button is : Three");
            }
        });

        
        btnFour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                lbltext.setText("Clicked Button is : Four");
            }
        });

        btnCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                System.exit(0);
            }
        });

        F.add(P);


    }

    public static void main(String[] args) {

        new ButtonNullLayout();
        
    }
}
