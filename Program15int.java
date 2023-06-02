import java.util.*;
import java.util.Scanner;
class Program15int{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a Number");
Scanner scob=new Scanner(System.in);
ch = scob.next().charAt(0);
System.out.println();
if ((ch>='0'&&ch<='9'))
{
System.out.println(ch+"is an number");
}
else
{
System.out.println(ch+"is not an number");
}
}
}
