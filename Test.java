import java.util.Scanner;
class Day4con{
int i;
String s;
Day4con(){i=0;s=null;}
Day4con(int r,String n){
i=r;
s=n;
}
void display(){System.out.println(i+" "+s);}
}
class Test{
public static void main(String[] args)
{
Day4con s1=new Day4con();
Day4con s2=new Day4con(111," Kiran");
s1.display();
s2.display();
}
}