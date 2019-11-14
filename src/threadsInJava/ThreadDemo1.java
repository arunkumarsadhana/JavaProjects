package threadsInJava;
class MyThread implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running ");
	}
}
public class ThreadDemo1 {
public static void main(String args[]) {
	for(int i=0;i<5;i++) {
	Thread t1=new Thread(new MyThread());
	t1.setName("Thread : "+i);
	t1.start();
	System.out.println("Main thread running");
	}	
}
}
