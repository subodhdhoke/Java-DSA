public class main1 {
    public static int stock(int[] prices) {
        int maxprofit = 0;
        int buyprice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];
            } else{
                int profit = prices[i]-buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stock(prices));
    }
}