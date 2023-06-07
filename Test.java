import java.util.Scanner;
class Test{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2="";
int temp,a=s1.length()-1;
for(int i=a;i<=0;i--)
{
s2=s2+s1.charAt(i-1);
}
System.out.println(s2);
}
}
