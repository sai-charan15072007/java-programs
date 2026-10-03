import java.awt.*;
import java.awt.event.*;

public class ContainerExample extends Frame
        implements ContainerListener {

    Label l;

    ContainerExample() {

        Frame f = new Frame("Container Event");

        l = new Label("Component Added");
        l.setBounds(100, 100, 150, 30);

        f.add(l);

        f.addContainerListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void componentAdded(ContainerEvent e) {
        System.out.println("Component Added");
    }

    public void componentRemoved(ContainerEvent e) {
        System.out.println("Component Removed");
    }

    public static void main(String[] args) {
        new ContainerExample();
    }
}
