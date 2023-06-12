class Animal{
Animal(){System.out.print("Paarent class ");
}
}
class Dog extends Animal{
Dog(){
System.out.println("child class ");
}
}
class Test{
public static void main(String[] args)
{
Dog d=new Dog();
}

}