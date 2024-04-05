package array;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150

YouTube: https://www.youtube.com/watch?v=34WE6kwq49U
https://www.youtube.com/watch?v=Q7v239y-Tik
 */
public class BuySellStocks2 {

    public  static void main(String[] a) {
        //int[] prices  = {7,1,5,3,6,4};
       // int[] prices  = {7,6,4,3,1};
        int[] prices  = {3,1,4,8,7,2,5};
        System.out.println("Max Profit: " + maximumProfit(prices));
    }

    private static int maximumProfit(int[] stockPrices) {
        int maxProfit = 0;
        for (int i=1 ; i<stockPrices.length; i++) {
            if (stockPrices[i]> stockPrices[i-1]){
                maxProfit += stockPrices[i] - stockPrices[i-1];
            }
        }
        return maxProfit;
    }


}
