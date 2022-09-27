package programmersLevel1;

public class FindMiddleWord {

	public static void main(String[] args) {
		String s = "abcde";
        String ans = "c";
        String answer = "";
        
        int len = s.length(); 
        System.out.println(len%2);
        
        if(len%2 == 0){
            answer = s.substring((len/2)-1, (len/2)+1);
        }else {
            answer = s.substring((len/2), (len/2)+1);
        }

        System.out.println(ans.equals(answer));
	}

}
