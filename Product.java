import java.util.Scanner;
 class Product{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter  a number");
int a =sc.nextInt();
int b=1;
while(a>0)
{
b=b*(a%10);
a=a/10;

}
System.out.println(b);
}
}

