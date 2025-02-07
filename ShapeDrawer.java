import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ShapeDrawer extends JPanel implements KeyListener {

    private boolean drawCircle = false;
    private boolean drawLine = false;
    private boolean drawRectangle = false;

    public ShapeDrawer() {
        addKeyListener(this);
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (drawCircle) {
            g.drawOval(100, 100, 200, 200);
        }

        if (drawLine) {
            g.drawLine(150, 150, 250, 250);
        }

        if (drawRectangle) {
            g.drawRect(100, 100, 200, 200);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();

        if (key == 'c' || key == 'C') {
            drawCircle = true;
            drawLine = false;
            drawRectangle = false;
        } else if (key == 'l' || key == 'L') {
            drawLine = true;
            drawCircle = false;
            drawRectangle = false;
        } else if (key == 'r' || key == 'R') {
            drawRectangle = true;
            drawCircle = false;
            drawLine = false;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapeDrawer());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}