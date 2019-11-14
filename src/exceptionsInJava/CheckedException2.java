package exceptionsInJava;
import java.io.*;

public class CheckedException2 {
public static void main(String args[]) throws IOException{
	FileInputStream fis=new FileInputStream("D:\\java projects\\File\\second.txt");
	int ch;
	while((ch=fis.read())!=-1) {
		System.out.print((char)ch);
	}
	fis.close();
}
}
