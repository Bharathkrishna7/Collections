package Myprograms;

public class Exceptionthrowskeyword {

	public static void main(String[] args)  {
		Exceptionthrowskeyword ob=new Exceptionthrowskeyword();
    ob.sum();
    System.out.println("radha");
	}
	public void sum()  {
		try {
	      div();
		}
		catch(Exception e){
			System.out.println();
		}
	}
	public void div() throws Exception {
		int i=2/0;
	}
}
 