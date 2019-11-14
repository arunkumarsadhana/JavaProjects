package oopsConceptInJava;
class Super{
	protected int x=10;
	private int y=20;
	public int getY() {return y;}
}
class Derived extends Super{
	public void display() {
		System.out.println("Variable x = "+x+" y = "+getY());
	}
}
public class ProtectedAccessModi {
public static void main(String args[]) {
	Derived d1=new Derived();
	d1.display();
}
}
