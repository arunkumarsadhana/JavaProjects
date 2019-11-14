package castingOfObjects;
class MyClass{
	int x;
	MyClass(int x){
		this.x=x;
	}
}
class KnowName{
	static void printName(Object obj) {
		Class c = obj.getClass();
		String name = c.getName();
		System.out.println("Name of the class : "+name);
	}
}
public class Demo {
public static void main(String args[]) {
	MyClass mc=new MyClass(15);
	Integer i1=new Integer(20);
	String str="Hello world";
	KnowName.printName(mc);
	KnowName.printName(i1);
	KnowName.printName(str);
}
}
