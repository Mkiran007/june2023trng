import java.util.Scanner;
 class Char{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter  a name");
String a =sc.next();
String b="";
int c=a.length()-1;
for(int i=c;i>=0;i--)
{
b=b+a.charAt(i);
}
System.out.println(b);
}
}

