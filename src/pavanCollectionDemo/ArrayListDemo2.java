package pavanCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("krishan");
		al.add("bharath");
		al.add("ntr");
		al.add("parkmin");
		al.add("hyeri");
    
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
       al1.addAll(al); // we are using arrylist rv in here to add all
       System.out.println(al1); // [krishan, bharath, ntr, parkmin, hyeri]
       
       al1.removeAll(al1); //to remove all
       System.out.println("after removing "+al1); 
		
	// to sort array list we need collections class 
		
		Collections.sort(al);
		System.out.println("after sorting "+al); //it will sort in ascending order
	
	//sort array in descending order
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after sorting in reverse order "+al);

	//Shuffling the list
		Collections.shuffle(al);
		System.out.println("after shuffling "+al);
		
		
		
	}

}
