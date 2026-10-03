import java.awt.*;
import java.awt.event.*;

public class ActionExample extends Frame
        implements ActionListener {

    Button b;
    Label l;

    ActionExample() {

        Frame f = new Frame("Action Event");

        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 30);

        l = new Label("Button not clicked");
        l.setBounds(100, 150, 150, 30);

        b.addActionListener(this);

        f.add(b);
        f.add(l);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked");
    }

    public static void main(String[] args) {
        new ActionExample();
    }
}
