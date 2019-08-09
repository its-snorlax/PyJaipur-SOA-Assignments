package week4.day16and17;

public class StocksAreProfitableLeetCode {
    public static void main(String[] args) {
        int[] input = new int[]{2,100,150,120};
        System.out.println(maxProfit(input));
    }

    private static int maxProfit(int[] prices) {
        if (prices.length == 0 ){
            return 0;
        }
        int min=prices[0],maximumProfit = 0;
        for (int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(maximumProfit<(prices[i]-min)){
                maximumProfit = prices[i]-min;
            }
        }
        return maximumProfit;
    }
}
