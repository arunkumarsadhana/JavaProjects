package operatorsInJava;
import java.util.*;
public class NestedIf {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the pin number  : ");
	int pin_num = sc.nextInt();
	if(pin_num>=1111&&pin_num<=9999) {
		System.out.println("Authorized Entry");
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		if(amount%100==0) {
			System.out.println(amount+" Withdrawn ");
		}else {
			System.out.println("Unable to dispense cash");
		}
	}else {
		System.out.println("UnAuthorized Entry");
	}
}
}
