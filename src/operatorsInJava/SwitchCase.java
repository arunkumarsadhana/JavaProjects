package operatorsInJava;
import java.util.*;
public class SwitchCase {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the numbers in words : ");
	String num=sc.nextLine();
	switch(num) {
		case "one":
			System.out.println("1");
			break;
		case "two":
			System.out.println("2");
			break;
		case "three":
			System.out.println("3");
			break;
	}
}
}
