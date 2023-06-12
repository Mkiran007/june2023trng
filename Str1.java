import java.util.Scanner;
class Str1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String x=sc.nextLine();
String res=s.replaceAll(x,"");
System.out.print(res);
}
}