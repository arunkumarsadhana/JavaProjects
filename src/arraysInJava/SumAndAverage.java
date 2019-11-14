package arraysInJava;
import java.util.*;
public class SumAndAverage {
public static void main(String args[]) {
	int arr[]=new int[6];
	int sum=0;
	float avg;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the "+arr.length+" elements of the array : ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];//sum = sum + arr[i];
	}
	avg = (float)sum/arr.length;
	System.out.println("Sum = "+sum+" Average = "+avg);
}
}
