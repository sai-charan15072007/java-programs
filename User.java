import java.awt.*;
class User
{
public static void main(String[]arts)
{
Frame f=new Frame("GUI Application");
f.setSize(500,500);
f.setLayout(new FlowLayout());
 Label l =new Label("choose the fruit");
Choice c=new Choice();
c.add("apple");
c.add("banna");
c.add("mango");
f.add(l);
f.add(c);s
f.setVisible(true);
}
}
