package programmersLevel2;

import java.util.*;

public class UnfinishedPlayer {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
	    String ans = "mislav";
//	    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//	    String[] completion = {"josipa", "filipa", "marina", "nikola"};
//	    String ans = "vinko";

	    String answer = "";
	    
	    Arrays.sort(participant);
	    Arrays.sort(completion);
	    
	    for (int i = 0; i < completion.length; i++) {
	    	System.out.println(participant[i]);
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
	    
	    if (answer == "") {
	    	answer = participant[participant.length-1];
		}

//		해시를 이용한 풀이
//	    HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) {	
//        	hm.put(player, hm.getOrDefault(player, 0) + 1);		//이름이 중복일 경우에 값 +1
//        	System.out.println("participant: " + hm);
//        }
//        System.out.println();
//        for (String player : completion) {
//        	hm.put(player, hm.get(player) - 1);
//        	System.out.println("completion: " + hm);
//        }
//
//        for (String key : hm.keySet()) {
//            if (hm.get(key) != 0){
//                answer = key;
//                break;
//            }
//        }
	    
	    
	    System.out.println();
	    System.out.println(ans == answer);
	}
	

}
