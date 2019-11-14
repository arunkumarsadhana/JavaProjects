package methodsInJava; 
import java.util.*;
class Matrix{
	int row,col;
	int[] arr[];
	Matrix(int row,int col){
		this.row=row;
		this.col=col;
		arr = new int[row][col];
	}
	int[][] getMatrix(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the array elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	int[][] addMatrix(int a[][],int b[][]){
		int[] sum[]=new int[row][col];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}
	void display(int a[][]) {
		System.out.println("--------RESULTANT ARRAY IS----------");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
public class MethodsWithTDArray {
public static void main(String args[]) {
	Matrix mat=new Matrix(3,3);
	int[] x[]=mat.getMatrix();
	int[] y[]=mat.getMatrix();
	int[][] z=mat.addMatrix(x, y);
	mat.display(z);
}
}
