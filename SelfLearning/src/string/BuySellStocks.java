package string;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

YouTube: https://www.youtube.com/watch?v=34WE6kwq49U

Brute force Approach:
have two for loop. Outer loop will go through the array and inner loop will calculate the profit with rest of the array elements.

Another approach:
 Prepare an auxilary array. Start from last of the array and compare what is maximum value on each day. Once auxilary is prepared
 we will know what is the maximum going forward. Loop the the array an for each element check the auxilary array and fins out the diff

 */
public class BuySellStocks {

    public  static void main(String[] a) {
        //int[] prices  = {7,1,5,3,6,4};
       // int[] prices  = {7,6,4,3,1};
        int[] prices  = {3,1,4,8,7,2,5};
        System.out.println("Max Profit: " + maximumProfit(prices));
    }

    private static int maximumProfit(int[] stockPrices) {
        int minPrice = stockPrices[0];
        int maxProfit = 0;
        for (int stock: stockPrices) {
            minPrice = Math.min(minPrice, stock);
            int profit = stock - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }


}
