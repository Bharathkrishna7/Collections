package Myprograms;
// scenario:- A SINGLE FIELD should allow only 1 t0 500 numbers
public class oneto500 {

	public static void main(String[] args) {
	 
		oneto500 ob=new oneto500();
		ob.numbers();
		
		for(int j=0;j>=-40;j--)
		{
			System.out.println(j);
		}
}
	 public int numbers()
	 {
		for(int j=1;j<=500;j++) {
		System.out.println(j);
		}
		return 0;
	  }

}
