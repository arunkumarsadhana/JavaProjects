package threadsInJava;
class Sender{
	public synchronized void send(String msg) {
		System.out.println("Sending "+msg);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {ie.printStackTrace();}
		System.out.println(msg+" sent ");
	}
} 
class ThreadSend extends Thread{
	String msg;
	Sender obj;
	ThreadSend(String m,Sender obj){
		msg=m;
		this.obj=obj;
	}
	public void run() {
		obj.send(msg);
	}
}
public class SynchMethod {
public static void main(String args[]) {
	Sender snd=new Sender();
	ThreadSend ts1=new ThreadSend("Hi",snd);
	ThreadSend ts2=new ThreadSend("Bye",snd);
	ts1.start();
	ts2.start();
}
}
