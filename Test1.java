import java.util.Scanner;
class Polmorphism{
void print(){
System.out.println("WELCOME");
}
void print( String s){
System.out.println("WELCOME"+s);
}
}
class Test1{
public static void main(String[] Args)
{
Polmorphism obj=new Polmorphism();
obj.print();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String n=sc.next();
obj.print( n);
}
}