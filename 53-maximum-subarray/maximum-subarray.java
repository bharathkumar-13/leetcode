import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum>=0){
                sum+=nums[i];
            }
            else{
                sum=nums[i];
            }
            if(sum>msum){
                msum=sum;
            }
        }
        return msum;
        
    }
}