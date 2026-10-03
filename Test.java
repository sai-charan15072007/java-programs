class Counter{
int count =0;
void increment(){
synchronized(this){
count++;
}
}
}
public class Test{
public static void main(String args[]) throws Exception{
Counter c =new Counter();
Thread t1=new Thread(()->{
	
  for(int i=0;i<10;i++){
   c.increment();
}
});
Thread t2=new Thread(()->{
  for(int i=0;i<10;i++){
   c.increment();
}
});
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println("final count="+c.count);
}
}
