package arraysInJava;

public class JaggedArray {
public static void main(String args[]) {
	int arr[][]= {
						{10,20,30},
						{40,50,60}
				   };
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.print("\n");
	}
	int arr1[][]={
					{10,20,30,40},
					{50,60},
					{70,80,90}
	   			};
	System.out.print("\n");
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+"\t");
		}
		System.out.print("\n");
	}
}
}
