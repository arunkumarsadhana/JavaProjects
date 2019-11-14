package methodsInJava;
//Recursive methods are methods which call itself again and again
class NoRecursion{
	static long factorail(int num) {
		long fact=1;
		while(num>=1) {
			fact*=num;
			num--;
		}
		return fact;
	}
}
class Recursion{
	static long factorial(int num) {
		long fact=1;
		if(num==1)return 1;
		fact = num*factorial(num-1);
		return fact;
	}
}
public class RecursiceMethod {
public static void main(String args[]) {
	System.out.println(NoRecursion.factorail(5));
	System.out.println(Recursion.factorial(5));
}
}
