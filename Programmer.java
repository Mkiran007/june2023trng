class Employee{
float salary=50000F;
}
class Programmer extends Employee{
int id=252;
int bonus =25000;
public static void main(String[] args)
{
Programmer p1=new Programmer();
System.out.println("Programmer salary"+p1.salary);
System.out.println("Bonus for the Programmer is"+p1.bonus);

}
}

