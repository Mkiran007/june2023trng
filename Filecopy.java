import java.io.*;
class Filecopy{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("D:\\exam\\example.txt");
BufferedReader br=new BufferedReader(fr);
CharArrayWriter out=new CharArrayWriter();
int i;
while((i=br.read())!=-1){
out.write((char)i);
}
FileWriter f1=new FileWriter("C:\\dailyquiz\\a.txt");
out.writeTo(f1);
fr.close();
System.out.println("sucess...");
}

}