class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[l]=nums[i-1];
                l++;
            }

        }
        nums[l]=nums[nums.length-1];
        l++;
        return l;
    }
}