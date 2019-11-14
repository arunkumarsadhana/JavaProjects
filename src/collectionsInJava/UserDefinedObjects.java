package collectionsInJava;
import java.util.*;
class Employee{
	String name;
	int id;
	float sal;
	Employee(String name,int id,float sal){
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Name of the Employee : "+name);
		System.out.println("Id of the Employee : "+id);
		System.out.println("Salary of the Employee : "+sal);
	}
}
public class UserDefinedObjects {
public static void main(String args[]) {
	Employee e1=new Employee("Arun",123,5600.76f);
	Employee e2=new Employee("Raju",145,6789.98f);
	Employee e3=new Employee("Ravi",456,7898.98f);
	HashSet<Employee> hset = new HashSet<Employee>();
	hset.add(e1);
	hset.add(e2);
	hset.add(e3);
	Iterator it=hset.iterator();
	while(it.hasNext()) {
		((Employee)it.next()).display();
	}
}
}
