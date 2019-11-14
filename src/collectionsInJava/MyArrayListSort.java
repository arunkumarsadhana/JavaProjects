package collectionsInJava;
import java.util.*;
public class MyArrayListSort {
public static void main(String args[]) {
	List<Employee4> list=new ArrayList<Employee4>();
	list.add(new Employee4("arun",6000));
	list.add(new Employee4("kumar",4000));
	list.add(new Employee4("ravi",5000));
	list.add(new Employee4("raju",4500));
	Collections.sort(list,new MySalaryComp());
	for(Employee4 e:list) {
		System.out.println(e);
	}
}
}
class MySalaryComp implements Comparator<Employee4>{
	public int compare(Employee4 e1,Employee4 e2) {
		if(e1.getSalary()<e2.getSalary()) {
			return 1;
		}else {
			return -1;
		}
	}
}
class Employee4{
	private String name;
	private int sal;
	Employee4(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	public int getSalary() {return sal;}
	public String toString() {
		return "[name = "+name+" ,salary = "+sal+"]";
	}
}
