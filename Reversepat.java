import java.util.Scanner;
class Reversepat{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int a=sc.nextInt();
for(int i=a;i>0;i--)
{
for(int j=i;j>=1;j--)
{
System.out.print(j);
}
System.out.println("");
}
}
}