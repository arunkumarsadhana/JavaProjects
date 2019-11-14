package stringsInJava;

public class StringDemo {
public static void main(String args[]) {
	String str1="Hello world";
	String str2=new String("Hello world");
	char arr[]= {'H','e','l','l','o',' ','w','o','r','l','d'};
	String str3=new String(arr);
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
}
}
