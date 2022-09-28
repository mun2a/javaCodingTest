package programmersLevel2;

import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		String s = "xxxxxxxxxxyyy";
		int ans = 5;
		
		int answer = s.length(); 
		for (int step = 1; step < (s.length()/2)+1; step++) {
			ArrayList<String> arr = new ArrayList<>();
			int cnt = 1;
			int len = s.length();
			String temp = "";
			
			for (int i = 0; i < s.length(); i += step) {
				if (i + step > s.length()) {
					arr.add(s.substring(i));
				} else {
					arr.add(s.substring(i, i + step));
				}
			}
			
			for (int i = 0; i < arr.size()-1; i++) {
				if (arr.get(i).equals(arr.get(i+1))) {
					if (cnt != 1 && !temp.equals(arr.get(i))) {
						len += Integer.toString(cnt).length();
						cnt = 1;
					}
					cnt++;
					len-= step;
					temp = arr.get(i);
				}
			}
		
			len += Integer.toString(cnt).length();
			answer = answer < len ? answer : len;
		}

		System.out.println(ans == answer);
	}

}
