class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class Testthis{
public  static void main(String[] args)
{
Student s1=new Student(111,"karthik",4387f);
Student s2=new Student(113,"lakshman",3527f);
Student s3=new Student(113,"Ram",5748f);
s1.display();
s2.display();
s3.display();

}
}