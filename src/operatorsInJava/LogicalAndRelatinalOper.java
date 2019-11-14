package operatorsInJava;
public class LogicalAndRelatinalOper {
public static void main(String args[]) {
	int a=10,b=5;
	System.out.println("a>b = "+(a>b));
	System.out.println("a<b = "+(a<b));
	a=10;
	b=10;
	System.out.println("a>=b = "+(a>=b));
	System.out.println("a<=b = "+(a<=b));
	System.out.println("a==b = "+(a==b));
	System.out.println("a!=b = "+(a!=b));
	a=10;
	b=5;
	int c=15;
	System.out.println("a>b && b<c = "+(a>b&&b<c));
}
}
