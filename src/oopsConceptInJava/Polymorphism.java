package oopsConceptInJava;
//static method does not come under overriding though parent class and child class
//has same static method it does not come under overriding static methods can
//only be overloaded
class One3{
	static void calculate(double x) {
		System.out.println("Square value = "+(x*x));
	}
}
class Two3 extends One3{
	static void calculate(double x) {
		System.out.println("Square root of x is "+Math.sqrt(x));
	}
}
public class Polymorphism {
public static void main(String args[]) {
	One3.calculate(3);
	Two3.calculate(81);
}
}
