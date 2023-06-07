import java.util.Scanner;
class Palindrom{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String sc=s.nextLine();
String a="";
int b=sc.length()-1;
for (int i=0;i<=b;i++)
{
if(sc.charAt(i)>='0'&&sc.charAt(i)<='9')
{
a=a+sc.charAt(i);
}
}
System.out.println(a);
}
}