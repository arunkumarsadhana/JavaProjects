package methodsInJava;
import java.util.*;
import java.text.*;
public class FactoryMethodsInJava {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the radius of the circle : ");
	int r = sc.nextInt();
	double area = Math.PI*r*r;
	System.out.println("Area of the circle = "+area);
	NumberFormat nf=NumberFormat.getInstance();
	nf.setMaximumFractionDigits(2);
	nf.setMinimumIntegerDigits(3);
	String str=nf.format(area);
	System.out.println(str);
}
}
