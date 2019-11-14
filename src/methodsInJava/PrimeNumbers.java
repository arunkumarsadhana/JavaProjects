package methodsInJava;
class Prime{
	static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {flag=false;}
		}
		return flag;
	}
	static void generate(int max) {
		int num=1;
		while(num<=max) {
			if(isPrime(num)) {
				System.out.print(num+"\t");
			}
			num++;
		}
	}
}
public class PrimeNumbers {
public static void main(String args[]) {
	Prime.generate(100);
}
}
