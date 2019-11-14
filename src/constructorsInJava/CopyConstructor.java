package constructorsInJava;
class Complex{
	float real;
	float img;
	Complex(float r,float i){
		real=r;
		img=i;
	}
	Complex(Complex c){//copy constructor
		real = c.real;
		img= c.img;
	}
	public String toString() {
		return "( "+real+" +j "+img+" )";
	}
}
public class CopyConstructor {
public static void main(String args[]) {
	Complex c1=new Complex(20.54f,45.67f);
	Complex c2=new Complex(c1);
	System.out.println(c1);
	System.out.println(c2);
}
}
