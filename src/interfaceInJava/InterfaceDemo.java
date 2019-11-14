package interfaceInJava;
interface DBConnect{
	void connect();//by default these methods are public abstract
	void disConnect();
}
class OracleDB implements DBConnect{
	public void connect() {
		System.out.println("Connecting to OracleDB.......");
	}
	public void disConnect() {
		System.out.println("Disconnecting from OracleDB.....");
	}
}
class SybaseDB implements DBConnect{
	public void connect() {
		System.out.println("Connecting to SybaseDB......");
	}
	public void disConnect() {
		System.out.println("Disconnecting from SybaseDB.....");
	}
}
public class InterfaceDemo {
public static void main(String args[])throws Exception {
	Class c=Class.forName("interfaceInJava.OracleDB");
	DBConnect db=(DBConnect)c.newInstance();
	db.connect();
	db.disConnect();
	c = Class.forName("interfaceInJava.SybaseDB");
	db=(DBConnect)c.newInstance();
	db.connect();
	db.disConnect();
}
}
