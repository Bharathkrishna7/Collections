package pavanCollectionDemo;

import java.util.LinkedList;

public class LinkedListdemo1 {

	public static void main(String[] args) {
		
		//Declare linked list
		LinkedList l=new LinkedList();
		
		//Declare linked list with datatype
		
	//LinkedList<String>ls=new LinkedList<String>();
	
	//add elements into linkedList
		l.add("ntr");
		l.add(24);
		l.add('f');
		l.add(true);
		l.add(null);
		l.add("parkdarling");
		l.add(8.0);
		
		System.out.println(l);
 
 System.out.println(l.size());//7		
 
 //remove
 l.remove("ntr");
 l.remove(1);
 System.out.println("after remove "+l);
 
 //linked list methods
l.addFirst("jr");
l.addLast(9);
	System.out.println(l);
	
	
	
	
	
	
	
	}
	
}
