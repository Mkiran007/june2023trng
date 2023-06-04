import java.util.Scanner;
class Day4swap{
public static void main(String[] args)
{
Scanner scob=new Scanner(System.in);
int num1;
num1=scob.nextInt();
int num2;
num2=scob.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.print(num1+" "+num2);
}
}