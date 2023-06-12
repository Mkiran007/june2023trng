class Animal{
void eat(){System.out.println("Parentclass");
}
}
class Dog extends Animal{
void eat(){
System.out.println("extended class");
}
void bark(){
System.out.println("barking....");
}
void work(){
super.eat();
bark();
}
}

class Teacher{
public static void main(String[] args){
Dog d=new Dog();
d.work();
}
}
