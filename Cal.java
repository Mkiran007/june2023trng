class Cal extends Thread
{
public static void main(String args[])
{
Cal obj=new Cal();
Thread thread=new  Thread(obj);
thread.start();
System.out.println("threads inside main are much helpful in java");
}
public void run()
{
System.out.println("threads from overridden run method are very helpful");
}
}