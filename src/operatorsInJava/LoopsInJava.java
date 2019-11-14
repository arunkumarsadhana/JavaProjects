package operatorsInJava;

public class LoopsInJava {
public static void main(String args[]) {
	int i=1;
	while(i<=10) {
		System.out.print(i+"\t");
		i++;
	}
	System.out.println("\n----------DO WHILE LOOP------------");
	i=1;
	do {
		System.out.print(i+"\t");
		i++;
	}while(i<=10);
	System.out.println("\n----------FOR LOOP------------");
	for(i=1;i<=10;i++) {
		System.out.print(i+"\t");
	}
}
}
