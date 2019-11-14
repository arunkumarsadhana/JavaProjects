package exceptionsInJava;
import java.io.*;
class MyClass{
	String name;
	void getData() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the name : ");
		name = br.readLine();//this becomes checked Exception
	}
	void display() {
		System.out.println("Name : "+name);
	}
}
public class CheckedExceptions {
public static void main(String args[])throws IOException {
	MyClass mc=new MyClass();
	mc.getData();
	mc.display();
}
}
