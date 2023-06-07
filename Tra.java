import java.util.Scanner;
class Tra{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
int a=sc.nextInt();
int b;
if((a/2)*2==a)
{
b=a/2;
reverse(s2,a/2);
pattren(s1,(a/2)+1);
}
}
public static void pattren(String c,String d,int t)
{
for(int i=0;i<=t;i++)
{
System.out.print(c);
for(int j=0;j<=t;j++);
{
System.out.print(d);
}
}
}
public static void reverse(String d,int z)
{
for(int k=z;k>=0;k--)
{
System.out.print(d);
for(int j=i;j>=z;j++);
{
System.out.print("");
}
}
}
}



