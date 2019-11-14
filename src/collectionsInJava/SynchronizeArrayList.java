package collectionsInJava;
/*There are two ways to synchronize an array list
 * 1) by Collections.SynchronizedList();
 * 2) using thread safe variant of ArrayList : CopyOnWriteArrayList
 * from concurrency package
 */
import java.util.*;
import java.util.concurrent.*;
public class SynchronizeArrayList {
public static void main(String args[]) {
	/*List<String> li=Collections.synchronizedList(new ArrayList<String>());
	li.add("Apple");
	li.add("Orange");
	li.add("Bannana");
	li.add("Gauva");
	System.out.println("Printing ArrayList using iterator");
	synchronized(li) {
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}
	}*/
	CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<String>();
	al.add("Apple");
	al.add("Bannana");
	al.add("Orange");
	al.add("Lemon");
	al.add("Gauva");
	System.out.println("Displaying array list using iterator");
	Iterator it=al.iterator();
	while(it.hasNext()) {
		System.out.println((String)it.next());
	}
}
}
