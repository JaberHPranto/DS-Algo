package solution.leetcode.Arrays;

public class BestTimeToBuySellStocks {
    public int maxProfit(int[] prices) {
//         have to find a min number on left side of array to buy the stock
//         then traverse through the array to find profit

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            min = Integer.min(min,prices[i]);

            if(prices[i]-min > profit)
                profit = prices[i]-min;
        }

        return profit;
    }
}
