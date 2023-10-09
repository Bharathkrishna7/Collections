package Oopsconcepts;

public class Staticandnonstatic {
	//Global variables:- we can use global variables all over the program means in any methods
	int j=26; // non static global variable
	static double t=4.6; // static global variable 
	public static void main(String[] args){
	 	/* we can call static methods in 2 ways
		1. By using direct method name
		2.  with a class name */
		bike(); // calling static method directly
		Staticandnonstatic.bike(); // calling static method with class name
		Staticandnonstatic ob= new Staticandnonstatic(); // Here object is created to call ""non-static variable and method"" 
ob.road();
System.out.println(ob.j);
	}
	public void road() { //non-static method
		System.out.println("'''''''''''");
	}
	public static void bike() { //static method
		System.out.println("bike in a road");
	}

}
