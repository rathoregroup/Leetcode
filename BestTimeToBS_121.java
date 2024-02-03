public class BestTimeToBS_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
    }

    static int maxProfit(int[] prices) {
        int b = prices[0];
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++){
            if (b > prices[i]){
                b = prices[i];
            }
            else if (prices[i] - b > max_profit){
                max_profit = prices[i] - b;
            }
        }
        return max_profit;
    }
}
