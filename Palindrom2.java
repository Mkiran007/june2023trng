import java.util.Scanner;
class Palindrom2{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String sc=s.nextLine();
String a="";
sc=sc.toLowerCase();
for(int i=sc.length()-1;i>=0;i--)
{
a=a+sc.charAt(i);
}
if(a==sc)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}