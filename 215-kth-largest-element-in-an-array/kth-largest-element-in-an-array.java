class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0;
        // for(int i=nums.length-1;i>k;i--){
        //      j=nums[i];
        // }
        
        int n=nums.length-1;
        while(k>0){
            j=nums[n];
            n--;
            k--;

        }
        return j;
        
    }
}