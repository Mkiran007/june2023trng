class Student{
int id;
String name,course;
float fee;
Student(int id,String name,String course)
{
this.id=id;
this.name=name;
this.course=course;
System.out.println("id= "+id+" name= "+name+" course= "+course);
}
Student(int id,String name,String course,float fee)
{
this(id,name,course);
this.fee=fee;
System.out.println("id= "+id+" name= "+name+" course= "+course +" fee= "+fee);
}

}
class Teststudent{
public static void main(String[] args)
{
Student s1=new Student(11,"kiran","cse");
Student s2=new Student(11,"kiran","cse",25000);
}
}