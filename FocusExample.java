import java.awt.*;
import java.awt.event.*;

public class FocusExample extends Frame
        implements FocusListener {

    TextField t;
    Label l;

    FocusExample() {

        Frame f = new Frame("Focus Event");

        t = new TextField();
        t.setBounds(100, 100, 200, 30);

        l = new Label("Click TextField");
        l.setBounds(100, 150, 150, 30);

        t.addFocusListener(this);

        f.add(t);
        f.add(l);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        l.setText("Focus Gained");
    }

    public void focusLost(FocusEvent e) {
        l.setText("Focus Lost");
    }

    public static void main(String[] args) {
        new FocusExample();
    }
}
