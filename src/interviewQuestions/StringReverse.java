package interviewQuestions;

public class StringReverse {
	public static void main(String[] args) {
		String s = "javaSelenuim"; // String is immutable(unable to change) so we can't use "reverse method".
	
		   //1.using forLoop
		int len = s.length(); //8 // it will give us length of the string
		System.out.println(len);
		String rev = " "; // null string to store the rev char
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i); // charAt will take char value from int // here we are concatenating null string to char , to convert it from char to string

		}
		System.out.println(rev);

		//2.using stringbuffer	
	StringBuffer sb =new StringBuffer(s);
	// StringBuffer rev=sb.reverse();
	//System.out.println(rev);
	System.out.println(sb.reverse());
	
		
	}
}
