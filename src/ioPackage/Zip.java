package ioPackage;
import java.io.*;
import java.util.zip.*;
public class Zip {
public static void main(String args[])throws IOException {
	FileInputStream fis = new FileInputStream("D:\\java-2019-03\\file\\mysecond.txt");
	FileOutputStream fos = new FileOutputStream("D:\\java-2019-03\\file\\myseccomp.txt");
	DeflaterOutputStream dos = new DeflaterOutputStream(fos);
	int data;
	while((data = fis.read())!=-1) {
		dos.write(data);
	}
	fis.close();
	dos.close();
	fis = new FileInputStream("D:\\java-2019-03\\file\\myseccomp.txt");
	fos = new FileOutputStream("D:\\java-2019-03\\file\\mysecdecomp.txt");
	InflaterInputStream iis = new InflaterInputStream(fis);
	while((data = iis.read())!=-1) {
		fos.write(data);
	}
	fos.close();
	iis.close();
}
}
