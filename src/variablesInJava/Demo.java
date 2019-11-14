package variablesInJava;

public class Demo {
int i=10;//instance variable also contains default values if unintialized
static float f=50.45f;//static/class variable it contains default values if unitialized
public static void main(String args[]) {
	boolean flag=true;//local variable must be intialized when declared
	//it cotains no default values
	System.out.println("Value of local variable is "+flag);
	System.out.println("Value of static varaible is "+Demo.f);
	Demo d1=new Demo();
	System.out.println("Value of instance varaible is "+d1.i);
}
}
