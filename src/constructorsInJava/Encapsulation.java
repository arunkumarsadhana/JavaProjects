package constructorsInJava;
class Faculty{
	private String name;
	private int id;
	private float sal;
	public void setName(String name) {this.name=name;}
	public void setId(int id) {this.id=id;}
	public void setSal(float sal) {this.sal=sal;}
	public String getName() {return name;}
	public int getId() {return id;}
	public float getSal() {return sal;}
}
public class Encapsulation {
public static void main(String args[]) {
	Faculty f1=new Faculty();
	f1.setName("Arun");
	f1.setId(124);
	f1.setSal(5678.78f);
	System.out.println("Name : "+f1.getName());
	System.out.println("Id : "+f1.getId());
	System.out.println("Salary : "+f1.getSal());
	}
}
