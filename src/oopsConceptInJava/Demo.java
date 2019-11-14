package oopsConceptInJava;
class Shape{
	protected double l;
	Shape(double l){
		this.l=l;
	}
}
class Rectangle extends Shape{
	double b;
	Rectangle(double l,double b){
		super(l);
		this.b=b;
	}
	public void area() {
		System.out.println("Area of Rectangle = "+(l*b));
	}
}
class Square extends Shape{
	Square(double l){
		super(l);
	}
	public void area() {
		System.out.println("Area of Square = "+(l*l));
	}
}
public class Demo {
public static void main(String args[]) {
	Rectangle r1=new Rectangle(10,20);
	r1.area();
	Square s1=new Square(10);
	s1.area();
}
}
