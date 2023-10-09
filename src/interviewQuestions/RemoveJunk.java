package interviewQuestions;

public class RemoveJunk {
	public static void main(String[] args) {
		String s = "!$#%$^^&bharath(&*&(*)Krishna+*#*77";
		String s1 = "&^(&^)(*krishna_$**$(#_$_";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(s1);
	}

}
