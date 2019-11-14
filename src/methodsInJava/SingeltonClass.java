package methodsInJava;
class Singleton{
	public String str=null;
	private static Singleton single_instance=null;
	private Singleton(){
		str="I'm part of singleton";
	}
	public static Singleton getInstance() {
		if(single_instance==null) {
			single_instance=new Singleton();
		}
		return single_instance;
	}
}
public class SingeltonClass {
public static void main(String args[]) {
	Singleton s1=Singleton.getInstance();
	System.out.println(s1.str);
	Singleton s2=Singleton.getInstance();
	s1.str=s1.str.toUpperCase();
	System.out.println(s1.str);
	System.out.println(s2.str);
}
}
