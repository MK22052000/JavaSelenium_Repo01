package java_practice_newone;

public class Practice4 {

	public static void main(String[] args) {

		boolean b = true;
		b = false;

		int i = 100;
		int I = 300;

		if (i < I) {
			System.out.println("i is less  than I");
		} else {
			System.out.println("i is not less than I");
		}

		int z = 10;
		int x = 100;
		// Arithmetic operator
		System.out.println(z + x);
		System.out.println(z - x);
		System.out.println(z * x);
		System.out.println(z / x);

		// Logical operator
		System.out.println(z < x);
		// Assignment operator
		System.out.println(z += 10);// 20
		System.out.println(z *= 10);// 200
		System.out.println(z -= 10);// 190
		System.out.println(z /= 10);// 19

		System.out.println(z++);
		System.out.println(++z);
		System.out.println(z++);

	}

}
