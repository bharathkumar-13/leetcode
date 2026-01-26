import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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
        List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();
        }
        return arr;

        
    }
}