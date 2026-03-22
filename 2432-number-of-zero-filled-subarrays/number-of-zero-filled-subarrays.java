import java.util.*;
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // int count=0;
        // long sum=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count++;
        //     }else{
        //         long k = (long)(count * (count + 1)) / 2;
        //         sum=sum+k;
        //         count=0;


        //     }
        // }
        // long k = (long)(count * (count + 1)) / 2;
        // sum =sum+k;
        // return sum;
        long count = 0, ans = 0;

        for(int num : nums){
            if(num == 0){
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }
        return ans;
        

    }
}