class TestDeadlock1{
public static void main(String args[])throws Exception
{
final String resource1="rathan jaiswal";

final String resource2="jaiswal";
Thread t1=new Thread(){
public void run(){
synchronized(resource1){
System.out.println("Thread1 : locked resourse1");
try{
Thread.sleep(100);}
catch(Exception e)
{}
synchronized(resource2){
System.out.println("Thread1 : locked resourse2");
}
}
}
};
Thread t2=new Thread(){
public void run(){
synchronized(resource2){
System.out.println("Thread 2 locked resource 2");
try{
Thread.sleep(100);
}
catch(Exception e){}
synchronized(resource1){
System.out.println("Thread 2 locked reource 1");
}
}
}
};
t1.start();
t2.start();
}
}