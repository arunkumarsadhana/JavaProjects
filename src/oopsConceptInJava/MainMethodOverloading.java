package oopsConceptInJava;

public class MainMethodOverloading {
public static void main(String args[]) {
	System.out.println("JVM executes main method with string args as argument");
	main();
	main(10,20);
}
public static void main() {
	System.out.println("main method without argments executed");
}
public static void main(int a,int b) {
	System.out.println("main method with arguments = "+(a+b));
}
}
