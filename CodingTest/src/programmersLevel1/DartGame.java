package programmersLevel1;

public class DartGame {

	public static void main(String[] args) {
		
		String dartResult = "1D#2S*3S";
		int ans = 5;
		
		int answer = 0;
	    char ch;
		int cnt = 0;
		String[] str = dartResult.split("\\D+");
		int[] num = new int[3];
		int[] result = new int[3];
		
		
		for (int i = 0; i < result.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		for (int i = 0; i < dartResult.length(); i++) {
			ch = dartResult.charAt(i);
			if (ch == 'S') {
				result[cnt] = num[cnt];
				cnt++;
			} else if (ch == 'D') {
				result[cnt] = (int) Math.pow(num[cnt], 2);
				cnt++;
			} else if (ch == 'T') {
				result[cnt] = (int) Math.pow(num[cnt], 3);
				cnt++;
			} 
			if (ch == '#') {
				result[cnt-1] = result[cnt-1] * (-1);
			} else if (ch == '*') {
				result[cnt-1] = result[cnt-1] * 2;
				if (cnt-2 >= 0) {
					result[cnt-2] = result[cnt-2] * 2;
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			answer += result[i];
		}
	   
		System.out.println(ans == answer);

	}

}
