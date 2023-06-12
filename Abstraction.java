abstract class Shape{
abstract void draw();
}
class Rectangle extends Shape{
public void draw(){
System.out.println("RECTANGLE CLASS");
}
}
class Circle extends Shape{
public void draw(){
System.out.println("Circle CLASS");
}
}
class Abstraction{
public static void main(String args[])
{
Shape a=new Rectangle();
Shape b=new Circle();
a.draw();
b.draw();
}
}