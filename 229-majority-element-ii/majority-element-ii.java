class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int n:nums){
            if(map.containsKey(n)){
                int count=map.get(n);
                count++;
                map.put(n,count);
            }else{
                map.put(n,1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > nums.length/3){
                ls.add(key);
            }
        }

        return ls;


        
    }
}