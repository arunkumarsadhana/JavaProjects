package constructorsInJava;
class Employee{
	String name;//instance variable
	int id;
	float salary;
	Employee(){	}//default constructor
	Employee(String str,int a,float b){//we have parameterized constructor
		name=str;
		id=a;
		salary=b;
	}
}
public class DefaultConstrcutor {
public static void main(String args[]) {
	Employee e1=new Employee();//default constructor automatically called
	//when there are no constructors in the classs JVM creates a default
	//constructor and assings all variables to default values if
	//uninitialized
	System.out.println("Name   "+e1.name);
	System.out.println("ID     "+e1.id);
	System.out.println("Salary "+e1.salary);
	Employee e2=new Employee("arun",145,6780.78f);
	System.out.println("Name   "+e2.name);
	System.out.println("ID     "+e2.id);
	System.out.println("Salary "+e2.salary);
}
}
