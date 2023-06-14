class Testinter extends Thread{
public void run(){
try{
Thread.sleep(1000);
System.out.println("task");
}
catch(InterruptedException e){
System.out.println("EXception handled "+e);}
System.out.println("Thread is running ....");
}
public static void main(String args[]){
Testinter t1=new Testinter();
t1.start();
t1.interrupt();
}
}