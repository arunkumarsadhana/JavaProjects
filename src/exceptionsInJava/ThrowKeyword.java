package exceptionsInJava;
class Test{
	public static void demo() {
		try {
			String str=null;
			throw new NullPointerException();
		}catch(NullPointerException npe) {
			System.out.println("NullpointerException caught "+npe.getMessage());
		}
	}
}
public class ThrowKeyword {
public static void main(String args[]) {
	Test.demo();
}
}
