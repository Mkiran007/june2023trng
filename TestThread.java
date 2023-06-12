class TestThread extends Thread
{
 public static void main(String args[])
{
TestThread tob=new TestThread();
tob.Start();
System.out.println("This code is out side of threda");
}
public void run()
{
System.out.println("this code is running in athread");
}
}