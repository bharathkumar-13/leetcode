import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int k=nums[nums.length-1];
        int t=1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=k){
                k=nums[i];
                t++;
                if(t==3){
                    return k;
                }
                
            }

        }
        return n;

        
    }
}