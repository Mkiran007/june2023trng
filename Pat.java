import java.util.Scanner;
class Pat{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=a/2;
for(int i=0;i<a;i++)
{
for(int j=a-i;j>1;j--)
{
System.out.print("#");
}
for(int z=0;z<=i;z++)
{
System.out.print("*");
}
for(int k=0;k<=i-1;k++)
{
System.out.print("*");
}
for(int m=a-i;m>1;m--)
{
System.out.print("#");
}
System.out.println();
}
}
}