import java.util.Scanner;
public class Program12{
static int diff(int a,int b){ return a-b;}
static int pro(int a,int b){ return a*b;}
static int smallest(int a,int b){ 
if (a<b){
return a;
}
else{ return b;
}
}
static int largest(int a,int b){ 
if (a<b){
return b;
}
else{ return a;

}
}
public static void main (String [] args)
{
int num2,num1,result;

Scanner scob=new Scanner(System.in);
System.out.println("Enter the Number");
num1=scob.nextInt();
System.out.println("Enter the Number");
num2=scob.nextInt();

System.out.println("Enter the Number");
result=diff(num1,num2);
System.out.println("The Difference ="+result);
result=pro(num1,num2);
System.out.println("The Multiplication ="+result);
result=smallest(num1,num2);
System.out.println("The Smallest ="+result);
result=largest(num1,num2);
System.out.println("The largest ="+result);
}
}



