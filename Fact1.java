import java.util.Scanner;
class Fact1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
int j=1;
int i;
for(i=1;i<=a;i++)
{
j=j*i;
}
System.out.println("product = "+j);
}
}