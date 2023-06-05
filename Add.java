import java.util.Scanner
class Add{
public static void main(String args[])
{
int max,min;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a<b)
{
System.out.println("The maximum Value is "+b+"The minimum value is "+a);
}
else{

System.out.println("The minimum Value is "+b+"The maxmimum value is "+a);
}
}
}