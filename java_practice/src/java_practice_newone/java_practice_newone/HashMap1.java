package java_practice_newone;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Megha");
		hm.put(2, "suba");
		hm.put(3, "anu");
		hm.put(4, "manu");
		hm.put(5, "ganu");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.get(5));
	}

}
