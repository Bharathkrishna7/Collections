package Oopsconcepts;

public class Methodoverloading {

	public static void main(String[] args) {
     
		Methodoverloading m=new Methodoverloading();
		m.Mobile();
		m.Mobile("mi");
		m.Mobile(8000); 
		m.Mobile(20, 40);
   }
	
	// we can overload "main method" also.
	// we can't create a method inside a method.
	// duplicate methods i.e A method with same name and same no of data types are not allowed.
 
	//Method overloading:-Creating multiple methods with same name but with a different argument list.
	public void Mobile() { //with 0 arguments
		System.out.println();
	}
	public void Mobile(String i) {// with 1 parameter
		System.out.println(i);
	}
	public void Mobile(double i) {// with 1 argument but "different data type" are allowed too..
		System.out.println(i);
	}
	public void Mobile(int i,int j) {// with 2 arguments.
		System.out.println(i&j);
	}
}
