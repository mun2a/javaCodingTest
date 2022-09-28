package programmersLevel2;

import java.util.Arrays;

public class MatrixRotation {

	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int[] ans = {8, 10, 25};
		
		int[] answer = new int[queries.length];
		
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = (i) * columns + (j+1);
			}
		}
		
		int temp = 0;
		int a = 0;
		
		for (int i = 0; i < queries.length; i++) { //queries.length
			a = arr[queries[i][0]-1][queries[i][1]-1];
			temp = arr[queries[i][0]-1][queries[i][1]-1];
			for (int k = 0; k < (queries[i][2] - queries[i][0] + 1) -1 ; k++) {
				arr[queries[i][0]+k-1][queries[i][1]-1] = arr[queries[i][0]+k][queries[i][1]-1];
				a = a < arr[queries[i][0]+k-1][queries[i][1]-1] ? a : arr[queries[i][0]+k-1][queries[i][1]-1];
			}
			for (int k = 0; k < (queries[i][3] - queries[i][1]); k++) {
				arr[queries[i][2]-1][queries[i][1]-1+k] = arr[queries[i][2]-1][queries[i][1]+k];
				a = a < arr[queries[i][2]-1][queries[i][1]-1+k] ? a : arr[queries[i][2]-1][queries[i][1]-1+k];
			}
			for (int k = 0; k < (queries[i][2] - queries[i][0] + 1) -1; k++) {
				arr[queries[i][2]-1-k][queries[i][3]-1] = arr[queries[i][2]-2-k][queries[i][3]-1];
				a = a < arr[queries[i][2]-1-k][queries[i][3]-1] ? a : arr[queries[i][2]-1-k][queries[i][3]-1];
			}
			for (int k = 0; k < (queries[i][3] - queries[i][1] -1); k++) {
				arr[queries[i][0]-1][queries[i][3]-1-k] = arr[queries[i][0]-1][queries[i][3]-2-k];
				a = a < arr[queries[i][0]-1][queries[i][3]-1-k] ? a : arr[queries[i][0]-1][queries[i][3]-1-k];
			}
			arr[queries[i][0]-1][queries[i][1]] = temp;
			answer[i] = a;
			
		}

		System.out.println(Arrays.toString(ans).equals(Arrays.toString(answer)));
	}

}
