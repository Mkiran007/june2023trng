import java.util.Scanner;
class While2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
int count=0;
int b=0;
while(count<=a)
{
b=b+count;

count++;
}
System.out.println(b);
}
}