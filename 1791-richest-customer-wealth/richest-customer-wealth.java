class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int currentSum=0;
        for (int i=0;i<accounts.length;i++) {
            for (int j=0;j<accounts[i].length;j++) {
                currentSum=currentSum+accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentSum);
            currentSum=0;
        }
        return maxWealth;
    }
}