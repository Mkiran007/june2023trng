import java.util.Scanner;
class Even
{
public static void printLine(char c,int col)
{
System.out.println();
for(int j=1;j<=col;j++)
System.out.print(c);
}
public static void printPattern(char c,int n)
{
for(int i=1;i<=n;i++)

{
printLine(c,i);
}
}
public static void printreverse(char c,int n)
{
for(int i=n;i>=0;i--)
{
printLine(c,i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
if((row/2)*2==row){
printPattern(ch,row);
printreverse(ch,row+1);
}
else
{
printPattern(ch,row/2);
printreverse(ch,(row/2)+1);
}
}
}