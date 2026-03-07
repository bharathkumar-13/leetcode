class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg1=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        avg1=sum/k;
        int lm=0;
        double avg=0;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            avg=sum/k;
            avg1=Math.max(avg,avg1);

        }
        return avg1;
    }
}