import java.awt.*;
class FrameDemo{
public static void main(String[] args){
Frame f=new Frame();
f.setTitle("myframe");
f.setBackground(Color.cyan);
f.setForeground(Color.red);
f.setLayout(new FlowLayout());
Button b1=new Button("Submit");
Button b2=new Button("Cancel");
f.add(b1);f.add(b2);
f.setSize(500,300);
f.setVisible(true);
}
}