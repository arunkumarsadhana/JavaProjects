package oopsConceptInJava;
class Commercial1{
	private String name;
	public void setName(String name) {this.name=name;}
	public String getName() {return name;}
	public void calculateBill(int units) {
		System.out.println("Name of the customer : "+name);
		System.out.println("Charges for "+units+" cosumed is "+(units*4.50f));
	}
}
class Domestic1 extends Commercial1{
	public void calculateBill(int units) {
		System.out.println("Name of the customer : "+getName());
		System.out.println("Charges for "+units+" cosumed is "+(units*2.50f));
	}
}
public class EBCalculation {
public static void main(String args[]) {
	Commercial1 c1=new Commercial1();
	Domestic1 d1=new Domestic1();
	c1.setName("Arun Kumar");
	c1.calculateBill(500);
	d1.setName("Ravi Krishna");
	d1.calculateBill(500);
}
}
