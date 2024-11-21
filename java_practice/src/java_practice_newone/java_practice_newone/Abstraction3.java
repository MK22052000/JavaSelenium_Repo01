package java_practice_newone;

public class Abstraction3 extends Abstraction2 implements Interface1, Interface2 {

	public void read() {

		System.out.println(" I am done with reading");
	}

	public void write() {

		System.out.println(" I am done with writing");
	}

	public void eat() {

		System.out.println(" I am done with eating");
	}

	public static void main(String[] args) {

		int i = 20;

		Abstraction3 Ab3 = new Abstraction3();
		Ab3.read();
		Ab3.write();
		Ab3.eat();
		System.out.println(i);

	}

}
