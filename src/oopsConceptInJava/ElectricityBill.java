package oopsConceptInJava;
class Plan{
	private String name;
	private float rate;
	public void setName(String name) {this.name=name;}
	public String  getName() {return name;}
	public void setRate(float rate) {this.rate=rate;}
	public float getRate() {return rate;}
	public void calculateBill(int units) {
		System.out.println("Name of the customer : "+name);
		System.out.println("charges for "+units+" consumed is "+(units*rate));
	}
}
class Commercial extends Plan{
	
}
class Domestic extends Plan{
	
}
public class ElectricityBill {
public static void main(String args[]) {
	Commercial c1=new Commercial();
	Domestic d1=new Domestic();
	c1.setName("Arun Kumar");
	c1.setRate(4.50f);
	d1.setName("Ravi krishna");
	d1.setRate(2.50f);
	c1.calculateBill(500);
	d1.calculateBill(500);
}
}
