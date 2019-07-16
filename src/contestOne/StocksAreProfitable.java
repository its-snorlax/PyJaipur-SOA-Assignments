package contestOne;

public class StocksAreProfitable {
    public static void main(String[] args) {
        int[] input = new int[]{2,100,150,120};
        System.out.println(maxProfit(input));
    }

    private static int maxProfit(int[] stockprices) {
        int min=stockprices[0],maximumProfit = 0;
        for (int i=0;i<stockprices.length;i++){
            if(stockprices[i] < min){
                min = stockprices[i];
            }
            if(maximumProfit<(stockprices[i]-min)){
                maximumProfit = stockprices[i]-min;
            }
        }
        return maximumProfit;
    }
}
