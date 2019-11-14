package interfaceInJava;
import java.io.*;
class Student implements Serializable{
	String name;
	int id;
	float per;
	Student(String name,int id,float per){
		this.name=name;
		this.id=id;
		this.per=per;
	}
	public void display() {
		System.out.println("Name of the Student : "+name);
		System.out.println("ID of the Student : "+id);
		System.out.println("Percentage of the Student : "+per);
	}
}
public class SerialDemo {
public static void main(String args[])throws Exception {
	Student s1=new Student("arun",201924,67.78f);
	FileOutputStream fos=new FileOutputStream("D:\\java projects\\File\\serial.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s1);
	FileInputStream fis=new FileInputStream("D:\\java projects\\File\\serial.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student s2=(Student)ois.readObject();
	s2.display();
}
}
