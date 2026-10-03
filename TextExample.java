import java.awt.*;
import java.awt.event.*;

public class TextExample extends Frame
        implements TextListener {

    TextField t;
    Label l;

    TextExample() {

        Frame f = new Frame("Text Event");

        t = new TextField();
        t.setBounds(100, 100, 200, 30);

        l = new Label("Enter Text");
        l.setBounds(100, 150, 150, 30);

        t.addTextListener(this);

        f.add(t);
        f.add(l);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void textValueChanged(TextEvent e) {
        l.setText("Text Changed");
    }

    public static void main(String[] args) {
        new TextExample();
    }
}
