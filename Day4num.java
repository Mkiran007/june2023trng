import java.util.Scanner;
public class Day4num{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int i;
for(i=0;i<=n;i=i+m)
{
System.out.print(+i);
if(i<n-1){
System.out.print(",");
}
}
}
}

