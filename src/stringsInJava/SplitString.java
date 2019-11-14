package stringsInJava;

public class SplitString {
public static void main(String args[]) {
	String str1="An introduction to java";
	String str2="a/b/c/d";
	String a[]=str1.split(" ");
	for(String x:a) {
		System.out.println(x);
	}
	String b[]=str2.split("/",3);
	for(String x:b) {
		System.out.println(x);
	}
}
} 
