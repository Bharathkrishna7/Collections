package Simplejavapro;

public class Loops {

	public static void main(String[] args) {
		/*Loops
		while loop*/
		// dis-adv of while loop:- it will generate infinite loop if we don't give incremental or decremental partS
	//print 1 to 10 ?
		int q=1;
		while(q<=10)
		{
			System.out.println(q);
			q=q+1;
		}
		int e=0;
		while(e<=20)
		{
			System.out.println(e);
			e=e+1;
		}
		//for loop
		//print 2 to 99?
		for(int d=2;d<=99;d++)
				{
					System.out.println(d);
				}
		
		// print 11 to 4?
		for(int g=11;g>=4;g--) {
			System.out.println(g);
		}

	}

}
