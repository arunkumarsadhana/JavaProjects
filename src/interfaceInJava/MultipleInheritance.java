package interfaceInJava;
interface Father{
	float HT=6.1f;//by default variables are public static final
	void height();
	void bloodGroupF();
}
interface Mother{
	float HT=5.4f;
	void height();
	void bloodGroupM();
}
class Child implements Father,Mother{
	public void height() {
		float hgt=(Father.HT+Mother.HT)/2;
		System.out.println("Height of child is "+hgt);
	}
	public void bloodGroupF() {
		System.out.println("A+ve");
	}
	public void bloodGroupM() {
		System.out.println("B-ve");
	}
}
public class MultipleInheritance {
public static void main(String args[]) {
	Child c=new Child();
	c.height();
	c.bloodGroupF();
}
}
