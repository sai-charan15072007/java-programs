import java.awt.*;
import java.awt.event.*;
class Window extends Frame implements WindowListener
{
Window()
{
setTitle("WindowEvent");
setSize(500,500);
setVisible(true);
addWindowListener(this);
}
public void windowOpened(WindowEvent e)
{
system.out.printIn("window opened");
}
public void windowClosing(WindowEvent e)
{
system.out.print("window closing");
system.exit(0);
}
public void windowClosing(WindowEvent e)
{
system.out.print("window closing");
}

public void windowIconified(WindowEvent e)
{
system.out.print("window minimized");
}
public void windowDeiconified(WindowEvent e)
{
system.out.print("window restored");
}
public void windowActivated(WindowEvent e)
{
system.out.print("window activated");
}
public void windowDeactivated(WindowEvent e)
{
system.out.print("window deactivated");
}
class Gui
{
public static void main(Strings[] arts)
{
Window w=new Window();
}
}



