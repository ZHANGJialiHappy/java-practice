public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minBuyPrice= prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            int currentProfit=prices[i]-minBuyPrice;
            if(currentProfit > maxProfit){
                maxProfit=currentProfit;
            }

            if(prices[i]<minBuyPrice){
                minBuyPrice=prices[i];
            }
        }

        return maxProfit;      

    }

    public static void main(String[] args) {
        int[] prices = { 7,1,5,3,6,4};
        MaxProfit a = new MaxProfit();

        System.out.println(a.maxProfit(prices));
    }

}
