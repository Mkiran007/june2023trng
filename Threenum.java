import java.util.Scanner;
class Threenum{
public static void main(String args[])
{
int max,min;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");

int a=sc.nextInt();
System.out.println("enter another number");
int b=sc.nextInt();
System.out.println("enter another number");
int c=sc.nextInt();


if(a<b||b<c)
{
System.out.println("The minimum Value is "+a );
}
else if(a<b||b>c){

System.out.println(" The minimum value is "+c);
}
else{
System.out.println("The minimum value is "+b);
}
}
}