package oopsConceptInJava;
class One5{
	Two5 t4;
	One5(Two5 t4){
		this.t4=t4;
	}
	double cube(double x) {
		double result = x *t4.square(x);
		return result;
	}
}
class Two5{
	Three4 t4;
	Two5(Three4 t4){
		this.t4=t4;
	}
	double square(double x) {
		double result = x*t4.getX(x);
		return result;
	}
}
class Three4{
	double getX(double x) {
		return x;
	}
}
public class ObjectReferenceInJava {
public static void main(String args[]) {
	Three4 tr4=new Three4();
	Two5 tw4=new Two5(tr4);
	One5 o4=new One5(tw4);
	System.out.println(o4.cube(3));
}
}
