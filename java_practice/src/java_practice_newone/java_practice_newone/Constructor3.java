package java_practice_newone;

public class Constructor3 {

	Constructor3() {
		System.out.println("I am ready");
	}

	Constructor3(int a) {
		System.out.println("I am int");
	}

	Constructor3(String b) {
		System.out.println("I am String");
	}

	Constructor3(double c) {
		System.out.println("I am double");
	}

	public static void main(String[] args) {

		Constructor3 c3 = new Constructor3();
		Constructor3 c4 = new Constructor3(1);
		Constructor3 c5 = new Constructor3("ANBU");
		Constructor3 c6 = new Constructor3(2.0);

	}

}
