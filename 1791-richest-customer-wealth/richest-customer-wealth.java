class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr=new int[accounts.length];
        int k=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            arr[k]=sum;
            k++;
            sum=0;
        }
        Arrays.sort(arr);
        int l= arr[arr.length-1];
        return l;
        
    }
}