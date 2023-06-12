import java.util.*;
class Sort{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int k=0;k<b.length;k++)
{
b[k]=sc.nextInt();
}
for(int i=0;i<b.length;i++)
{
for(int j=i+1;j<b.length;j++)
{
int temp=0;
if(b[i]>b[j])
{
temp=b[i];
b[i]=b[j];
b[j]=temp;
}
else{}
}
System.out.print(b[i]+" ");

}
}

}
