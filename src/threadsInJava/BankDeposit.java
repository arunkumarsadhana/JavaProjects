package threadsInJava;
class Customer{
	int amount=10000;
	synchronized void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Insufficient balance : ");
			try {
				wait();
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println(amount + " withdrawn ");
	}
	synchronized void deposit(int amount,int wamount) {
		this.amount+=amount;
		if(this.amount>wamount) { 
			System.out.println("Balance is "+this.amount);
			notify();
		}
		System.out.println("After deposit balance is "+this.amount);
	}
}
public class BankDeposit {
public static void main(String args[]) {
	Customer obj=new Customer();
	Thread t1=new Thread(()-> {obj.withdraw(15000);});
	Thread t2=new Thread(()-> {obj.deposit(3000,15000);});
	Thread t3=new Thread(()-> {obj.deposit(4000,15000);});
	t1.start();
	t2.start();
	t3.start();
}
}
