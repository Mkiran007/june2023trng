class Child extends Thread{
public void run(){
for(int i=1;i<=4;i++)
{
try{
Thread.sleep(500);
}
catch(Exception e){
System.out.println(e);
}
System.out.println("child thread execution-"+i);
}
}
}
class Test1{
public static void main(String args[])throws Exception
{
Child t1=new Child();
t1.start();
t1.join();
System.out.println("main thread completed");
}
}