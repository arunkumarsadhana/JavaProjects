package exceptionsInJava;

public class SIOFBDemo {
public static void main(String args[]) {
    try {
	String str="Hello How are you";
	System.out.println("Length of the string is "+str.length());
	System.out.println(str.charAt(30));
    }catch(StringIndexOutOfBoundsException sioe) {
    	System.out.println("Specify the correct position of char in string");
    }
}
}
