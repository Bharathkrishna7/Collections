package Myprograms;

public class Encapsulation extends EncapsulationDetails {
		
 public static void main(String[] args) {
		/*We can give encaptulation values in 3 ways
		 1:- Giving Variable values directly in "setMethod" 
		 2:- we can give in "program arguments",It is going
		     to store in "String array" like{(args[0])} on  "dataBase",if we choose this option
		     we have to convert int,double values into string by 
		     using "parsing method" .     
		 3:- We can store variable values in "vm arguments",we
		     have to store values like {(-Dname=krishna)},they
		     are directly going to store in  our system,we have to get them
		     by using "System.getProperty" method..
		    
		  */
	      
	 Encapsulation e=new Encapsulation();
	int emp=Integer.parseInt(System.getProperty("emp"));
	e.setEmpid(emp);
	e.setName(System.getProperty("name"));
	int sal=Integer.parseInt(System.getProperty("sal"));
	e.setSalary(sal);
	
	 System.out.println("emp id "+e.getEmpid());
	 System.out.println("emp name "+e.getName());
	 System.out.println("emp salary "+e.getSalary());
	
 }
}
