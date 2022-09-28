package programmersLevel2;

import java.util.*;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		int ans = 1;
		
		
		int answer = 0;
        class printer{
			int loc;
			int paper;
			
			public printer(int loc, int paper) {
				this.loc = loc;
				this.paper = paper;
			}
			
		}
		
		Deque<printer> deq = new ArrayDeque<>();
		
		for (int i = 0; i < priorities.length; i++) {
			deq.offer(new printer(priorities[i], i));
		}
		
		while (!deq.isEmpty()) {
			
			int cnt = 0;
			printer peek = new printer(deq.peek().loc, deq.peek().paper);
			
			for (printer printer : deq) {
				if (peek.loc < printer.loc) {
					deq.offer(new printer(deq.peek().loc, deq.peek().paper));
					deq.poll();
					break;
				} 
				cnt++;
			}
			
			if (cnt == deq.size()) {
				answer++;
				if (peek.paper == location) {
					break;
				}
				deq.poll();
			}
		}
		
		System.out.println(ans == answer);

	}

}
