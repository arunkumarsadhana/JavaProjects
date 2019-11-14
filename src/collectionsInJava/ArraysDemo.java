package collectionsInJava;
import java.util.*;
import java.io.*;
public class ArraysDemo {
public static void main(String args[])throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter an element : ");
		arr[i]=Integer.parseInt(br.readLine());
	} 
	System.out.println("Displaying the contents of the array : ");
	display(arr);
	Arrays.sort(arr);
	display(arr);
	System.out.println("Enter the element to be searched");
	int ele=Integer.parseInt(br.readLine());
	int index = Arrays.binarySearch(arr, ele);
	if(index<0) {System.out.println("Element not found");}
	else {System.out.println("Element found at location "+(index+1));}
}
static void display(int arr[]) {
	for(int x:arr) {
		System.out.println((int)x);
	}
}
}
