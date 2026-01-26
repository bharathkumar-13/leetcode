import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                int count=map.get(n);
                count++;
                map.put(n,count);

            }else{
                map.put(n,1);
            }
        }
        for(Integer count:map.values()){
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}