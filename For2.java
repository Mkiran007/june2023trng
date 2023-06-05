import java.util.Scanner;
class For2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
int j=0;
int i;
for(i=1;i<=a;i++)
{
j=j+i;
}
System.out.println("sum="+j);
}
}