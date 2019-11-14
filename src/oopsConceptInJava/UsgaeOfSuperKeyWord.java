package oopsConceptInJava;
class One{
	int x;
	One(int x){
		System.out.println("Base class constructor");
		x=10;
	}
}
class Two extends One{
	int y;
	Two(int x,int y){
		super(x);//super keyword should be used first to call the super class
		//constructor then write executable statements for derived class
		System.out.println("Derived Class Constructor");
	}
}
public class UsgaeOfSuperKeyWord {
public static void main(String args[]) {
	Two t1=new Two(10,20);
}
}
