package LeetCode.Array.easy;

public class BestPrice {

    /*
    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
    However, you can buy it then immediately sell it on the same day.

    Find and return the maximum profit you can achieve.
     */


    public static void main(String[] args){

        System.out.println(maxProfit(new int[]{4, 1, 100, 555}));
    }

    public static int maxProfit(int[] prices) {
        return countProfit(prices, 0);
    }

    public static int countProfit(int[] prices, int start) {
        int count = 0;
        int min = prices[start];
        for(int i = start+1; i < prices.length; i++){
            if(min < prices[i]){
                count += prices[i] - min;
            }
            return countProfit(prices, i) + count;
        }
        return count;
    }
}
