package interfaceInJava;
import java.io.*;
class Faculty implements Serializable{ 
	static int a;
	transient int b;
	String name;
	int age;
    Faculty(String name,int age,int a,int b){
		this.name=name;
		this.age=age;
		this.a=a;
		this.b=b;
	}	
}
public class SerialiationWithStatic {	
	public static void printData(Faculty obj) {
		System.out.println("Name of the Employee : "+obj.name);
		System.out.println("Age of the Employee : "+obj.age);
		System.out.println("static variable a = "+obj.a);
		System.out.println("transient variable b = "+obj.b);
	}
public static void main(String args[]) {
	Faculty obje = new Faculty("arun",24,13,23);
	try {
		FileOutputStream fos=new FileOutputStream("D:\\java projects\\File\\emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obje);
		fos.close();
		oos.close();
		System.out.println("Before serialization the data is ");
		printData(obje);
	}catch(IOException ie) {
		System.out.println("IOException is caught");
	}
	obje.a=40;
	obje.name="kumar";
	obje=null;
	try {
		FileInputStream fis=new FileInputStream("D:\\java projects\\File\\emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		obje=(Faculty)ois.readObject();
		fis.close();
		ois.close();
		System.out.println("After serialization the data is ");
		printData(obje);
	}catch(IOException ie) {
		System.out.println("IOException is caught");
	}catch(ClassNotFoundException cne) {
		System.out.println("Unable to catch proper class");
	}
	}
}

