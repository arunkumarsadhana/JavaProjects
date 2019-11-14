package castingOfObjects;
class One1{
	void show1() {
		System.out.println("Inside super class");
	}
}
class Two1 extends One1{
	void show2() {
		System.out.println("Inside sub class");
	}
}
public class DownCasting {
public static void main(String args[]) {
	//the first method is the correct method
	/*Two1 t1=(Two1)new One1();
	//downloading or specialisation or narrowing
	//where super class casted to subclass
	//by this we will get only 0% functionality
	t1.show1();
	t1.show2();*/
	//second method gives 100% functionality
	One1 o1;
	o1 = new Two1();
	Two1 t1=(Two1)o1;
	t1.show1();
	t1.show2();//this step will provide 100% functionality
}
}
