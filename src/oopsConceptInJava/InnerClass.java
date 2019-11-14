package oopsConceptInJava;
import java.util.*;
class BankAccount{
	private double bal;
	BankAccount(double b){
		bal=b;
	}
	private class InnerInterest{
		private double rate;
		InnerInterest(double r){
			this.rate=r;
		}
		void calculateInterest() {
			double interest = bal * rate/100;
			bal+=interest;
			System.out.println("Updated Balance = "+bal);
		}
	}
	public void contact(double r) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the password");
		String pswd=sc.nextLine();
		if(pswd.equals("admin")) {
			InnerInterest iin=new InnerInterest(r);
			iin.calculateInterest();			
		}else {
			System.out.println("Sorry,you are not authorized");
		}
	}
}
public class InnerClass {
public static void main(String args[]) {
	BankAccount ba=new BankAccount(5000);
	ba.contact(7.5);
}
}
