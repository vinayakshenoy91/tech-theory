package strings;

//Complexity : N*M

public class SubstringBruteForce {

	public static void main(String[] args) {
		System.out.println(patternMatch("HelloHello", "oHel"));
	}
	
	
	public static boolean patternMatch(String text, String pattern) {
		
		int textLength = text.length();
		int patternLength = pattern.length();

		for(int i=0;i<=textLength-patternLength;i++) {
			int j;
			for(j=0;j<patternLength;j++) {
				
				if(text.charAt(i+j)!=pattern.charAt(j)) {
					break;
				}
				
			}	
			if(j==patternLength) return true;
		}
		return false;
	}

}
