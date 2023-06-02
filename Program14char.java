import java.util.*;
import java.util.Scanner;
class Program14char{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a Charcter");
Scanner scob=new Scanner(System.in);
ch = scob.next().charAt(0);
System.out.println();
if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+"is an alphabet");
}
else
{
System.out.println(ch+"is not an alphabet");
}
}
}
