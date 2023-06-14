import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Work implements Runnable{
private String mess;
public Work(String s){
this.mess=s;
}
public void run(){
System.out.println(Thread.currentThread().getName()+"(start)message="+mess);
processmess();
System.out.println(Thread.currentThread().getName()+"(End)");
}
private void processmess(){
try{Thread.sleep(2000);}
catch(InterruptedException e){
e.printStackTrace();
}
}
class Test{
public static void main(String args[])
{
ExecutorService excecutor=Executors.newFixedThreadPool(5);
for(int i=0;i<10;i++)
{
Runnable worker=new WorkerThread(""+i);
executor.Execute(worker);}
executor.shutdown();
while(!execute.isTerminate()){ }
System.out.println("finshed All Threads");}
}
}