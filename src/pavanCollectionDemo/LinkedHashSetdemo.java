package pavanCollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetdemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(2);	
		hs.add(4);
		hs.add(9);
		System.out.println(hs);// [1, 2, 4]

		//Duplicates are not allowed in linkedHashSet
		LinkedHashSet lk = new LinkedHashSet();// it follows "insertion order" but hashSet don't
		lk.add(2);
		lk.add(2);
		lk.add("krishna");
		lk.add(8);
		lk.add("park");
		System.out.println(lk); // [2, krishna, 8, park]
	}

}
