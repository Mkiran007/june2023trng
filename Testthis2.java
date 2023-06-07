class A {
void m(){System.out.println("Hello Method M");
}
void n(){
System.out.println("Hello Method N");
this.m();
}
}
class Testthis2{
public static void main(String[] args)
{
A a=new A();
a.n();
}
}