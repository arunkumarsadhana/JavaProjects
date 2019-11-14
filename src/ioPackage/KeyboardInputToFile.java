package ioPackage;
import java.io.*;
public class KeyboardInputToFile {
public static void main(String args[])throws IOException {
	DataInputStream dis=new DataInputStream(System.in);
	FileOutputStream fos=new FileOutputStream("D:\\java-2019-03\\file\\myfirst.txt");
	System.out.println("Enter character @ to end the file writing");
	char ch;
	while((ch=(char)dis.read())!='@') {
		fos.write(ch);
	}
	fos.close();
	FileInputStream fis=new FileInputStream("D:\\java-2019-03\\file\\myfirst.txt");
	int ch1;
	while((ch1=fis.read())!=-1) {
		System.out.print((char)ch1);
	}
	fis.close();
}
}
