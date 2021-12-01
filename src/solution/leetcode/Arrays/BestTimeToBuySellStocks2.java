package solution.leetcode.Arrays;

public class BestTimeToBuySellStocks2 {
    static int maxProfit(int[] prices) {
        int totalProfit=0;
        int min = Integer.MAX_VALUE;
        int max=0;

        for (int i = 0; i < prices.length; i++) {
            min = Integer.min(min,prices[i]);
            int profit = prices[i] - min;
            if(profit > max){
                max = profit;
            }
            if(profit < max && max !=0){
                totalProfit += max;
                min=prices[i];
                max=0;
            }
        }

        totalProfit +=max;

        return totalProfit;
    }
}
