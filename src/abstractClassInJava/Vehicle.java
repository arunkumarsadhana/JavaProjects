package abstractClassInJava;
abstract class Car{
	int regNo;
	Car(int regNo){
		this.regNo=regNo;
	}
	void fuelTank() {
		System.out.println("Unlock the tank fill it with fuel and lock it");
	}
	abstract void steering();
	abstract void braking();
}
class Maruti extends Car{
	Maruti(int regNo){
		super(regNo);
	}
	void steering() {
		System.out.println("Maruti has power steering");
	}	
	void braking() {
		System.out.println("Maruti has gas braking");
	}
}
class Santro extends Car{
	Santro(int regNo){
		super(regNo);
	}
	void steering() {
		System.out.println("Santro has manual steering");
	}
	void braking() {
		System.out.println("Santro has hydraulic braking");
	}
}
public class Vehicle {
public static void main(String args[]) {
	Car c;//instance not possible for abstract class but it can have constructor
	//instance variable and concrete methods
	c = new Maruti(4231);
	c.fuelTank();
	c.steering();
	c.braking();
	c=new Santro(6745);
	c.fuelTank();
	c.steering();
	c.braking();
	
}
}
