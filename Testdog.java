class Animal{
public void move(){
System.out.println("Parent class ");
}
}
class Dog extends Animal{
public void move(){
System.out.println("child class");
}
}
class Testdog{
public static void main(String[] args)
{
Animal a=new Animal();
Animal b=new Dog();
a.move();
b.move();
}
}