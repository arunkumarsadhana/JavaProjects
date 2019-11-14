package objectClass;
class MyInteger{
	int x;
	MyInteger(int x){
		this.x=x;
	}
	public String toString() {
		return "("+x+")";
	}
}
public class ToStringMethod {
public static void main(String args[]) {
	MyInteger mi1=new MyInteger(15);
	MyInteger mi2=new MyInteger(15);
	Integer i1=new Integer(20);
	Integer i2=new Integer(20);
	System.out.println(mi1.hashCode());
	System.out.println(mi2.hashCode());
	System.out.println(mi1);
	System.out.println(mi2);
	if(mi1.equals(mi2)) {System.out.println("Both mi1 and mi2 are same");}
	else {System.out.println("Both mi1 and mi2 are not same");}
	if(i1.equals(i2)) {System.out.println("Both i1 and i2 are same");}
	else {System.out.println("Both i1 and i2 are not same");}
}
}
