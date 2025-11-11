package ProductOfArrayExceptItself;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer,1);
        int pre=1,post =1;
        for(int i=0;i<nums.length;i++){
            answer[i] = pre;
            pre = pre*nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            answer[j]=post*answer[j];
            post=post*nums[j];
        }
        return answer;
    }
}
