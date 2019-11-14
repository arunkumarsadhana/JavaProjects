package collectionsInJava;
import java.util.*;
public class ArrayListInJava {
public static void main(String args[]) {
	ArrayList<String> alist=new ArrayList<String>();
	alist.add("Mango");
	alist.add("Orange");
	alist.add("Apple");
	alist.add("Bannana");
	alist.add("Apple");
	System.out.println(alist);
	alist.remove(2);
	System.out.println(alist);
	Iterator it=alist.iterator();
	int count = 0;
	while(it.hasNext()) {
		System.out.println((String)it.next());
		/*count++;
		if(count==2) {
			alist.add("Gauva");
		}*/
	}
	int i=alist.indexOf("Apple");
	System.out.println(i);
	System.out.println(alist.set(2, "Lemon"));
	System.out.println(alist);
	System.out.println(alist.get(2));
}
}
