package abstractClassInJava;
abstract class Plan{
	protected double rate;
	abstract void setRate(double rate);
	public void calculateBill(int units) {
		System.out.println("charges for "+units+" consumed is "+(units*rate));
	}
}
class Commercial extends Plan{
	void setRate(double rate) { this.rate=rate;}
}
class Domestic extends Plan{
	void setRate(double rate) {this.rate=rate;}
}
public class ElectricityBill {
public static void main(String args[]) {
	Plan p;
	p =  new Commercial();
	p.setRate(5.60);
	p.calculateBill(500);
	p = new Domestic();
	p.setRate(3.60);
	p.calculateBill(500);
}
}
