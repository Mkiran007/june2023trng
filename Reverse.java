import java.util.Scanner;
class Reverse{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a cahrecter");
String s=sc.next().charAt(0);
System.out.println("enter a number");
int a=sc.nextInt();
for(int i=a;i>=0;i--)
{
for(int j=i;j>=0;j--)
{
System.out.print("s");
}
System.out.println("");
}
}
}

