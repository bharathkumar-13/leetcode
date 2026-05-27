import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int num1=prices[0];
        int mprofit=0;
        for(int i=1; i<prices.length; i++){

            int k = prices[i] - num1;

            if(k > mprofit){
            mprofit = k;
            }

            if(prices[i] < num1){
            num1 = prices[i];
            }
        }
        return mprofit;
    
        
    }
}