package collectionsInJava;
class Test<T>{
	T t;
	public void setObject(T o) {
		t=o;
	}
	public Object getObject() {
		return t;
	}
}
public class GenericsInJava {
public static void main(String args[]) {
	Test<String> tst=new Test<String>();
	tst.setObject("Apple");
	System.out.println((String)tst.getObject());
}
}
