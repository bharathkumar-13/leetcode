import java.util.*;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list=new ArrayList<>();
        int m=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(pivot);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                continue;
            }
            else if(nums[i]<pivot){
                list.add(m,nums[i]);
                m++;
            }
            else{
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}