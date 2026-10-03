import java.awt.*;
class Gui{
public static void main(String[] args){
Frame f=new Frame("Gui application");
f.setSize(500,500);
f.setLayout(null);
Label l=new Label("username");
l.setBounds(100,100,500,500);
f.add(l);
f.setVisible(true);
}
}