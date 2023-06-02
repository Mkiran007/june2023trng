import java.util.*;
import java.util.Scanner;
class Program16spl{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a Charceter");
Scanner scob=new Scanner(System.in);
ch = scob.next().charAt(0);
System.out.println();
if ((ch>='0'&&ch<='9'))
{
System.out.println(ch+" is an number");
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+" is  an Alphabet");
}
else{
System.out.println(ch+" is an Special charecter");
}
}
}
