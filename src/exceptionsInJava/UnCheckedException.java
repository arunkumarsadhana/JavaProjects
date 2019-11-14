package exceptionsInJava;
import java.util.*;
public class UnCheckedException {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("File opened Successfully.....");
	try {
	int a,b,c;
	int arr[]= {10,20,30,40,50,60};
	System.out.println("Input the values of two numbers ");
	a=sc.nextInt();
	b=sc.nextInt();
	c = a/b;
	System.out.println("The value of c after division is "+c);
	System.out.println("The value of 7 th element of the array is "+arr[7]);
	System.out.println("File closed Successfully......");
	}catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae.getMessage());
	}
	finally {
		System.out.println("File closed Successfully......");
	}
}
}
