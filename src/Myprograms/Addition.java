package Myprograms;

public class Addition{
	 public int Add(int x, int y){
	int sum = x + y;
	        System.out.print("addition of two numbers" + sum);
	       
	        return sum;
	       
	 }
	public int Sub(int a, int b){
	int substraction = a - b;
	        System.out.print("Substraction of two number" + substraction);
	     
	        return substraction;
	}
	 
	public static void main(String args[]){
	          Addition abcd= new Addition();
	               abcd.Add(20,30);
	               abcd.Sub(200, 180);
	         
	}
	 

	}
