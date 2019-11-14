package threadsInJava;
import java.io.*;
class MyClass extends Thread{
	boolean flag=false;
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println(i);
			try {
			Thread.sleep(500);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			if(flag)return;
		}
	}
}
public class ThreadDemo {
public static void main(String args[])throws IOException {
	MyClass obj=new MyClass();
	Thread t=new Thread(obj);
	t.start();
	System.in.read();
	obj.flag=true;
}
}
