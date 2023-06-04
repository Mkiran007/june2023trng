class Bank{
int acc_no;
String name;
float amount;
void insert(int a,String s,float f){
acc_no=a;
name=s;
amount=f;
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdrawn(float amt2)
{
if(amount<amt2){
System.out.println("Insufficient funds");
}
else{
amount=amount-amt2;
System.out.println(amt2+"is withdrawn");
}
}
void balance()
{
System.out.println("Balance Amount is"+amount);
}
}
class Testaccount{
public static void main(String[] args)
{
Bank b1=new Bank();
Bank b2=new Bank();
b1.insert(101,"Kiran",25000);
b2.insert(102,"Mahesh",55000);
b1.deposit(500);
b2.deposit(5000);
b1.withdrawn(55500);
b2.withdrawn(75000);
b1.balance();
b2.balance();
}
}

