package java_practice_newone;

public class Array3 {

	public static void main(String[] args) {

		int a[] = { 22, 2, 44, 5 };

		int b = a[0]; // 22

		for (int i = 0; i < a.length; i++) {
			if (b >= a[i]) {
				System.out.println(b);
			} else {
				System.out.println("ABCD"); // 22 ,22 , ABCD . 22
			}
		}

	}

}
