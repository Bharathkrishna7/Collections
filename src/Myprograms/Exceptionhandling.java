package Myprograms;
//exception handling takecare/ensures that the flow of the program does't break when exception occures
// types:Null point exception,array index out of bound exception,timeout exception,String out of bound exception etc....
public class Exceptionhandling {
   int d=4;
	public static void main(String[] args) {
	 //uncaught exception	
       /*int n=6/0;
       System.out.println(n);*/
     
       //caught exception
       /*Thread.sleep(4000); means 4sec*/
      
		//null point exception
      /*Exceptionhandling  obj=new Exceptionhandling ();
       obj=null;
       System.out.println(obj.d);*/
		
	//3 different types of exceptions to handle: 1.Try-catch block 2.Throwskeyword 3.throwkeyword

/*try-catchblock:whenever we find any exception in multiple lines in a code,put it in "tryblock" & wat exceptions it will give
		put in "catchblock"*/
   try {
		int i=6/0;// this line will throw an exception
    }
   catch(ArithmeticException a) { // a is rv for ArithmeticException 
     a.printStackTrace();//this method tell us on which line the exception was
  }
	   System.out.println("krish");
	// trycatch using arryindexoutofbound exception 
	 try {
		 int j[]=new int[4];
		  j[6]=9;
		  }
		  catch(Throwable t){ //By using "Throwable" superclass.""it was superclass for both errors,exceptions....""
		  System.out.println("array index outofbouns");
	 }
	   
	   
	}

}
