package arraysInJava;
import java.util.*;
public class LinearSearch {
public static void main(String args[]) {
	int arr[]= {81,72,63,32,45,92,24,54};
	int se,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the search element : ");
	se = sc.nextInt();
	for(i=0;i<arr.length;i++) {
		if(arr[i]==se) {
			System.out.println(se+" found at location "+(i+1));
			break;
		}
	}
	if(i==arr.length) {System.out.println("Element not found");}
}
}
