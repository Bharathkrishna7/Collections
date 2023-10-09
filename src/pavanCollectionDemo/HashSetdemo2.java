package pavanCollectionDemo;

import java.util.HashSet;

public class HashSetdemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		hs.add(8);
		hs.add(9);
		System.out.println(hs);//[2, 4, 6, 8, 9]
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(8);
		hs1.add(2);
		hs1.add(6);
	    hs1.add(22);
		hs1.add(99);
		System.out.println(hs1);//[2, 99, 6, 22, 8]

		// Union:-it will remove repeated values
		hs.addAll(hs1); //it means from hs it will add all hs1 elements
		System.out.println("Union " + hs);// [2, 99, 4, 6, 22, 8, 9]

		//Intersection:-it will get the common elements in both "hs & hs1" along with elements in hs1.
		hs.retainAll(hs1); //it means except this "hs1" remaining elements are retain
		System.out.println("intersection "+hs); //[2, 99, 6, 22, 8]

		System.out.println("=================");
	System.out.println(hs);
	System.out.println(hs1);
	
	//remove :-it will print the difference b/w hs & hs1	
	hs.removeAll(hs1);//it means from hs elements it will remove hs2 values 
	System.out.println(hs);
	
	//subset:-hs1 is subset of hs then it returns true or else false ,means hs1 only having hs elements in it
	System.out.println(hs.containsAll(hs1));
	System.out.println(hs);
	
	}

}
