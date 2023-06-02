import java.util.Scanner;
class Program10{
public static boolean isEven(int n)
{
return(n/2*2==n);
}

public static void main(String[] args)
{
Scanner scob=new Scanner(System.in);
int dn;
System.out.println("Enter the Number");
dn=scob.nextInt();
if(isEven(dn))
{
System.out.println(" The Number is Even");
}
else{
System.out.println(" The Number is odd");
}
}
}
