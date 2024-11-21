package java_practice_newone;

public class Constructor2 {

	int id;
	String name;
	String Companyname;

	// Default constructor
	Constructor2() {
		System.out.println(" Hi i am constructor");
	}

	Constructor2(int a, String b, String c) {

		id = a;
		name = b;
		Companyname = c;

	}

	public void akkow() {

		System.out.println(id + " " + name + " " + Companyname + " ");
	}

	public static void main(String[] args) {
		Constructor2 c2 = new Constructor2();

		Constructor2 c3 = new Constructor2(1, "megha", "aqm");
		c3.akkow();

		Constructor2 c4 = new Constructor2(2, "arun", "aqm");
		c4.akkow();

	}

}
