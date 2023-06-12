import java.io.*;
public class Reader{
public static void main(String args[])
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.print("enter your name");
String name=br.readLine();
System.out.println("welcome"+name);
}
}