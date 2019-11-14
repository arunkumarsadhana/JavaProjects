package interfaceInJava;
interface Outer{
	 void show();
	 class Inner{
		 public void display() {
			 System.out.println("Inside inner class of interface");
		 }
	 }
}
class MainClass extends Outer.Inner implements Outer{
	public void show() {
		System.out.println("Method of interface implemented");
	}
}
public class ClassInsideInterface {
public static void main(String args[]) {
	MainClass mc=new MainClass();
	mc.display();
	mc.show();
}
}
