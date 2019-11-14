package abstractClassInJava;
//with abstract class we give 50% abstraction only
//why 50% abstraction only means abstract class not only contains
//abstract but methods with definition also(Concrete methods) and also
//though we cannot create an instance for an abstract class still it can contain
//instance method, instance variable and constructor
abstract class Shape{
	int x;
	Shape(int x){
		this.x=x;
	}
	void show() {
		System.out.println("The value of x is "+x);
	}
	abstract void draw();
}
class Rectangle extends Shape{
	Rectangle(int x){
		super(x);
	}
	void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Square1 extends Shape{
	Square1(int x){
		super(x);
	}
	void draw() {
		System.out.println("Drawing square");
	}
}
public class Abstraction {
public static void main(String args[]) {
	Shape s;
	s = new Rectangle(10);
	s.show();
	s.draw();
	s = new Square1(40);
	s.show();
	s.draw();
}
}
