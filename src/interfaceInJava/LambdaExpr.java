package interfaceInJava;
interface FuncInter{
	void display();//only one abstract metahod
}
public class LambdaExpr {
public static void main(String args[]) {
	FuncInter fi=()->{System.out.println("Display method of interface execution");};
	fi.display();
}
}
