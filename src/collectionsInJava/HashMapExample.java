package collectionsInJava;
import java.util.*;
public class HashMapExample {
public static void main(String args[]) {
	HashMap<String,Integer> hmap=new HashMap<String,Integer>();
	hmap.put("Virat Kohli",78);
	hmap.put("Rohit Sharma",86);
	hmap.put("Jadeja",56);
	hmap.put("Dhoni",67);
	for(Map.Entry m:hmap.entrySet()) {
		System.out.println(m.getKey()+" Score : "+m.getValue());
	}
}
}
