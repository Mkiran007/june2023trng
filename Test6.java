class Customer{
int amount=10000;
synchronized void withdraw(int amount)
{
System.out.println("going towithdraw...");
if(this.amount<amount)
{
System.out.println("Less balance;waiting for deposit....");
try{wait();}catch(Exception e){}
}
this.amount-=amount;
System.out.println("Withdraw completed...");
}
synchronized void deposit(int amount){
System.out.println("going to deposit");
this.amount+=amount;
System.out.println("deposit completed");
notify();
}
}
class Test6{
public static void main(String args[])
{
final Customer c=new Customer();
new Thread(){
public void run(){
c.withdraw(1500);}
}.start();
new Thread(){
public void run(){c.deposit(1000);}
}.start();
}
}