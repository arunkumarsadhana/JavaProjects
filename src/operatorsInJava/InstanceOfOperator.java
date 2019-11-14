package operatorsInJava;

public class InstanceOfOperator {
public static void main(String args[]) {
	String str="Naresh";
	Integer in=new Integer(15);
	boolean a = str instanceof String;
	boolean b = in instanceof Integer;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
}
}
