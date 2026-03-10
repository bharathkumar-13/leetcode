import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int limit = nums.length / 2;

        for(int num : nums){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if(count > limit){
                return num;
            }
        }

        return -1;
    }
}