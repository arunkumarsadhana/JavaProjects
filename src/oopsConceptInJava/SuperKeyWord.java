package oopsConceptInJava;
class One1{
	int x;
	One1(int x){
		this.x=x;
	}
	public void show() {
		System.out.println("Base class variable x = "+x);
	}
}
class Two1 extends One1{
	int y;
	Two1(int x,int y){
		super(x);
		this.y=y;
	}
	public void show() {
		System.out.println("Derived class variable y = "+y);
		super.show();
		System.out.println("Super class variable x = "+super.x);
	}
}
public class SuperKeyWord {
public static void main(String args[]) {
	Two1 t1=new Two1(20,30);
	t1.show();
}
}
