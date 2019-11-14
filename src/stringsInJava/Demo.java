package stringsInJava;

public class Demo {
public static void main(String args[]) {
	String str1="An introduction to java";
	String str2=new String("   Java Tutorials i like it");
char arr[]= {'D','r','e','a','m',' ','t','e','c','h',' ','P','r','e','s','s'};
	String str3=new String(arr);
	System.out.println(str1);
	System.out.println(str1.length());
	System.out.println(str2.length());
	System.out.println(str3.length());
	System.out.println(str1+" by "+str3);
	System.out.println(str1.concat(str3));
	System.out.println(str1.charAt(4));
	boolean x=str1.startsWith("An");
	System.out.println(x);
	String p = str1.substring(3,23);
	String q = str2.substring(15,24);
	System.out.println(p.concat(q));
	int i = str1.indexOf('n');
	int j = str1.indexOf('n',i+2);
	int k = str1.lastIndexOf('n');
	System.out.println(k);
	System.out.println(str1.toLowerCase());
	System.out.println(str2.toUpperCase().trim());
}
}
