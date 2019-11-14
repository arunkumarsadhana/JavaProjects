package operatorsInJava;

public class TernaryOpertor {
public static void main(String args[]) {
	int a=10,b=15,c=30,d,e;
	d = a>b?a:b;
	e = a>b?(a>c?a:c):(b>c?b:c);
	System.out.println("Largest of two numbers is "+d);
	System.out.println("Largest of three numbers is "+e);
}
} 
