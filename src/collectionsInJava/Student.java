package collectionsInJava;

public class Student implements Comparable {
private String name;
private int id;
private int age;
Student(String name,int id,int age){
	this.name=name;
	this.id=id;
	this.age=age;
}
public int getAge() {return age;}
@Override
public int compareTo(Object o) {
	int sage=((Student)o).getAge();
	return sage-this.age;
}
public String toString() {
	return "[ name = "+name+", age = "+age+", id = "+id+"]";
}
}