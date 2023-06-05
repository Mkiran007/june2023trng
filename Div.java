import java.util.Scanner;
class Div{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
System.out.println("enter another number");
int b=sc.nextInt();
if (b==0)
{
System.out.println("Division by error");
}
else{
System.out.println(a+" is Divided by "+b+" is "+(a/b));
}
}
}