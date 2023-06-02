import java.util.Scanner;
public class Program17ascii
{
public static void main(String args[])
{
char temp;
Scanner n=new Scanner(System.in);
temp=n.next().charAt(0);

int castAschii=(int) temp;
System.out.println("ASCII of "+temp+"  is  "+castAschii);
}
}