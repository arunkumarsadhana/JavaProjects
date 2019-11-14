package threadsInJava; 
class Producer1 extends Thread{
	StringBuffer sb;
	Producer1(){
		sb=new StringBuffer();
	}
	public void run() {
		synchronized(sb) {
			for(int i=1;i<=10;i++) {
				try {
					sb.append(i+" : ");
					Thread.sleep(100);
					System.out.println("Appending");
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			sb.notify();
		}
	}
}
class Consumer extends Thread{
	Producer1 prod;
	Consumer(Producer1 prod){
		this.prod=prod;
	}
	public void run() {
		synchronized(prod.sb) {
			try {
				prod.sb.wait();
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(prod.sb);
		}
	}
}
public class InterThreadDemo {
public static void main(String args[]) {
	Producer1 obj1=new Producer1();
	Consumer obj2=new Consumer(obj1);
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	t2.start();
	t1.start();
}
}
