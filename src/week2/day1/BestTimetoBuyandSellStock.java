package week2.day1;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int maximumProfit=0;
        for(int i=0; i<prices.length-1;i++){
            for(int j=i+1; j<prices.length;j++){
                int currentProfit = prices[j] - prices[i];
                if(currentProfit > maximumProfit){
                    maximumProfit = currentProfit;
                }
            }
        }
        return maximumProfit;
    }
}
