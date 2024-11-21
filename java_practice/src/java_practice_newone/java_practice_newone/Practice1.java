package java_practice_newone;

public class Practice1 {

	int roll;
	String name;
	String college = "KARE";

	// constructors
	Practice1(int r, String n) {

		roll = r;
		name = n;
	}

	public void wantresult() {

		System.out.println(roll + "  " + name + "  " + college);

	}

	public static void main(String[] args) {
		Practice1 P3 = new Practice1(1, "vijay");
		Practice1 P4 = new Practice1(2, "guna");
		Practice1 P5 = new Practice1(3, "mano");

		P3.wantresult();
		P4.wantresult();
		P5.wantresult();
	}
}
