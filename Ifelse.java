import java.util.Scanner;
class Ifelse{
public static void main(String[] args)
{
Scanner scob=new Scanner(System.in);
int num1;
num1=scob.nextInt();
if(num1==0){
System.out.println("SUNDAY");}
else if(num1==1){System.out.println("MONDAY");}
else if(num1==2){System.out.println("TUESDAY");}
else if(num1==3){System.out.println("WEDNESDAY");}
else if(num1==4){System.out.println("THURSDAY");}
else if(num1==5){System.out.println("FRIDAY");}
else if(num1==6){System.out.println("SATURDAY");}
else{System.out.println("INVALID");}
}
}

