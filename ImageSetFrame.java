import java.awt.*;   
import javax.swing.JFrame;   
   
public class ImageSetFrame extends Canvas{   
       
    public void paint(Graphics g) {   
   
        Toolkit t=Toolkit.getDefaultToolkit();   
        Image i=t.getImage("TY_Result.jpg");   
        g.drawImage(i, 50,50,this);   
           
    }   
        public static void main(String[] args) {   
        ImageSetFrame m=new ImageSetFrame();   
        JFrame f=new JFrame();   
        f.add(m);   
        f.setSize(800,800);   
        f.setVisible(true);   
    }   
   
}  