import java.util.Scanner;
class Fab{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the nth value");
int a=sc.nextInt();
int b=0;
int sum=0;
int c=1;
System.out.println("Fabonacci Series");
while(sum<=a)
{
System.out.print(sum+" ");
b=c;
c=sum;
sum=b+c;}
}
}