package ioPackage;
import java.io.*;
public class FileReadingAndWriting {
public static void main(String args[]) {
	String str="This is a book on java\nAn Introduction to java\nBasic Progamming";
	try(FileWriter fw=new FileWriter("D:\\java-2019-03\\file\\test.txt");){
	for(int i=0;i<str.length();i++) {
		fw.write(str.charAt(i));
	}
	}catch(IOException ie) {
		ie.printStackTrace();
	}
	try(FileReader fr=new FileReader("D:\\java-2019-03\\file\\test.txt");){
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
	}catch(IOException ie) {
		ie.printStackTrace();
	}
}
}
