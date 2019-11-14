package collectionsInJava;
import java.util.*;
public class HashSetInJava {
public static void main(String args[]) {
	HashSet<String> hset = new HashSet<String>();
	hset.add("Apple");
	hset.add("Orange");
	hset.add("Mango");
	hset.add("Bannana");
	hset.add("Apple");
	System.out.println(hset);
	System.out.println(hset.size());
	System.out.println(hset.remove("Apple"));
	System.out.println(hset);
	System.out.println(hset.contains("Orange"));
	Iterator it=hset.iterator();
	while(it.hasNext()) {
		System.out.println((String)it.next());
	}
	hset.clear();
	System.out.println(hset.isEmpty());
}
}
