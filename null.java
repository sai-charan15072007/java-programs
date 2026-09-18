class Hi
{
public static void main(String[] args)
{
try
{
String name=null;
System.out.println(name);
}
catch(NullPointerException e)
{
System.out.println("Not be null");
}
catch(ArithmeticException e)
{
System.out.println("Not be zero");
}
}
}
