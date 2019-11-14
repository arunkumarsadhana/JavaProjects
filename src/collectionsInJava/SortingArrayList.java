package collectionsInJava;
import java.util.*;
public class SortingArrayList {
public static void main(String args[]) {
	ArrayList<Integer> alist=new ArrayList<Integer>();
	alist.add(15);
	alist.add(19);
	alist.add(6);
	alist.add(3);
	alist.add(11);
	System.out.println("Before soring ");
	for(Integer x:alist) {
		System.out.println((Integer)x);
	}
	System.out.println("After sorting in ascending order is");
	Collections.sort(alist);
	for(Integer x:alist) {
		System.out.println((Integer)x);
	}
	System.out.println("After sorting in descending order is");
	Collections.sort(alist,Collections.reverseOrder());
	for(Integer x:alist) {
		System.out.println((Integer)x);
	}
}
}
