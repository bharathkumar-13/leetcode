class Solution {
    public int singleNumber(int[] nums) {
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
        int targetValue = 1;
        int k=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == targetValue){
                k=entry.getKey();

            }
        }
        return k;
        
    }
}