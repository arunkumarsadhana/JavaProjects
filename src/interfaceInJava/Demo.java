package interfaceInJava;
interface Vehicle{
	void speed(int incr);
	void brake(int decr);
	void changeGear(int gear);
	void printState();
}
class Bi_Cycle implements Vehicle{
	int speed=5;
	int gear=0;
	public void speed(int incr) {
		speed += incr;
	}
	public void brake(int decr) {
		speed -= decr;
	}
	public void changeGear(int gear) {
		this.gear=gear;
	}
	public void printState() {
		System.out.println("Bi cycles current Speed : "+speed+" Gear : "+gear);
	}
}
class MotorCycle implements Vehicle{
	int speed=10;
	int gear=0;
	public void speed(int incr) {
		speed += incr;
	}
	public void brake(int decr) {
		speed -= decr;
	}
	public void changeGear(int gear) {
		this.gear=gear;
	}
	public void printState() {
		System.out.println("Motor cycle current Speed : "+speed+" Gear : "+gear);
	}
}
public class Demo {
public static void main(String args[]) {
	Vehicle v;
	v = new Bi_Cycle();
	v.speed(10);
	v.brake(2);
	v.changeGear(2);
	v.printState();
	v = new MotorCycle();
	v.speed(15);
	v.brake(4);
	v.changeGear(2);
	v.printState();
}
}
