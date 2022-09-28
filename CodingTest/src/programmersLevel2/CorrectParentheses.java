package programmersLevel2;

public class CorrectParentheses {

	public static void main(String[] args) {
		String s = "())(()";
        boolean ans = false;
        
        boolean answer = false;
		int cntL = 0;
		int cntR = 0;
		boolean a = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') { 
				 cntL++;    
			} else {
				 cntR++;
			}
			if (cntL < cntR) {
				 a = false;
			}
		 }
		if((cntL == cntR) && a) {
			answer = true;
		}   

		System.out.println(ans == answer);

	}

}
