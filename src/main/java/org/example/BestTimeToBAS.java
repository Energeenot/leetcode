package org.example;

public class BestTimeToBAS {
    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        BestTimeToBAS bs = new BestTimeToBAS();
        bs.maxProfit(prices);
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
}
