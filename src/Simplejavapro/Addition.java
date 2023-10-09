package Simplejavapro;

public class Addition {

	public static void main(String[] args) {
		int f=8;
		int d=92;
	        d=1; //	Here we are updating the rv value 92 to 1  ..
		int s=f+d;
		System.out.println("adding "+s);
	//pre-increment & post-increment	
		int i=1;
		int j=i++;
		System.out.println(i);
		System.out.println(j);
		int g=2;
		int m=++g;
		System.out.println(g);
		System.out.println(m);
		Addition ob=new Addition();
		ob.mul();
	}
	public void mul()
	{
		int i=2;
		int m=4;
		int k=i*m;
		System.out.println("*****************");
		System.out.println(k);
		
	}

}
