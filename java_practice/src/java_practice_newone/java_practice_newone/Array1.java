package java_practice_newone;

public class Array1 {

	public static void main(String[] args) {

		int a[] = new int[5];

		System.out.println(a.length);

		// printing an array default values

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		a[0] = 100;
		a[1] = 99;
		a[2] = 98;
		a[3] = 97;
		a[4] = 96;
		a[5] = 95;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
