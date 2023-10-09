package interviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n=5;
		int f=1;
		int s=1;
		int t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++ ) {
			t=f+s;
			System.err.println(t);
			f=s;
			s=t;
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
//		StringBuffer sb=new StringBuffer("help");
//            
//            System.out.println(sb.reverse());



