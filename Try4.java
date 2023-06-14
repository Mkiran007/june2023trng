import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Try4{
public static void main(String args[])
{
PrintWriter pw;
try{
pw=new PrintWriter("C:\Users\91938\Downloads\csp project");
pw.Println("saved");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("File saved successfully");
}
}