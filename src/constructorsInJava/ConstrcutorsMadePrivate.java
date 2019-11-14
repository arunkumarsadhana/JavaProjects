package constructorsInJava;
class Singleton{
	String str="I'm Part of Singleton";
	private static Singleton s1=null;
	private Singleton(){
		
	}
	public static Singleton getInstance() {
		if(s1 == null) {
			s1 = new Singleton();
		}
		return s1;
	}
}
public class ConstrcutorsMadePrivate {
public static void main(String args[]) {
	Singleton s1=Singleton.getInstance();
	System.out.println(s1.str);
	Singleton s2 = Singleton.getInstance();
	s2.str=s2.str.toUpperCase();
	System.out.println(s2.str);
	System.out.println(s1.str);
}
}
