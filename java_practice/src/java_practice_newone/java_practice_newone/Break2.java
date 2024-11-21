package java_practice_newone;

public class Break2 {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {

			for (int a = 1; a < 5; a++) {

				if (i == 3 && a == 3) {
					break;

				}
				System.out.println(i + " " + a);
			}
			System.out.println("Control came out from inner loop");
		}

		System.out.println("Control came out from outer loop");
	}
}
