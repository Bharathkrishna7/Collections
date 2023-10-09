package pavanCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList in different ways
	//	ArrayList al=new ArrayList();
		
	//	ArrayList<Integer> ai=new ArrayList<Integer>();
	//	ArrayList<String> as=new ArrayList<String>();
		
		//We are using list interface for array list class
      //  List aL=new ArrayList<>();
	
	
		ArrayList al=new ArrayList();
		
		al.add(2);
		al.add("krishna");
		al.add(7.7);
		al.add("bharath");
		al.add('e');
		al.add(22);
		al.add(false);
	
		System.out.println(al);
		
		System.out.println("number of elements in the array is "+al.size());
	//remove
		al.remove(1); //with index
		al.remove("bharath"); //remove directly
		
		System.out.println("after removing the element from list"+al);

	//insert new element
		
		al.add(1, "bharath");
		
		System.out.println("after adding the object in index "+al); //[2, bharath, 7.7, e, 22, false]
		
		//retreive specific element
		
	System.out.println(al.get(4));
	
	//change element/replace
	al.set(0,4);
	
	System.out.println("after replacing element "+al); //[4, bharath, 7.7, e, 22, false]

//search - contains() - Returns true/false	
		System.out.println(al.contains(22));
		System.out.println(al.contains('e'));
		System.out.println(al.contains("krishna"));
		
//isEmpty() //if not empty it throws false (or) if empty it is true
		System.out.println(al.isEmpty());//false
		
//forloop (reading element using for loop)
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("========================");

//foreach loop
		for(Object j:al) { // we are using object because it contains different kind of elements
			
			System.out.println(j);
		}
		System.out.println("--------------------------");
//Using iterator
		Iterator it=al.iterator();
		while(it.hasNext()) //if having element it proceed other wise it throws false
		{
			System.out.println(it.next()); //it will return an object/element from array list
		}
		
		
		
		
		
		
	
		
		
		
	}

}
