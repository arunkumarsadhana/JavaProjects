package threadsInJava;
class Theater extends Thread{
	String str;
	Theater(String str){
		this.str=str;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(str +" : "+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
public class MultiTasking {
public static void main(String args[]) {
	Theater per1=new Theater("Cut the Ticket");
	Theater per2=new Theater("Show the Seat");
	Thread t1=new Thread(per1);
	Thread t2=new Thread(per2);
	t1.start();
	t2.start();
}
}
