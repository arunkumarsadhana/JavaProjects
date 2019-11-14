package methodsInJava;
class Example2{
	int i,j;
	static int k,l;
	{//instance block
		System.out.println("Inside block1");
		i=20;j=40;
	}
	{
		System.out.println("Inside block2");
		System.out.println("The value of i = "+i+" j = "+j);
	}
	static {//static block
		System.out.println("Inside static block1");
		k=40;l=60;
	}
	static {
		System.out.println("Inside static block2");
		System.out.println("The value of static variable k = "+k+" l = "+l);
	}
}
public class StaticBlockAndInstanceBlock {
public static void main(String args[]) {
	Example2 e1=new Example2();
	Example2 e2=new Example2();
}
}
