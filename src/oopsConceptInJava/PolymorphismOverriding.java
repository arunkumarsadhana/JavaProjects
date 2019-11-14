package oopsConceptInJava;
class One2{
	void calculate(double x) {
		System.out.println("Square value = "+(x*x));
	}
}
class Two2 extends One2{
	void calculate(double x) {
		System.out.println("Square root of x = "+Math.sqrt(x));
	}
}
public class PolymorphismOverriding {
public static void main(String args[]) {
	Two2 t1=new Two2();
	One2 o1=new One2();
	t1.calculate(81);
	o1.calculate(3);
}
}
