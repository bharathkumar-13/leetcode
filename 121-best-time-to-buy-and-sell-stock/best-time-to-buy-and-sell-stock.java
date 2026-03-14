import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            else{
                int count=prices[i]-minp;
                    if(count>max){
                        max=count;
                    }
                
            }
        }
        return max;
        
    }
}