package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int secondNum = target - nums[i];
            if(map.containsKey(secondNum)){
                return new int[]{map.get(secondNum),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }
}
