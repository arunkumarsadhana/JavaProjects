package castingOfObjects;
class One{
	void show1() { 
		System.out.println("Inside super class");
	}
}
class Two extends One{
	void show1() {
		System.out.println("Inside sub class");
	}
}
public class UpCasting {
public static void main(String args[]) {
	One o=new Two();//sub class casted to super class this is widening
	o.show1();//here we will get 50% functionality only upcasting
}
}
