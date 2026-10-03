import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLight extends JFrame implements ActionListener
{
JLabel message;
JRadioButton red, yellow, green;
ButtonGroup group;

TrafficLight()
{
setTitle("Traffic Light Simulator");
setSize(400, 250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
message = new JLabel("Select a light");
message.setFont(new Font("Arial", Font.BOLD, 30));
add(message);
red = new JRadioButton("Red");
yellow = new JRadioButton("Yellow");
green = new JRadioButton("Green");
group = new ButtonGroup();
group.add(red);
group.add(yellow);
group.add(green);
red.addActionListener(this);
yellow.addActionListener(this);
green.addActionListener(this);
add(red);
add(yellow);
add(green);
setVisible(true);
}
public void actionPerformed(ActionEvent e) 
{
if (red.isSelected()) 
{
message.setText("STOP");
message.setForeground(Color.RED);
}
else if (yellow.isSelected()) 
{
message.setText("READY");
message.setForeground(Color.ORANGE);
}
else if (green.isSelected()) 
{
message.setText("GO");
message.setForeground(Color.GREEN);
}
}
public static void main(String[] args) 
{