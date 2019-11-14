package exceptionsInJava;
class UDException extends Exception{
	UDException(String str){
		super(str);
	}
	static int acc_num[]= {10041,10042,10043,10044,10045};
	static double balance[]= {10000,6000,8000,500,4500};
	static String name[]= {"Arun","Kumar","Ravi","Raju","Hari"};
}
public class CustomExcep { 
public static void main(String args[]) {
	System.out.println("Name \t"+"Account Number \t"+"Balance\t");
	try {
	for(int i=0;i<5;i++) {
System.out.println(UDException.name[i]+"\t"+UDException.acc_num[i]+"\t"+UDException.balance[i]);
	if(UDException.balance[i]<1000) {
		throw new UDException("Balance is less than 1000");
	}
	}
	}catch(UDException ud) {
		System.out.println(ud.getMessage());	
	}
}
}
