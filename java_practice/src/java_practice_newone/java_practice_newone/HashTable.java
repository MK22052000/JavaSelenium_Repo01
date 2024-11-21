package java_practice_newone;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm1 = new Hashtable<Integer, String>();

		hm1.put(1, "naa");
		hm1.put(2, "vaa");

		System.out.println(hm1.get(1));
		System.out.println(hm1.get(2));
	}
}