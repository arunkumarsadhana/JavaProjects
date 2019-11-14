package ioPackage;
import java.io.*;
public class ViewingADirectory {
public static void main(String args[])throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter dir path : ");
	String dirPath=br.readLine();
	System.out.println("Enter the dir name : ");
	String dname=br.readLine();
	File f=new File(dirPath,dname);
	if(f.exists()) {
		String arr[]=f.list();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			File f1=new File(arr[i]);
			if(f1.isFile()) {System.out.println(": is a file ");}
			if(f1.isDirectory()) {System.out.println(": is a directory");}
		}
		System.out.println("No of entries in directory is "+n);
	}else {
		System.out.println("Directory does not exist");
	}
}
}
