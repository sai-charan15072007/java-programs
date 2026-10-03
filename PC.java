class Buffer{
int data;
boolean hasData = false;
synchronized void produce(int val){
while(hasData){
try{ wait();} catch(Exception e){}
}
data =val;
System.out.println("Produced :"+data);
hasData=true;
notify();
}
synchronized void consume(){
while(!hasData){
try{wait();}catch(Exception e){}
}
System.out.println("Consumed :"+ data);
hasData=false;
notify();
}
}
class producer extends Thread{
Buffer b;
producer(Buffer b){this.b=b;}
public void run(){
for(int i=1;i<=5;i++){
b.produce(i);
try{Thread.sleep(500);}catch(Exception e){}
}
}
}
class consumer extends Thread{
Buffer b;
consumer(Buffer b){this.b=b;}
public void run(){
for(int i=1;i<=5;i++){
b.consume();
try{Thread.sleep(500);}catch(Exception e){}
}
}
}
public class PC{
public static void main(String args[]){
Buffer b= new Buffer();
new producer(b).start();
new consumer(b).start();
}
}