package interfaceInJava;
class Employee implements Cloneable{
	String name;
	int id;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("Name  :  "+name);
		System.out.println("Id    :  "+id);
	}
	public Object myClone()throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CloneDemo {
public static void main(String args[])throws CloneNotSupportedException {
	Employee e1=new Employee(124,"arun");
	Employee e2=(Employee)e1.myClone();
	e1.display();
	e2.display();
	e2.name="Kumar";
	e1.display();
	e2.display();
}
}
