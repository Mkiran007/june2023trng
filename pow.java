import java.util.Scanner;
 class Pow{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter  a number");

int a =sc.nextInt();

System.out.println("Enter the value of power");

int b=sc.nextInt();
int c=0;
for(int i=0;i<=b;i++)
{
c=a*b;
}
System.out.println(c);
}
}
