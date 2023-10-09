package pavanCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		String arr[] = { "ntr", "parkmin", "hyeri", "krishna" };

		for (String data : arr) {
			System.out.println(data);
		}
		
//converting this above array in to array list

		ArrayList al=new ArrayList(Arrays.asList(arr));  // aslist is used to convert array in array list
		
		System.out.println("array list data "+al);
		
	}

}
