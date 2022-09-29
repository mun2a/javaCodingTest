package programmersLevel2;

import java.util.*;

public class PhoneNumbersList {
//https://school.programmers.co.kr/learn/courses/30/lessons/42577
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "114", "112", "113221123123", "1231231234"};
		boolean ans = true;
		
		boolean answer = solution(phone_book);
		
		System.out.println(ans==answer);
	}
	
	public static boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if (phone_book[i].length() >= phone_book[j].length()) break;
				if (phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
		return true;
    }
	
	//효율성이 더 좋음
	public boolean otherSolution(String[] phoneBook) {
		
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }

        for(int i = 0; i < phoneBook.length; i++) {
            for(int j = 0; j < phoneBook[i].length(); j++) {
                if(map.containsKey(phoneBook[i].substring(0,j))) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
	
}



