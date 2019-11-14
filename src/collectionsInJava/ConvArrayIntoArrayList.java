package collectionsInJava;
import java.util.*;
public class ConvArrayIntoArrayList {
public static void main(String args[]) {
	String arr[]= {"Apple","Mango","Bannana","Grape"};
	ArrayList<String> alist =new ArrayList<String>(Arrays.asList(arr));
	System.out.println(alist);
	alist.set(1, "Lemon");
	alist.add("Gauva");
	for(String x:alist) {
		System.out.println((String)x);
	}
}
}
