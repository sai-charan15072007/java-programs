pubvlic class AdapterDemo extends frame{
AdapterDemo(){
setTitel("Adapter Example");
setSize(400,300);
addWindowListener(new windowAdapter(){
public void windowVClosing(windowEvent e){
System.out.println("window is closing");
system.exit(0);
}
});
setyVisible(true);
}
public static void main(String[]args){
new AdapterDemo();
}
}