package collectionsInJava;
import java.util.*;
public class QueueInJava {
public static void main(String args[]) {
	Queue<Integer> q=new LinkedList<Integer>();
	Integer arr[]= {10,20,30,40,50,60};
	for(int i=0;i<arr.length;i++) {
		q.add(arr[i]);
	}
	System.out.println("Elements of queue are "+q);
	System.out.println(q.remove(60));
	System.out.println("Elements of queue are "+q);
	System.out.println("Head of the queue is "+q.peek());
	System.out.println("Elements of queue are "+q);
	System.out.println("Size of queue is "+q.size());
	System.out.println(q.poll());
	System.out.println("Elements of queue are "+q);
}
}
