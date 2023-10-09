package pavanCollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

import com.sun.source.tree.WhileLoopTree;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet(); //default capacity 16 load Factor 0.75
		
		hs.add("parkdarling");
		hs.add('e');
		hs.add(22);
		hs.add(null);
		hs.add(true);
		hs.add("bharath");
		             //HashSet stores unique elements 
		System.out.println(hs); //[null, e, parkdarling, 22, bharath, true] insertion order not preserved

		//remove
		hs.remove(22);
		System.out.println("after removing 22 "+hs);
		
		//contains 
		System.out.println(hs.contains(22)); //true

		for(Object data:hs) {
			
			System.out.println(data);
			}
	
		Iterator i= hs.iterator(); 
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("======================");
		//addall
		HashSet set=new HashSet();
	set.addAll(hs);
	System.out.println(hs);
		
	}

}
