package operatorsInJava;
import java.util.*;
public class DecisionMakingStatements {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the age of the person : ");
	int age = sc.nextInt();
	if(age>=18) {
		System.out.println("Eligible to vote");
	}else {
		System.out.println("Not Eligible to vote");
	}
}
}
