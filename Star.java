import java.util.Scanner;
class Star{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int a=sc.nextInt();
for (int i=a;i>=a/2;i--)
{
for(int j=(i/2);j>=0;j--)
{
System.out.print("#");
}
System.out.print("\n");
}
}
}