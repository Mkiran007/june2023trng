import java.util.Iterator;
import java.util.Vector;
class Anim{
public static void main(String args[])
{
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("cat");
animals.add("rat");
String st=animals.get(2);
System.out.print("Elements At index2:"+st);
Iterator<String>iterate=animals.iterator();
System.out.println("Vector:");
while(iterate.hasNext()){
System.out.print(iterate.next());
System.out.print(",");
}
}
}
