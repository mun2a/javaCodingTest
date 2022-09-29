package programmersLevel2;

import java.util.*;

public class FibonacciSequence {
//https://school.programmers.co.kr/learn/courses/30/lessons/12945
	public static void main(String[] args) {
		int n = 37;
		int ans = 701044;
		
		System.out.println(ans == solution(n));
	}
	
	public static int solution(int n) {
        int div = 1234567;
        
        List<Integer> listF = new ArrayList<>();
        
        listF.add(0);
        listF.add(1);
        
         for (int i = 2; i <= n; i++) listF.add((listF.get(i-1) + listF.get(i-2)) % div);
        
        return listF.get(n) % div;
    }
	
}
