class c{
public void display()
{
System.out.println("Method of class c");
}
}
class A extends c
{
public void display()
{
System.out.println("Method of class A");
}
}
class B extends c
{
public void display()
{
System.out.println("method of class B");
}
}
class D extends A{
public void display()
{
System.out.println("method of class D");
}
public static void main(String[] args)
{
D obj=new D();
obj.display();
}
}
