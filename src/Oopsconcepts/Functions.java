package Oopsconcepts;

public class Functions {

	public static void main(String[] args) {

		Functions f = new Functions();
		f.asia();
		f.girldetails();
		String b = f.place();
		System.out.println(b);
		String c = f.country("Sri lanka ", "india");
		System.out.println(c);
	}

	
	/*  there are 3 types of functions/methods 
	 * 1. no input and no output
	 * 2. no input passing but getting some output
	 * 3.passing some input and getting some output*/
	 

	 //here we r dealing with Non-Static functions

	public void asia() { // no input and no output
		System.out.println("we are in asia");
	}
	
	public void girldetails() { // no input passing but getting some output

		// String Gf="Radha";
		int age = 24;
		System.out.println(age);
		// return age;
	}

	public String place() { // no input passing but getting some output

		String p = "avissawella ";
		// String home="don'tknow";
		return p;
		// return home;
	}

	// here we are passing x,y "arguments/parameters" in this method
	public String country(String x, String y) { // passing some input and getting some output

		String k = x + y;
		return k;
	}

}
