import java.awt.*;
import java.awt.event.*;

public class MouseExample extends Frame
        implements MouseListener {

    Label l;

    MouseExample() {

        Frame f = new Frame("Mouse Event");

        l = new Label("Click Mouse");
        l.setBounds(100, 100, 150, 30);

        f.add(l);

        f.addMouseListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseExample();
    }
}
