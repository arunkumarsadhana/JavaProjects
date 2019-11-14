package stringsInJava;
import java.util.*;
public class Palindrome {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a string : ");
	String str=sc.nextLine();
	StringBuffer sb=new StringBuffer(str);
	String str1=sb.reverse().toString();
	if(str1.equalsIgnoreCase(str)) {
		System.out.println("The string is Palindrome");
	}else {
		System.out.println("Not a Palindrome");
	}
}
}
