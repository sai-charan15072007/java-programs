import java.util.Random;
class NumberGenerator extends Thread{
public void run(){
 Random rand=new random();
while(true){
int num=rand.nextInt(100);
System.out.println("\n Generated Number :"+num);
if(num%2==0){
new SqaureThread(num).start();
}else{
new CubeThread(num).start();
}
try{
Thread.sleep(1000);
}catch(InterruptedException e){
System.out.println("Interrupted :"+e);
}
}
}
}
class SqaureThread extends Thread{
 int number;
SqaureThread(int num){
this.number=num;
}
public void run(){
int square=number*number;
System.out.println("Square of"+ number+ "is:"+sqaure);
}
}
class CubeThread extends Thread{
int number;
CubeThread(int num){
this.number=num;
}
public void run(){
int cube =number*number*number;
System.out.println("Cube of"+number+"is:"+cube);
}
}
public class MultiThreadExample{
public static void main(String args[]){
NumberGenerator ng=new NumberGenerator();
ng.start();
}
}