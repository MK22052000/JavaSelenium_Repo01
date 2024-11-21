package java_practice_newone;

import java.util.ArrayList;

public class Arraykist {

	public static void main(String[] args) {

		ArrayList<Object> megha = new ArrayList<Object>();

		megha.add("Selenium");
		megha.add("Hello");
		megha.add(1);
		megha.add(12 > 18);

		System.out.println(megha);

		for (Object suba : megha) {
			System.out.println("For each loop: " + suba);
		}

	}

}
