import java.util.ArrayList;
class Animal{
public static void main(String args[])
{
ArrayList<String>animals=new ArrayList<>();
animals.add("Dog");
animals.add("cat");
animals.add("rat");
System.out.println("ArrayList:"+animals);
String st=animals.get(1);
System.out.print("Elements At index1:"+st);
st=animals.get(2);
System.out.println("ELEMENT at index 1 :"+st);
}
}
