package stringsInJava;

public class CompOfString {
public static void main(String args[]) {
	String str1="Hello World";
	String str2=new String("Hello World");
	String str3="Hello World";
	String str4="hello world";
	if(str1==str2) {System.out.println("Both str1 and str2 are same");}
	else {System.out.println("Both str1 and str2 are not same");}
	if(str1==str3) {System.out.println("Both str1 and str3 are same");}
	else {System.out.println("Both str1 and str3 are not same");}
	if(str1.equalsIgnoreCase(str4)) {System.out.println("Both str1 and str4 are same");}
	else {System.out.println("Both str1 and str4 are not same");}
}
}
