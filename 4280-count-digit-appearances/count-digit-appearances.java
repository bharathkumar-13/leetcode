import java.util.*;
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                int k=n%10;
                if(k==digit){
                    count++;
                }
                n=n/10;
            }
        }
        return count;
        
    }
}