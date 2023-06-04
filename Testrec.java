class Rec{
int length,width;
void insertrecord(int r,int w){
length=r;
width=w;
}
void cal(){
System.out.println(length*width);
}
}
class Testrec{
public static void main(String[] args)

{
Rec r1=new Rec();
Rec r2=new Rec();
r1.insertrecord(11,5);
r2.insertrecord(3,15);
r1.cal();
r2.cal();
}
}