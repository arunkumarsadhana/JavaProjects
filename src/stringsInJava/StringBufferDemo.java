package stringsInJava;
import java.util.*;
public class StringBufferDemo {
public static void main(String args[]) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the first name of the person : ");
	String fname=sc.nextLine();
	System.out.println("Input the middle name of the person : ");
	String mname=sc.nextLine();
	System.out.println("Input the last name of the person : ");
	String lname=sc.nextLine();
	sb.append(fname);
	sb.append(lname);
	int len=fname.length();
	sb.insert(len, mname);
	System.out.println(sb);
	sb.delete(14, 19);
	System.out.println(sb);
}
}
