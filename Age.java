import java.util.*;
class Age extends Exception{
String msg;
Age(String msg){
super(msg);
this.msg=msg;
}

public String toString(){
return msg;
}


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
try{
if(n<18)
{
("Entered age  doesn't fulfill the required age limit");
}
}
catch(Age ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}