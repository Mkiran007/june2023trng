import java.util.Scanner;
class Day4frequency{
public static void main(String[] args)
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter the string");
String s=scob.nextLine();
char ch=scob.next().charAt(0);
int temp=0;
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)==ch)
{
temp++;
}


}
System.out.println(temp);
}
}