import java.awt.*;
import java.awt.event.*;
class window {
        public static void main(String[] args) {
        Frame f = new Frame("My Window");
        Label l = new Label("First Java Event Program for Sai Charan");
        l.setBounds(100, 100, 200, 30);
        f.add(l);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
