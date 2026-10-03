import java.awt.*;
import java.awt.event.*;

public class ComponentExample extends Frame
        implements ComponentListener {

    Label l;

    ComponentExample() {

        Frame f = new Frame("Component Event");

        l = new Label("Resize Window");
        l.setBounds(100, 100, 150, 30);

        f.add(l);

        f.addComponentListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void componentResized(ComponentEvent e) {
        l.setText("Window Resized");
    }

    public void componentMoved(ComponentEvent e) {
        l.setText("Window Moved");
    }

    public void componentShown(ComponentEvent e) {
    }

    public void componentHidden(ComponentEvent e) {
    }

    public static void main(String[] args) {
        new ComponentExample();
    }
}
