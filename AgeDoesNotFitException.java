import java.util.*;
class AgeDoesNotFitException extends Exception
{
String msg;
AgeDoesNotFitException(String msg)
{
super(msg);
this.msg=msg;
}
//overriding with our custom message
@Override
public String toString()
{
return msg;
}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try
{
if(age<18)
{
//checking if the age is above the limit or not
throw new AgeDoesNotFitException("Entered age doesn't fulfill the required age limit");
}
}
catch(AgeDoesNotFitException ex)
{
//calls override toString() method
System.out.println(ex);
//prints message passed to the super constructor
System.out.println(ex.getMessage());
}
}
}