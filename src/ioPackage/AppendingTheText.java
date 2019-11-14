package ioPackage;
import java.io.*;
public class AppendingTheText {
public static void main(String args[])throws IOException {
	DataInputStream dis=new DataInputStream(System.in);
	FileOutputStream fos=new FileOutputStream("D:\\java-2019-03\\file\\mysecond.txt",true);
	BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
	System.out.println("Enter @ to stop writing to file");
	char ch;
	while((ch=(char)dis.read())!='@') {
		bos.write(ch);
	}
	bos.close();
	FileInputStream fis=new FileInputStream("D:\\java-2019-03\\file\\mysecond.txt");
	int ch1;
	while((ch1=fis.read())!=-1) {
		System.out.print((char)ch1);
	}
	fis.close();
}
}
