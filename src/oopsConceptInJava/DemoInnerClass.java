package oopsConceptInJava;
class Outer{
	int arr[]= {10,11,12,13,14,15,16,17,18};
	private class Inner{
		void even_odd() {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {System.out.println("Even number = "+arr[i]);}
				else {System.out.println("Odd number = "+arr[i]);}
			}
		}
	}
	public void innerClassInst() {
		Inner in=new Inner();
		in.even_odd();
	}
}
public class DemoInnerClass {
public static void main(String args[]) {
	Outer o1=new Outer();
	o1.innerClassInst();
}
}
