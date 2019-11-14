package abstractClassInJava;
abstract class MyClass{//incomplete class
	abstract void calculate(double x);
}
class Square extends MyClass{//this becomes complete class
	void calculate(double x) {
		System.out.println("Square of x is "+(x*x));
	}
}
class Cube extends MyClass{
	void calculate(double x) {
		System.out.println("Cube of x is "+(x*x*x));
	}
}
class SquareRoot extends MyClass{
	void calculate(double x) {
		System.out.println("Square root of x is "+Math.sqrt(x));
	}
}
public class Demo {
public static void main(String args[]) {
	MyClass mc;
	mc = new Square();
	mc.calculate(3);
	mc = new Cube();
	mc.calculate(3);
	mc = new SquareRoot();
	mc.calculate(16);
}
}
