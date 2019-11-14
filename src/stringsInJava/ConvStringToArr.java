package stringsInJava;

public class ConvStringToArr {
public static void main(String args[]) {
	String str="A book on java";
	char arr[]=new char[20];
	str.getChars(2,14,arr,7);
	for(char x:arr) {
		System.out.print(x);
	}
}
}
