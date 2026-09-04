interface engine{
default void sample(){
System.out.println("ENGINE");
}
}
interface music{
default void sample(){
System.out.println("MUSIC");
}
}
class vehicle{
public void sample(){
System.out.println("VEHICLE");
}
}
class car extends vehicle implements engine,music{
void display(){
engine.super.sample();
music.super.sample();
super.sample();
System.out.println("CAR");
}
public static void main(String[]args){
car obj=new car();
obj.display();

}
}