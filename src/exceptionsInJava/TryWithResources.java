package exceptionsInJava;
import java.io.*;
public class TryWithResources {
public static void main(String args[]) {
try(FileOutputStream fos=new FileOutputStream("D:\\java projects\\File\\third.txt")){
	String msg="Welcome to java tutorials you are learning Exception in java";
	byte bytearr[]=msg.getBytes();
	fos.write(bytearr);
	System.out.println("Message written successfully");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
try(FileInputStream fis=new FileInputStream("D:\\java projects\\File\\third.txt")){ 
	int ch;
	while((ch=fis.read())!=-1) {
		System.out.print((char)ch);
	}
}catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}
