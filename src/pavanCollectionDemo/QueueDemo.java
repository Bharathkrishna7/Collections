package pavanCollectionDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		// Adding elements add() offer()
		// insertion order preserved ,duplicates are allowed,it don't allows different
		// types of data
		pq.add("eyes");
		pq.add("nice");
		pq.add("oh");
		pq.add("mars");
		pq.offer("mars");
	//	pq.offer(22);//not allowed bec it don't support heterogeneous data  
		System.out.println(pq);// [eyes, mars, oh, nice, mars] {"following insertion order in ascending order"}
		// get head element element() peek()
		// it will give the head element in the object
		System.out.println(pq.element());// eyes (if queue empty it throws "exception")
		System.out.println(pq.peek());// eyes (if queue empty it returns "null")

		// return and remove head element from queue remove() poll()
		System.out.println(pq.remove()); // eyes (if queue empty it throws "exception")
		System.out.println(pq.poll()); // mars (if queue empty it returns "null")  
		System.out.println("after returning and removing elements " + pq);// [mars, nice, oh]

		Iterator it=pq.iterator();
		while(it.hasNext()) { //hasnext method verify element exists or not
			System.out.println(it.next());
		}
		
		
	}

}
