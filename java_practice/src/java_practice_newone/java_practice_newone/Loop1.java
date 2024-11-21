package java_practice_newone;

public class Loop1 {

	public static void main(String[] args) {

		// outer loop
		for (int i = 1; i < 5; i++) { // 1 1 1 , 1 1 2 , control came out from second inner loop,
										// 1 2
			// first inner loop
			for (int j = 1; j < 4; j++) {

				// second inner loop

				for (int k = 1; k < 3; k++) {
					System.out.println(i + " " + j + " " + k);
				}

				System.out.println("Control came out from second inner loop");
			}
			System.out.println("Control came out from  first inner loop");
		}
		System.out.println("Control came out from outer loop");
	}

}
