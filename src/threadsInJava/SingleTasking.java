package threadsInJava;
class MySingle implements Runnable{
	public void run() {
		task1();
		task2();
		task3();
		task4();
	}
	void task1() {System.out.println("Student 1 finished his work in 10 min");}
	void task2() {System.out.println("Student 2 finished his work in 10 min");}
	void task3() {System.out.println("Student 3 finished his work in 10 min");}
	void task4() {System.out.println("Student 4 finished his work in 10 min");}
}
public class SingleTasking {
public static void main(String args[]) {
	Thread t1=new Thread(new MySingle());
	t1.start();
}
}
