package interfaceInJava;
interface FuncInterWA{
	int add(int a,int b);
}
public class FuncInterWithArg {
public static void main(String args[]) {
	FuncInterWA fi=(a,b)->{return (a+b);};
	System.out.println(fi.add(20, 30));
}
}
