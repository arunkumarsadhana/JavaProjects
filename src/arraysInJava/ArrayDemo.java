package arraysInJava;
import java.util.*;
public class ArrayDemo {
public static void main(String args[]) {
	int arr[]= {10,20,30,40,50,60};
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
	int arr1[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("\nInput the elements of the array : ");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+"\t");
	}
}
}
