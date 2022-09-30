package programmersLevel3;

import java.util.*;

public class MultilevelToothbrushSales {
//https://school.programmers.co.kr/learn/courses/30/lessons/77486
	public static void main(String[] args) {
		String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
		String[] referral = {"-", 	"-", 	"mary", "edward", "mary", "mary", "jaimie", "edward"};
		
		String[] seller = {"young", "john", "tod", "emily", "mary"}; 
		int[] amount = 		{12, 	4, 		2, 		5, 		10};
		int[] result = {360, 958, 108, 0, 450, 18, 180, 1080};
		
		int[] answer = solution(enroll, referral, seller, amount);
		
		System.out.println(Arrays.toString(result).equals(Arrays.toString(answer)));

	}
	
	//등록자와 이익
	static HashMap<String, Integer> enrollProfit = new HashMap<>();
	//등록자 소개자
	static HashMap<String, String> enrollReferral = new HashMap<>();
	
	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        
        for (String name : enroll) {
			enrollProfit.put(name, 0);
		}
        for (int i = 0; i < enroll.length; i++) {
				enrollReferral.put(enroll[i], referral[i]);
		}
        
        //이익 계산
        for (int i = 0; i < seller.length; i++) {		
        	profit(seller[i], amount[i] * 100);
		}
        
        //답 순차적으로 입력
        for (int i = 0; i < enroll.length; i++) {
        	answer[i] = enrollProfit.get(enroll[i]);
		}
        
        return answer;
    }
	
	public static void profit(String seller, int amount){
		
		int profit = 0; 
		
		if (amount < 10) profit = amount;
		else profit = amount - (amount / 10);
		
		if (!seller.equals("-")) {
			enrollProfit.put(seller, enrollProfit.get(seller) + profit);
		}
		
		if (!(enrollReferral.get(seller) == null) && amount >= 10) {
			profit(enrollReferral.get(seller), amount - profit);
		} 
		
	}

}




