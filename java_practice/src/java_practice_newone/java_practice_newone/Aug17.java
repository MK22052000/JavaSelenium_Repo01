package java_practice_newone;

public class Aug17 {

	static int a = 10;
	String b = "Megha";

	public static void main(String[] args) {

		Aug17 A1 = new Aug17();
		System.out.println(A1.a);
		System.out.println(A1.b);

		int R = 100;
		R = 200;

		System.out.println(R);

		if (R > a) {
			System.out.println("It is true");
		} else {
			System.out.println("It is false");
		}

		System.out.println(R++ + ++R);// 200,201 + 202,203
		System.out.println(R++ + ++R);// 202,203 + 204,205
		System.out.println(R++ + ++R);// 204,205 + 206,207
		System.out.println(R++ + ++R);// 206,207 + 208,209
		System.out.println(++R + --R);// 209,209 + 208,208

	}

}
