class A1 {
A1(){
System.out.println("Hello Method A1");
}
A1(int x){
this();
System.out.println(x);
}
}
class Testthis3{
public static void main(String[] ags)
{
A1 a=new A1(10);
}
}