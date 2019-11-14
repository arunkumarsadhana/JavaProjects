package methodsInJava;
class Example{
	int i=10;
	static int j=10;
}
public class DiffBWSAIVaria {
public static void main(String arg[]) {
	Example e1=new Example();
	Example e2=new Example();
	e1.i++;
	e2.i++;
	e1.j++;
	e2.j++;
	System.out.println("Instance variable e1.i = "+e1.i+" e2.i = "+e2.i);
	System.out.println("Static variable e1.j = "+e1.j+" e2.j = "+e2.j);
	
}
}
