package arraysInJava;

public class BubbleSort {
public static void main(String args[]) {
	int arr[]= {81,62,75,92,11,14,23,34};
	boolean flag=false;
	for(int i=0;i<arr.length-1;i++) {
		System.out.println((i+1)+" pass ");
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag =true;
			}
		}
		if(flag) {flag=false;}
		else {break;}
	}
	System.out.println("--------SORTED ARRAY IS------------");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
}
}
