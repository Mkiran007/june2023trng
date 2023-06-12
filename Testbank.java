abstract class Bank{
abstract int getRateOfIntrest();
}
class Sbi extends Bank{
int getRateOfIntrest(){
return 7;}
}
class Pnb extends Bank{
int getRateOfIntrest(){
return 8;}
}
class Testbank{
public static void main(String[] args)
{
Bank b;
b=new Sbi();

System.out.println("rate of intrest is"+b.getRateOfIntrest()+"%");
b=new Pnb();
System.out.println("rate of intrest is"+b.getRateOfIntrest()+"%");
}
}
