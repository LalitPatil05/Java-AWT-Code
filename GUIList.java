import javax.swing.*;

public class GUIList {

    JFrame F;
    JPanel P;
    JList lstItem;
    JLabel lblList;
    String[] Item = {"Pen", "Pencil", "Book", "NoteBook"};

    public GUIList()
    {
        F = new JFrame();
        P = new JPanel();
        lstItem = new JList(Item);
        lblList = new JLabel("Select the Item : ");

        F.setSize(500,500);
        F.setLocation(100,100);
        F.setTitle("GUI Demo");
        F.setVisible(true);

        P.setLayout(null);
        F.add(P);

        lblList.setBounds(20,20,100,30);
        P.add(lblList);

        lstItem.setBounds(130,20,100,150);
        P.add(lstItem);


    }
    public static void main(String[] args) {
        new GUIList();
    }
    
}
