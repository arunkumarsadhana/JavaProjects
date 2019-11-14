package operatorsInJava;

public class AssignmentOperator {
public static void main(String args[]) {
	int a=10, b=15;
	a+=10;
	System.out.printf("a = %d\n",a);	
	a+=b+=5;
	System.out.printf("a = %d\nb = %d\n",a,b);
}
}
