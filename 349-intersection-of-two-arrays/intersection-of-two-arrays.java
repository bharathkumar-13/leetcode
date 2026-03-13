import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        for(int n:nums2){
            if(map.containsKey(n)){
                set.add(n);
            }
        }
        int[] arr=new int[set.size()];
        int i = 0;
        for(int num : set){
            arr[i] = num;
            i++;
        }
        return arr;
        
    }
}