class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int t=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                k++;
            }
            else{
                return k;
            }
        }
        return k;
        
    }
}