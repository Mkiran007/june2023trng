class Constructer2{
int id;
String name;
Constructer2( int i,String n){
id=i;
 name=n;
}
Constructer2(){}

void display()
{
System.out.println(id+" "+name );}


public static void main(String[] args)
{
Constructer2 s1=new Constructer2(111,"kiran");
Constructer2 s2=new Constructer2();
s1.display();
s2.display();
}
}