class TestDeadlock{
public static void main(String args[])throws Exception
{
final String resource1="rathan jaiswal";

final String resource2="jaiswal";
Thread t1=new Thread(){
public void run(){
Synchronized(resource1){
System.out.println("Thread1 : locked resourse1");
try{
Thread.sleep(100);}
catch(Exception e)
{}
Synchronized(resource2){
System.out.println("Thread1 : locked resourse2");
}
}
}
}
}
}
}
