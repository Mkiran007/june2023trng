class My extends Thread{
public void run(){
System.out.println("Shut down hook is completd");
}

}
class TestShut{
public static void main(String args[])throws Exception
{
Runtime t=Runtime.getRuntime();
t.addShutdownHook(new My());
System.out.println("now main sleeping.....press ctrl+c to exit");
try {Thread.sleep(3000);}
catch(Exception e){}
}
}