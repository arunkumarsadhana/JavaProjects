package threadsInJava;
import java.util.*;
class Producer{
	public void produce() {
		synchronized(this) {
			System.out.println("Producer is producing the things");
			try {
				Thread.sleep(1000);
				wait();
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Producer thread resumed activities");
		}
	}
	public void consume() {
		synchronized(this) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press enter key");
			sc.next();
			notify();
		}
	}
}
public class InterThreadCommunication {
public static void main(String args[]) {
	Producer obj1=new Producer();
	Thread t1 = new Thread(()->{obj1.produce();});
	Thread t2 = new Thread(()->{obj1.consume();});
	t1.start();
	t2.start();
}
}
