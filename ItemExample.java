import java.awt.*;
import java.awt.event.*;

public class ItemExample extends Frame
        implements ItemListener {

    Checkbox c;
    Label l;

    ItemExample() {

        Frame f = new Frame("Item Event");

        c = new Checkbox("Java");
        c.setBounds(100, 100, 100, 30);

        l = new Label("Select Java");
        l.setBounds(100, 150, 150, 30);

        c.addItemListener(this);

        f.add(c);
        f.add(l);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        l.setText("Java Selected");
    }

    public static void main(String[] args) {
        new ItemExample();
    }
}
