package interfaceInJava;
import java.util.*;
interface InterPrinter{
	void connect();
	void printText(String text);
	void disConnect();
}
class HPPrinter implements InterPrinter{
	public void connect() {
		System.out.println("Connecting to HP Printer.......");
	}
	public void printText(String text) {
		System.out.println("Printing "+text);
	}
	public void disConnect() {
		System.out.println("Disconnecting from HP Printer......");
	}
}
class EpsonPrinter implements InterPrinter{
	public void connect() {
		System.out.println("Connecting to Epson Printer.......");
	}
	public void printText(String text) {
		System.out.println("Printing "+text);
	}
	public void disConnect() {
		System.out.println("Disconnecting from Epson Printer......");
	}
}
public class Printer {
public static void main(String args[])throws Exception {
	InterPrinter i;
	System.out.println("Input the name of the printer class to connect");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	Class c=Class.forName(str);
	i = (InterPrinter)c.newInstance();
	i.connect();
	i.printText("This is a test page");
	i.disConnect();
}
}
