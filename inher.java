class A
{
void sample(){
System.out.println("Class A");
}
}
class B extends A
{
void display(){
System.out.print("Class B");
}
public static void main(String[]args){
B obj=new B();
obj.display();
obj.sample();
}
}
