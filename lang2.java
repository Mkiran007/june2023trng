import java.util.ArrayList;
class Lang2{
public static void main(String args[])
{
ArrayList<String>lang=new ArrayList<>();
lang.add("java");
lang.add("pythyon");
lang.add("Swift");
System.out.println("ArrayList:"+lang);
lang.set(2,"js");
System.out.println("Modified ArrayList"+lang);
}
}
