class Stu3{
public static void main(String args[])
{
try {
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e){
System.out.println("Common task Completed");}
catch(ArithmeticException e){
System.out.println("task 1");}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("task2");}
System.out.println("rest of code");
}
}