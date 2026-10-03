import java.awt.*;
import java.awt.event.*;
class MouseEvents extends Frame implements MouseListener
{
MouseEvents()
{
setTitle("Mouse event handling");
setSize(500,500);
setVisible(true);
addMouseListener(this);
}
public void mouseClicked(MouseEvent e)
{
System.out.println("mouse clicked");
}
public void mousePressed(MouseEvent e)
{
System.out.println("mouse pressed");
}
public void mouseReleased(MouseEvent e)
{
System.out.println("mouse released");
}
public void mouseEntered(MouseEvent e)
{
System.out.println("mouse Entered");
}
public void mouseExited(MouseEvent e)
{
System.out.println("mouse Exited ");
}
public static void main(String[] arts)
{
MouseEvents me=new MouseEvents();
}
}









