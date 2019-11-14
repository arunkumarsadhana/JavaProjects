package exceptionsInJava;
class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}
public class CustomException {
public static void main(String args[]) {
	try {
		throw new MyException("User defined Exception MyException thrown");
	}catch(MyException me) {
		System.out.println(me.getMessage());
	}
}
}
