abstract class Bike{
Bike(){System.out.println("BIKE is Created");
}
abstract void run();
void ChangeGear(){
System.out.println("GEAR is Chaged");
}
}
class Honda1 extends Bike{
void run(){
System.out.println("Running Safely");
}
public static void main(String args[])
{
Bike a=new Honda1();
a.run();
a.ChangeGear();
}
}