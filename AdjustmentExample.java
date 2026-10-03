import java.awt.*;
import java.awt.event.*;

public class AdjustmentExample extends Frame
        implements AdjustmentListener {

    Scrollbar s;
    Label l;

    AdjustmentExample() {

        Frame f = new Frame("Adjustment Event");

        s = new Scrollbar();
        s.setBounds(100, 80, 20, 150);

        l = new Label("Move Scrollbar");
        l.setBounds(80, 250, 150, 30);

        s.addAdjustmentListener(this);

        f.add(s);
        f.add(l);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        l.setText("Value: " + s.getValue());
    }

    public static void main(String[] args) {
        new AdjustmentExample();
    }
}
