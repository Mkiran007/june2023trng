import java.util.Scanner;
class Swap{
public static void main(String[] args)
{
Scanner scob=new Scanner(System.in);
int num1;
num1=scob.nextInt();
int num2;
num2=scob.nextInt();
num1=num1+num2;
num1=num1-num2;
num2=num1-num2;
System.out.println(num1+"\n"+num2);
}
}

