package threadsInJava;
class BookTicket extends Thread{
	Object train,comp;
	BookTicket(Object train,Object comp){
		this.train=train;
		this.comp=comp;
	}
	public void run() {
		synchronized(train) {
			System.out.println("BookTicket locked on train");
			try {
				Thread.sleep(150);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("BokTicket waiting to lock on compartment");
			synchronized(comp) {
				System.out.println("BookTicket locked on compartment");
			}
		}
	}
}
class CancelTicket extends Thread{
	Object train,comp;
	CancelTicket(Object train,Object comp){
		this.train=train;
		this.comp=comp;
	}
	public void run() {
		synchronized(train) {
			System.out.println("CancelTicket locked on train");
			try {
				Thread.sleep(200);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("CancelTicket now waiting to lock on compartment");
			synchronized(comp) {
				System.out.println("CancelTicket locked on compartment");
			}
		}
	}
}
public class DeadLock {
public static void main(String args[]) {
	Object train=new Object();
	Object comp=new Object();
	BookTicket obj1=new BookTicket(train,comp);
	CancelTicket obj2=new CancelTicket(train,comp);
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t1.start();
	t2.start();
}
}
