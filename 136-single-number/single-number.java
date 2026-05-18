import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
            i+=2;
        }
        return nums[nums.length-1];
        
        
    }
}