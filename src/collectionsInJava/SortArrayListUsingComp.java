package collectionsInJava;
import java.util.*;
public class SortArrayListUsingComp {
public static void main(String args[]) {
	Student s1=new Student("arun",123,28);
	Student s2=new Student("kumar",121,22);
	Student s3=new Student("ravi",125,29);
	Student s4=new Student("raju",129,21);
	ArrayList<Student> alist=new ArrayList<Student>();
	alist.add(s1);
	alist.add(s2);
	alist.add(s3);
	alist.add(s4);
	Collections.sort(alist);
	for(Student x:alist) {
		System.out.println((Student)x);
	}
}
}
