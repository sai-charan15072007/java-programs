import java.awt.*;
class Gui
{
public static voi main(String[] arts)
{
Frame f=new Frame("GUI Window");
f.setSize(500,500);
TextField tx=new TextField(20);
tx.setBounds(100,100,100,100);
f.add(tx);
//Button b=new Button("login");
//f.add(b);
//b.setBounds(100,100,100,100);
//f.setLayout(null);
//Label l=new Label("username");
//f.add(l);
f.setVisible(true);
}
}