class Add{
public static void main(String abc[])
{
int sum=0;
for( String i:abc)
{
sum=sum+Integer.parseInt(i);
}
System.out.println(sum);
}
}