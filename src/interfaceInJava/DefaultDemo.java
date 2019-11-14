package interfaceInJava;
interface MyInter{
	void add(int x,int y);
	default void divide(int x,int y) {
		float res=(float)x/y;
		System.out.println("Division of x and y is "+res);
	}
	static void display() {
		System.out.println("Inside static method of interface");
	}
}
class ImplClass implements MyInter{
	public void add(int x,int y) {
		System.out.println("Addition of two numbers is "+(x+y));
	}
}
public class DefaultDemo {
public static void main(String args[]) {
	MyInter mi;
	mi = new ImplClass();
	mi.add(10, 20);
	mi.divide(300, 20);
	MyInter.display();
}
}
