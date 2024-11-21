package java_practice_newone;

public class Break1 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.println(j + "*" + i + "=" + j * i);

				if (i == 10 && j == 10) {
					break;
				}

				System.out.println();

			}

		}

	}

}
