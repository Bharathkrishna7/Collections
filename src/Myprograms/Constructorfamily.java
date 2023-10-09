package Myprograms;

public class Constructorfamily {
	// program about family members and relatives family members
	// 1. ramesh family 2. ramesh sisters family
	int totalmembers;
	String s;
	String s2;
	String s3;
	
	public Constructorfamily(int totalmembers,String s,String s2,String s3 ) {
		this.totalmembers=totalmembers;
		this.s=s;
		this.s2=s2;
		this.s3=s3;
  }

	public static void main(String[]args) {
		
		Constructorfamily ob=new Constructorfamily(3,"ramesh","vasumathi","bharath");
        System.out.println(ob.totalmembers+" "+ob.s+" "+ob.s2+" "+ob.s3);	
		
		Constructorfamily ob1=new Constructorfamily(4,"kcr","suguna","baby");
		System.out.println(ob1.totalmembers+" "+ob1.s+" "+ob1.s2+" "+ob1.s3);
		
		Constructorfamily ob2=new Constructorfamily(4,"narashima","laxmi","manasha");
		System.out.println(ob2.totalmembers+" "+ob2.s+" "+ob2.s2+" "+ob2.s3);
}
	

}
