package Oppsconcepts2;
//Method over riding :- 
//When method is present in parent & child class with same name & same arguments is called method overriding. Here subclass is-
    // - Overridden method & have to create the object for this sub class in main method class to execute the program....
       // This is called dynamic polymorphism or run time polymorphism

public class Methodoverriding {

	public static void main(String[] args) {
		
	 
	 Methoverridingsubclass sub= new Methoverridingsubclass();
	 
	 sub.hyd();
	 sub.bang();
	 
	 System.out.println("****************");
	 //child class object can be refereed by super class reference variable this is called dynamic polymorphism (or) run time polymorphism.. 
	 // Here we can access sub class same method which is present in sup class only..
	 //This is also called "top casting"
	 MethoverridingSuperclass  sup= new Methoverridingsubclass();
	 sup.hyd();
	 sup.bang();
	
	 	
	}

}
