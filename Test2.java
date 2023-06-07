class Animal{
void eat(){System.out.println("eating");}
}
class Dog extends Animal{
void bark(){
System.out.println("Barking");
}
}
class Cat extends Animal{
void weep(){System.out.println("meow");}
}

class Test2
{
public static void main(String[] args)
{
Cat n =new Cat();
n.eat();
Dog m=new Dog();
n.weep();
m.bark();
}
}
