class Animal{
void eat(){System.out.println("eating");}
}
class Dog extends Animal{
void bark(){
System.out.println("Barking");
}
}
class Babydog extends Dog{
void weep(){System.out.println("Weeping");}
}

class Test
{
public static void main(String[] args)
{
Babydog n =new Babydog();
n.eat();
n.bark();
n.weep();
}
}
