import java.swing.*;
public class simplemessageswing{
public static void main(string[]args){
	JFrame Frame = newJFrame("simple message");
	 Frame.setsize(300,200);
	 Frame.setdefaultcloseoperation(JFrame.EXIT_ON_CLOSE);
	 JLabel messagelabel=new JLabel("hello,Javaswing", JLabel.CENTER);
	 JFrame.add(messagelabel);
	 Frame.setvisible(true);
       }
      }