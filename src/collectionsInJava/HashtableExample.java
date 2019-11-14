package collectionsInJava;
import java.util.*;
public class HashtableExample {
public static void main(String args[]) {
	Hashtable<Integer,String> htable=new Hashtable<Integer,String>();
	htable.put(1,"India");
	htable.put(2,"America");
	htable.put(3,"Australia");
	htable.put(4, "UK");
	int count=0;
	Enumeration e=htable.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		count++;//it is not fail fast
		if(count==2) {htable.put(5, "China");}
	}
	for(Map.Entry m:htable.entrySet()) {
		System.out.println(m.getKey()+" : "+m.getValue());
	}
}
}
