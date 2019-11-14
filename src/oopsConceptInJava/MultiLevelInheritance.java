package oopsConceptInJava;
class Faculty{
	float tot_sal;
	float bas_sa=4500;
}
class HRA extends Faculty{
	float hra=1500;
}
class DA extends HRA{
	float da=2250;
}
class Science extends DA{
	float bonus=2000;
	public float totalSal() {
		tot_sal=bas_sa+hra+da+bonus;
		return tot_sal;
	}
}
public class MultiLevelInheritance {
 public static void main(String args[]) {
	 Science s1=new Science();
	 System.out.println(s1.totalSal());
 }
}
