package pavanCollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// Hashtable ht = new Hashtable(); //Capacity is 11,Load factor 0.75

		//HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "value");
		ht.put(102, "rama");
		ht.put(103, "krishna");
		ht.put(104, "bharath");
		// ht.put(null, "value"); it will throw error bec Hashtable don't allow nulls as a key
		// ht.put(105, null); it will throw error bec Hashtable dont allow nulls as a value
		System.out.println(ht);//{104=bharath, 103=krishna, 102=rama, 101=value} insertion order is not preserved  

	for(Object table:ht.keySet()) {
		System.out.println(table+"  "+ht.get(table));
	}
	System.out.println("==============");
	
	//Entry specific methods
		for (Map.Entry entry : ht.entrySet()) {
		System.out.println(entry.getKey()+"   "+entry.getValue());
	}
		
	}

}
