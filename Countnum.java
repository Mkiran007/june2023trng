import java.io.*;
class Countnum{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\exam\\example.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countVowel=0;
while((i=br.read())!=-1){
if(((char)i>='0')&&((char)i<='9')){countVowel++;}
}
System.out.println(countVowel);
br.close();
fr.close();
}
}