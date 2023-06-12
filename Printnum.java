import java.util.Scanner;
class Printnum{
static void Line(int n)
{
for(int k=1;k<=n;k++)
{
System.out.print(k);
}
}
static void print(int n)
{
for(int i=1;i<=n;i++){
System.out.print("\n");
Line(i);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int a=sc.nextInt();
print(a);

}
}