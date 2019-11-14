package operatorsInJava;
import java.util.*;
public class ifelseifstatements {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the units consumed : ");
	int units=sc.nextInt();
	float charges;
	if(units<200) {charges = units * 0.5f;}
	else if(units>200&&units<400) {charges = 150 + (units-200)*0.65f; }
	else if(units>400&&units<600) {charges = 300 + (units-400)*0.85f; }
	else {charges = 500 + (units-600)*0.95f;}
	System.out.println("Charges for "+units+" consumed is "+charges);
}
}
