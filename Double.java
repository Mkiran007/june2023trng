import java.util.Scanner;
class Double{
public static Double Doublle(Double a, Double b)
{
Double c=a+b;
return c;
}
public static void main(String[] args)
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a numb");
Double num1;
num1=scob.nextDouble();
System.out.println("Enter a numb");
Double num2;
num2=scob.nextDouble();
System.out.println(num1+"+"+num2+"="+Double(num1,num2));
}
}

