package java_practice_newone;

public class Encapsulation1 {

	String name;
	int c = 2;

	public void setname(String s) {

		this.name = s;
		this.c = 5;
		System.out.println(c);

	}

	public String getname() {

		return name;
	}

}
