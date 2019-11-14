package operatorsInJava;

public class FactorialOfANumber {
public static void main(String args[]) {
	int num=5;
	long fact=1;
	while(num>=1) {
		fact*=num;
		num--;
	}
	System.out.println("Factorail of the number is "+fact);
	num=5;
	fact=1;
	do {
		fact*=num;
		num--;
	}while(num>=1);
	System.out.println("Factorial of the number is "+fact);
	for(num=5,fact=1;num>=1;num--) {
		fact*=num;
	}
	System.out.println("Factorial of the number is "+fact);
}
}
