package oopsConceptInJava;
class Employee{
	private String name;  
	private int id;
	private float salary;
	public void setName(String name) {this.name=name;}
	public void setId(int id) {this.id=id;}
	public void setSalary(float salary) {this.salary=salary;}
	public String getName() {return name;}
	public int getId() {return id;}
	public float getSalary() {return salary;}
}
public class EncapsulationInJava {
public static void main(String args[]) {
	Employee e1=new Employee();
	e1.setName("Arun Kumar");
	e1.setId(1234);
	e1.setSalary(5600.67f);
	System.out.println("Name of the Employee : "+e1.getName());
	System.out.println("Id of the Employee   : "+e1.getId());
	System.out.println("Salary of the Employee : "+e1.getSalary()); 
}
}
