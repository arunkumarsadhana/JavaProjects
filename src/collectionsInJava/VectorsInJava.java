package collectionsInJava;
import java.util.*;
public class VectorsInJava {
public static void main(String args[]) {
	Vector<String> vct=new Vector<String>();
	vct.add("Apple");
	vct.add("Bananna");
	vct.add("Orange");
	vct.add("Gauva");
	System.out.println(vct);
	vct.set(2, "Lemon");
	int count=0;
	Enumeration enm=vct.elements();
	while(enm.hasMoreElements()) {
		System.out.println((String)enm.nextElement());
		count++;
		if(count==1) {vct.add("Grapes");}
		//enumeartion in vectors is not fail fast since it allows
		//modification during iteration
	}
	System.out.println("Displaying elements in forward direction");
	ListIterator li=vct.listIterator();
	while(li.hasNext()) {
		System.out.println((String)li.next());
	}
	System.out.println("Displaying elements in reverse direction");
	while(li.hasPrevious()) {
		System.out.println((String)li.previous());
	}
}
}
