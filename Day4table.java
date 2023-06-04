import java.util.Scanner;
public class Day4table{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number as Input");
int n=sc.nextInt();
String ch=" ";
for(int  i=0;i<=10;i++)
{
System.out.println(n+ch+"*"+ch+i+"="+n*i);
}
}
}
