class Exc3{
public static void main(String args[])
{
try{
int a[]={1,7,9};
System.out.println(a[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("rest of code...");
}
}