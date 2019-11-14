package variablesInJava;

public class ThreadDemoExam {
public static void main(String args[]) {
	Runnable task1 = new Runnable() {
		public void run() {
			System.out.println(Thread.currentThread().getName()+" is running ");
		}
	};
	Runnable task2 = ()->{System.out.println(Thread.currentThread().getName()+" is running ");};
	Thread t1=new Thread(new Runnable() {
		public void run() {
			System.out.println(Thread.currentThread().getName()+" is running ");
		}
	});
	Thread t2=new Thread(task1);
	t1.start();
	t2.start();
	new Thread(task2).start();
}
}
