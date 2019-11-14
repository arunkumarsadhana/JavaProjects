package oopsConceptInJava;
class Teacher{//super class or base class
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
class Student extends Teacher{//subclass or derived class
	private float per;
	public void setPer(float per) {this.per=per;}
	public float getPer() {return per;}
}
public class InheritanceInJava {
public static void main(String args[]) {
	Student s1=new Student();
	s1.setName("ArunKumar");
	s1.setId(1234);
	s1.setPer(67.78f);
	System.out.println("Name of the student : "+s1.getName());
	System.out.println("Id of the student : "+s1.getId());
	System.out.println("Percentage of the student : "+s1.getPer());
}
}
 