package collectionsInJava;
import java.util.*;
import java.io.*;
public class SerializeArrayList {
public static void main(String args[])throws Exception {
	ArrayList<String> alist=new ArrayList<String>();
	ArrayList<String> rlist=new ArrayList<String>();
	alist.add("Apple");
	alist.add("Orange");
	alist.add("Gauva");
	alist.add("Grapes");
	alist.add("Lemon");
	FileOutputStream fos=new FileOutputStream("D:\\java projects\\File\\seria.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(alist);
	oos.close();
	FileInputStream fis=new FileInputStream("D:\\java projects\\File\\seria.txt");
	ObjectInputStream iis=new ObjectInputStream(fis);
	rlist = (ArrayList)iis.readObject();
	for(String x:rlist) {
		System.out.println((String)x);
	}
}
}
