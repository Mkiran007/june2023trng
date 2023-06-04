class Stu1{
int id;
String name;
float salary;
void insertrecord(int r,String s,float n){
id=r;
name=s;
salary=n;
}
void display(){
System.out.println(id+" "+name+" "+salary);
}
}
class Stu5{
public static void main(String[] args)

{
Stu1 s1=new Stu1();
Stu1 s2=new Stu1();
Stu1 s3=new Stu1();
s1.insertrecord(577,"Hemanth",35000);
s2.insertrecord(578,"Mahesh",50000);
s3.insertrecord(579,"Srikanth",75000);
s1.display();
s2.display();
s3.display();
}
}