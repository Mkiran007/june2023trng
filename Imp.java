import java.util.Scanner;
class Imp{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int a=sc.nextInt();
int k=0,l=1;
for(int i=0;i<=a;i++)
{
for(int j=0;j<=i;j++)
{
if(k<=a){

System.out.print(k);
}
k=l;
l++;
while(j<i&&k<=a)
{
System.out.print(",");
break;
}
}
if(l>=a)
{
break;
}
System.out.print("\n");
}
}
}