package pavanCollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// HashMap hm=new HashMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//HashMap stores key-value pairs where the keys are unique
		hm.put(1, "bharath");
		hm.put(2, "krishna");
		hm.put(4, "gold");
		hm.put(5, "heaven");
		hm.put(6, "gold");
		hm.put(2, "gali"); // here key is duplicate so now 2 value is replaced with "gali"
		System.out.println(hm);// {1=bharath, 2=krishna, 4=gold, 5=heaven, 6=gold}&{1=bharath, 2=gali, 4=gold,
								// 5=heaven, 6=gold}

		System.out.println(hm.get(5));// heaven

		hm.remove(2);// remove pair from hashmap
		System.out.println("after remove " + hm);

		System.out.println(hm.containsKey(1)); // key present "true"
		System.out.println(hm.containsKey(2)); // key not present "false"

		System.out.println(hm.containsValue("bharath")); // value present "true"
		System.out.println(hm.containsValue("hmm")); // value not present "false"

		System.out.println(hm.isEmpty());// false bec hasmap contains data

		System.out.println(hm.keySet());// return all keys as set | [1, 4, 5, 6]

		for (Object i : hm.keySet()) {
			System.out.println(i);
		}

		System.out.println(hm.values());// return all the values as collection | [bharath, gold, heaven, gold]

		System.out.println(hm.entrySet());// returns all the entries as "set object" | [1=bharath, 4=gold, 5=heaven,
											// 6=gold]

		// getting entry in 3 different ways

		// 1
		for (Object data : hm.keySet()) {
			System.out.println(data + "   " + hm.get(data)); // hm.get will retrieve the value by passing the key
		}
		System.out.println("================");

		// Entry method //entry is an sub interface of hashmap
		// 2
		for (Map.Entry entry : hm.entrySet()) { // this will return all the entry in the hashmap

			System.out.println(entry.getKey() + "  " + entry.getValue());

		}
		System.out.println("==================");

		// 3
		// iterator
		Set s = hm.entrySet(); // returns all the entries as "set object"
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
