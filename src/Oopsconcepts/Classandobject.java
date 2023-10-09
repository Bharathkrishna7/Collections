package Oopsconcepts;

public class Classandobject { // Class is an entity(place) where we can define methods,variables e.t.c.
	//lets create age & height for 3 humans in this class ??

	// global variables or class variables	
	int age;
	double hight;

	public static void main(String[] args) {
		//new Classandobject(); <== This is the object in this class
		//new keyword is used to create the objects
		 Classandobject i=new Classandobject();
		 Classandobject j=new Classandobject(); 
		 Classandobject k=new Classandobject();
		 
		i.age=11;
		i.hight=3.9;
		
		j.age=24;
		j.hight=5.6;
		
		k.age=27;
		k.hight=5.9;
		System.out.println(i.age);
		System.out.println(i.hight);
		System.out.println(j.age);
		System.out.println(k.hight);

	}

}
