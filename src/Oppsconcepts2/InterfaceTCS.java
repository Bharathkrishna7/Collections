package Oppsconcepts2;
/* ==>interface is similar to inheritance concept
==>in interface there is no main method.
==>in interface variables are by default static in nature no need to mention static keyword
==>in interface only we can declare non-static methods & method body is not allowed
==> we can not create objects of interface
==>interface is abstract in nature 
*/
public class InterfaceTCS implements indonesia, Japan {
	// To make connection between interface and class we have to use a keyword called 'implements'.. 
	// if class is implementing any interface,its mandatory to define/override all the methods of interface.
	public void salary() {
		System.out.println("it depends on position,but basic is");
	}

	public void workinghours() {
		System.out.println("it depends on person");

	}

	public void Holidays() {
		System.out.println("on national festivals must");
	}

	public int totalemploys() {
		int i = 600;
		return i;

	}

	public void agelimits() {
		System.out.println("below 15 is not allowed");

	}

	public void locations() {
		System.out.println("only in metros");

	}

}
