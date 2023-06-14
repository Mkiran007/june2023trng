class Except{
public static void main(String args[])
{
try{
int data=100;
int l=0;
}
catch(ArithmeticException e){System.out.println(e);}
System.out.println("rest of code...");
}
}