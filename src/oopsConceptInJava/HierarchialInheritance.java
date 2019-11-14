package oopsConceptInJava;
import java.util.*;
class Numbers{
	int num1,num2;
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the two numbers : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
	}
}
class Addition extends Numbers{
	public void add() {
		System.out.println("Addition of two numbers is "+(num1+num2));
	}
}
class Subtraction extends Numbers{
	public void sub() {
		System.out.println("Subtraction of two numbers is "+(num1-num2));
	}
}
class Multiplication extends Numbers{
	public void mul() {
		System.out.println("Multiplication of two numbers is "+(num1*num2));
	}
}
public class HierarchialInheritance {
public static void main(String args[]) {
	Addition a1=new Addition();
	Subtraction s1=new Subtraction();
	Multiplication m1=new Multiplication();
	a1.getData();
	a1.add();
	s1.getData();
	s1.sub();
	m1.getData();
	m1.mul();
}
}
