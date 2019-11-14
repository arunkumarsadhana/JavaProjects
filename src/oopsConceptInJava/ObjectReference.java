package oopsConceptInJava;
class One4{
	int x;
	Two4 t;//Object reference
	One4(Two4 t,int x){
		this.t=t;
		this.x=x;
	}
	void display() {
		System.out.println("One's variable x = "+x);
		t.display();
		System.out.println("Two's variable inside One is "+t.y);
	}
}
class Two4{
	int y;
	Two4(int y){
		this.y=y;
	}
	void display() {
		System.out.println("Two's variable y = "+y);
	}
}
public class ObjectReference {
public static void main(String args[]) {
	Two4 t1=new Two4(20);
	One4 o1=new One4(t1,40);
	o1.display();
}
}
