class Animal{
void eat(){System.out.println("eating");}
}
class Dog extends Animal{
void bark(){
System.out.println("Barking");
}
public static void main(String[] args)
{
Dog n =new Dog();
n.eat();
n.bark();
}
}
