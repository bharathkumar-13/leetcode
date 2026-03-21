import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];

        int pos = 0; // even index
        int neg = 1; // odd index

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[pos] = nums[i];
                pos += 2;
            } else {
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
        
    }
}