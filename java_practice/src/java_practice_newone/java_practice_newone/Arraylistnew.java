package java_practice_newone;

import java.util.ArrayList;

public class Arraylistnew {

	public static void main(String[] args) {

		ArrayList<Object> A2 = new ArrayList<Object>();

		A2.add("I");
		A2.add("am");
		A2.add("good");
		A2.add("in");
		A2.add("java");
		A2.add("now");
		A2.add("Let's");
		A2.add("Start");

		System.out.println(A2);

		for (Object M : A2) {
			System.out.print(M);
		}

	}

}
