package java_practice_newone;

public class Abstraction2 extends Abstraction1 {

	public void eat() {
		System.out.println(" I am done");
	}

	public static void main(String[] args) {

		int i = 10;

		Abstraction2 Ab2 = new Abstraction2();
		Ab2.eat();

	}

}
