class Stu1{
int id;
String name;
void insertrecord(int r,String s){
id=r;
name=s;
}
void display(){
System.out.println(id+" "+name);
}
}
class Stu4{
public static void main(String[] args)

{
Stu1 s1=new Stu1();
Stu1 s2=new Stu1();
Stu1 s3=new Stu1();
s1.insertrecord(577,"Hemanth");
s2.insertrecord(578,"Mahesh");
s3.insertrecord(579,"Srikanth");
s1.display();
s2.display();
s3.display();
}
}