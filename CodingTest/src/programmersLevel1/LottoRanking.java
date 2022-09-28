package programmersLevel1;

import java.util.Arrays;

public class LottoRanking {

	public static void main(String[] args) {
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] ans = {3, 5};
		
		int count0 = 0;
		int count = 0;
		
		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				count0++;
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					count++;
				}
			}
		}
		int[] answer = {7-(count0 + count) == 7 ? 6 : 7-(count0 + count), (7-count) == 7 ? 6 : (7 - count)};
        
		System.out.println(Arrays.toString(ans).equals(Arrays.toString(answer)));
		
	}

}
