package methodsInJava;
import java.util.*;
class Sort{
	int arr[];
	int noe;
	Sort(int noe){
		this.noe=noe;
	}
	int[] getList(){
		arr = new int[noe];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the "+noe+" elements of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	void sortArray(int b[]){
		boolean flag=false;
		for(int i=0;i<b.length-1;i++) {
			for(int j=0;j<b.length-1;j++) {
				if(b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					flag=true;
				}
			}
			if(flag) {flag=false;}
			else break;
		}
	}
	void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
public class MethodsWithArray {
public static void main(String args[]) {
	Sort obj=new Sort(8);
	int[] x=obj.getList();
	obj.sortArray(x);
	obj.display(x);
}
}
