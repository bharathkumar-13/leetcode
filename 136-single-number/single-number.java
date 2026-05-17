import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                int k=map.get(n);
                k++;
                map.put(n,k);
            }else{
                map.put(n,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
        
        
    }
}