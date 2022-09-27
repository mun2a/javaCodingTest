package programmersLevel1;

import java.util.ArrayList;

public class MakePrimeNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
        int ans = 1;
        
        int answer = 0;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int count = 0;
        //System.out.println(nums.length);

        for(int a=0; a<nums.length-2; a++){
            for(int b=a+1; b<nums.length-1; b++){
                for(int c=b+1; c<nums.length; c++){
                    sum.add(nums[a]+nums[b]+nums[c]);
                }
            }
        }

        for(Integer n : sum){
            for(int i=2; i<=n; i++){
                if(n%i == 0){
                    count++;
                }
            }
            if(count == 1){
                answer++;
            }
            count = 0;
        }

        System.out.println(ans == answer);
	}

}
