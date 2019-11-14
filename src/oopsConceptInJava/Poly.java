package oopsConceptInJava;
class Number2{
	public void add(int a,int b) {
		System.out.println("Addition of two numbers = "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition of three numbers = "+(a+b+c));
	}
	public void add(float a,float b) {
		System.out.println("Addition of two float is "+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("Addition of int and float is "+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("Addition of float and int is "+(a+b));
	}
}
public class Poly {
public static void main(String args[]) {
	Number2 n1=new Number2();
	n1.add(10, 20);
	n1.add(10, 20,30);
	n1.add(10.54f, 20.54f);
	n1.add(20.54f,56);
	n1.add(23, 37.45f);
}
}
