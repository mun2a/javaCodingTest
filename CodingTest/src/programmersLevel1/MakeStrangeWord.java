package programmersLevel1;

import java.util.Arrays;

public class MakeStrangeWord {

	public static void main(String[] args) {
		String s = "try hello world";
        String ans = "TrY HeLlO WoRlD";
        String answer = "";
        String[] str = s.split("");
        int cnt = 0;
        System.out.println(Arrays.toString(str));

        for(String a : str){
            cnt = a.contains(" ") ? 0 : cnt+1;
            answer += cnt%2==0 ? a.toLowerCase() : a.toUpperCase();
        }

        System.out.println(ans.equals(answer));
	}

}
