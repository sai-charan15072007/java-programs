import java.awt.*;
import java.awt.event.*;

public class MouseWheelExample extends Frame
        implements MouseWheelListener {

    Label l;

    MouseWheelExample() {

        Frame f = new Frame("Mouse Wheel Event");

        l = new Label("Move Mouse Wheel");
        l.setBounds(100, 100, 180, 30);

        f.add(l);

        f.addMouseWheelListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseWheelMoved(MouseWheelEvent e) {
        l.setText("Mouse Wheel Moved");
    }

    public static void main(String[] args) {
        new MouseWheelExample();
    }
}
