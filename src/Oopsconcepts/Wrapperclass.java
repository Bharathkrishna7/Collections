package Oopsconcepts;

public class Wrapperclass { // it is nothing but an data convertion.. 

	public static void main(String[] args) {
		String s="421";
		System.out.println(s+1);//Answer was "4211" bec of Concatination concept.it is String not integer
		// lets convert String data into int with "parseInt method"
		int m=Integer.parseInt(s);
		System.out.println(m+1);
		// Integer,Character,Double,Boolean.These all come under "Wrapperclass"
		//Lets see String to double conversion
		String b="45.8";
		double d=Double.parseDouble(b);
		System.out.println(d);
		// For Character there is no "parse method" in wrapperclass
		int i=4;
		System.out.println(i+2);//6
		String n=String.valueOf(i); // In wrapperclass for string we use "valueof method"
		System.out.println(n+9);//49
	}

}
