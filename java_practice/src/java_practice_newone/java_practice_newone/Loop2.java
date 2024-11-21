package java_practice_newone;

public class Loop2 {

	public static void main(String[] args) {

		int lines = 5;

		for (int i = 1; i < lines; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println();
		}
	}

}
