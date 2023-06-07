class Constructer{
int id;
String name;
Constructer( int i,String n){
id=i;
 name=n;
}
Constructer(Constructer s){
 id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+" "+name );}


public static void main(String[] args)
{
Constructer s1=new Constructer(111,"kiran");
Constructer s2=new Constructer(s1);
s1.display();
s2.display();
}
}