package methodsInJava;
class Test{
	int x=10;
	static int y=20;
	void display() {
		System.out.println("Instance variable x = "+x+" static y = "+y);
	}
	static void show() {//inside static method we cannot access
		//instance variable directly we have to create instance
		//but static variable can be accessed directly within static method
		System.out.println(" static y = "+y);
	}
}
public class StaticMethods {
public static void main(String args[]) {
	Test t1=new Test();
	t1.display();
	Test.show();
}
}
