package exceptionsInJava;

public class NullPointerDemo {
public static void main(String args[]) {
	try {
		String str=null;
		System.out.println(str.charAt(0));
	}catch(NullPointerException ne) {
		System.out.println("String is having null data");
	}
}
}
