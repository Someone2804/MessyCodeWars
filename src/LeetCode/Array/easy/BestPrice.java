package LeetCode.Array.easy;

public class BestPrice {

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
