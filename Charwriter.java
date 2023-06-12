import java.io.CharArrayWriter;
import java.io.FileWriter;
class Charwriter{
public static void  main(String args[])throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome kiran");
FileWriter f1=new FileWriter("D:\\exam\\a.txt");
FileWriter f2=new FileWriter("D:\\exam\\b.txt");
FileWriter f3=new FileWriter("D:\\exam\\c.txt");
FileWriter f4=new FileWriter("D:\\exam\\k.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.println("Sucess...");
}
}
