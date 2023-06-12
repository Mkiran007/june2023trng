class Animal{
public void move(){
System.out.println("parent class");
}
}
class Pet extends Animal{
public void move(){
System.out.println("child class 1");
}
}
class Dog extends Animal{
public void move(){
System.out.println("child class 2");
}
}
class Pol{
public static void main(String[] args)
{
Animal a=new Animal();
Animal b=new Pet();
Animal c= new Dog();
a.move();
b.move();
c.move();
}
}
