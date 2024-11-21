package java_practice_newone;

public class Inheritance04 extends Inheritance03 {

	public void substract() {

		int c = a - b;

		System.out.println(c);
	}

	public void multiply() {

		int c = a * b;

		System.out.println(c);

	}

	public static void main(String[] args) {

		Inheritance04 I4 = new Inheritance04();

		I4.add();
		I4.substract();
		I4.multiply();

		System.out.println("Sucess");

	}

}
