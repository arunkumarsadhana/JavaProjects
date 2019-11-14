package operatorsInJava;
import java.util.*;
public class DivisionOperator {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the two values : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	float c = (float)a/b;//hlere we go for typecasting to get the correct result
	int d = a%b;
	System.out.println("Division of two numbers is "+c);
	System.out.println("Modulus of two numbers is "+d);
}
}
