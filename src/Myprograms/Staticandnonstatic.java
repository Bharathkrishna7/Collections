package Myprograms;
// program about job and what job gives 
public class Staticandnonstatic {
	static String s="software tester";
	 int Salary=45000;
public static void main(String[] args) {
	Staticandnonstatic ob=new Staticandnonstatic ();
	ob.microsoft();
	ob.google();
	}
    
public String microsoft(){
	System.out.println(s);
	System.out.println(Salary);
	String roal="manual";
	System.out.println( roal+" new work");
	return roal;
}
 
public void google() {
	System.out.println(s);
	String job="devops";
	int salary=80000;
	System.out.println("new roal added "+job);
	System.out.println(salary);
}

public static void samsung() {
	
	
	
}

            

}
