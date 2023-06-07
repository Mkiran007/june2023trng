import java.util.Scanner;
 class Wraper2{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter  a number");
Integer a =sc.nextInt();
Integer b=0;
Integer d=0;
for(int i=a;i>=0;i++)
{
b=b*10+(a%10);
a=a/10;
}
if(a==d)
{
System.out.println(" palindrom");
}
else{
System.out.println("not palindrom");
}
}
}