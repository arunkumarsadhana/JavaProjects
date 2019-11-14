package collectionsInJava;
import java.util.*;
public class StackInJava {
public static void main(String args[]) {
	Stack<Integer> stck=new Stack<Integer>();
	int choice=0,ele,pos;
	Scanner sc=new Scanner(System.in);
	while(choice<4) {
		System.out.println("STACK OPERATIONS");
		System.out.println("1.Push an element");
		System.out.println("2.Pop an element");
		System.out.println("3.Search an elment");
		System.out.println("4.Exit");
		System.out.println("Select your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter an element");
			ele=sc.nextInt();
			stck.push(ele);
			break;
		case 2:
			Integer obj=stck.pop();
			System.out.println("Popped element = "+obj);
			break;
		case 3:
			System.out.println("Enter the element to be searched");
			ele = sc.nextInt();
			pos = stck.search(ele);
			if(pos == -1) {
				System.out.println("Element not found");
			}else {
				System.out.println("Element found at position "+pos);
			}
			break;
		case 4: 
			System.out.println("Exiting the application");
			System.exit(0);
		}
		System.out.println("Stack Contents is "+stck);
	}
}
}
