package Myprograms;

import java.util.ArrayList;

public class Arraylist {

	public static <E> void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add(2);
		ob.add(5);
		ob.add(9);
		ob.add(4);
		for(int j=0;j<=ob.size();j++) {
			System.out.println(ob.get(j));}
			ArrayList<E> e=new ArrayList<E>();
			Constructorfamily cf=new Constructorfamily(1, "two", "three", "four");
			System.out.println(cf.totalmembers+cf.s+cf.s2+cf.s3);
	}

}
