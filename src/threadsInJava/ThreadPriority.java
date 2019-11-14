package threadsInJava;
class Test extends Thread{
	int count=0;
	public void run() {
		for(int i=1;i<=10000;i++)count++;
System.out.println("Completed thread : "+Thread.currentThread().getName());
System.out.println("Its priority is "+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {
public static void main(String args[]) {
	Test obj1=new Test();
	Thread t1=new Thread(obj1,"One");
	Thread t2=new Thread(obj1,"Two");
	t1.setPriority(2);
	t2.setPriority(Thread.NORM_PRIORITY+2);
	t1.start();
	t2.start();
}
}
