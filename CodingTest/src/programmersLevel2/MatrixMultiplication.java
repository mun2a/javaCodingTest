package programmersLevel2;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		int[][] ans = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
		
		int[][] answer = new int[arr1.length][arr2[0].length]; 
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				b = 0;
				for (int k = 0; k < arr1[i].length; k++) {
					a = arr1[i][k] *  arr2[k][j] ;
					b += a;
				}
				answer[i][j] = b;
			}
		}
		
		System.out.println(Arrays.deepToString(ans).equals(Arrays.deepToString(answer)));

	}

}
