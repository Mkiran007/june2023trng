import java.util.ArrayList;
import java.util.List;
class Min4{
public static void main(String args[])
{
List<Integer>numb=new ArrayList<>();
numb.add(1);
numb.add(2);
numb.add(5);
System.out.println("LIST"+numb);
int num=numb.get(2);
System.out.println("Accessed element :"+num);
int num1=numb.remove(1);
System.out.println("Removed list"+num1);
System.out.println("List"+numb);
}
}