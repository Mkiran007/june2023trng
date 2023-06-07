import java.util.Scanner;
class Toupper{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String sc=s.nextLine();
String a="";
int temp;
for(int i=sc.length()-1;i>=0;i--)
{
if(sc.charAt(i)>='a'&&sc.charAt(i)<='z')
{
temp=sc.charAt(i);
temp=temp-32;
a=a+(char)temp;
}
else
{
a=a+sc.charAt(i);
}
}
System.out.println(a);

}
}