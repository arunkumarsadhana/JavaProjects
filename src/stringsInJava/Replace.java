package stringsInJava;

public class Replace {
public static void main(String args[]) {
	String str="Hello c,Hello c++,Hello Java";
	String rstr;
	rstr=str.replace('H', 'M');
	System.out.println(rstr);
	rstr=str.replace("Hello", "Hi");
	System.out.println(rstr);
	rstr=str.replaceFirst("Hello", "Hi");
	System.out.println(rstr);
	rstr=str.replaceAll("Hello", "Hi");
	System.out.println(rstr);
}
}
