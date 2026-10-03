import java.awt.*;
import java.awt.event.*;

public class WindowExample extends Frame
        implements WindowListener {

    Label l;

    WindowExample() {

        Frame f = new Frame("Window Event");

        l = new Label("Window Open");
        l.setBounds(100, 100, 150, 30);

        f.add(l);

        f.addWindowListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public static void main(String[] args) {
        new WindowExample();
    }
}
