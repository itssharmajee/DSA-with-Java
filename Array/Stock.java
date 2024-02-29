package Array;

public class Stock {

    // this function will return the max profit of the stock 
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        System.out.println(buyAndSellStock(prices));
    }
}
