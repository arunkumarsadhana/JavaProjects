package exceptionsInJava;

public class NumberFormatExceptionDemo {
public static void main(String args[]) {
	try {
	int num=Integer.parseInt("arun");
	System.out.println(num);
	}catch(NumberFormatException nfe) {
		System.out.println(nfe.getMessage());
	}
}
}
