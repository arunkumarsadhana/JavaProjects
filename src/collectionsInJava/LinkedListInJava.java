package collectionsInJava;
import java.util.*;
public class LinkedListInJava {
public static void main(String args[]) {
	LinkedList<String> llist=new LinkedList<String>();
	llist.add("Item1");
	llist.add("Item2");
	llist.add("Item3");
	llist.add("Item4");
	System.out.println(llist);
	String str=llist.get(2);
	System.out.println(str);
	llist.set(1, "Item1.5");
	llist.add(2,"Item2");
	System.out.println(llist);
	llist.addFirst("Item0");
	llist.addLast("Item5");
	System.out.println(llist);
	llist.removeLast();
	System.out.println(llist);
	Iterator it=llist.iterator();
	while(it.hasNext()) {
		System.out.println((String)it.next());
	}
}
}
