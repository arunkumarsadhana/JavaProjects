package arraysInJava;

public class LargestAndSmallest {
public static void main(String args[]) {
	int arr[]= {81,62,75,92,11,14,23,34};
	int le = arr[0];
	int se = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>le) {le=arr[i];}
		if(arr[i]<se) {se=arr[i];}
	}
System.out.println("Largest Element = "+le+" Smallest Element = "+se);
}
}
